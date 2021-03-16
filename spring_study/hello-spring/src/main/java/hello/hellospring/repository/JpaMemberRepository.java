package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

public class JpaMemberRepository implements MemberRepository{

    //JPA 쓰려면 EntityManager를 주입받아야 한다.
    private final EntityManager em;

    public JpaMemberRepository(EntityManager em) {
        this.em = em;
    }

    @Override
    public Member save(Member member) {
        em.persist(member);
        //persist : 영속하다, 영구 저장하다.
        //JPA가 쿼리를 생성해서 셋팅까지해준다
        return member;
    }

    @Override
    public Optional<Member> findById(Long id) {
        Member member = em.find(Member.class, id);
        return Optional.ofNullable(member);
    }

    @Override
    public Optional<Member> findByName(String name) {
        List<Member> result = em.createQuery("select m from Member m where m.name = :name", Member.class)
                .setParameter("name", name)
                .getResultList();
        return result.stream().findAny();
    }

    @Override
    public List<Member> findAll() {
        //JPQL : 테이블 대상이 아닌 객체(entity)를 대상으로 쿼리를 보내면 sql로 번역이 된다.
        return em.createQuery("select m from Member m", Member.class).getResultList();
    }
}
