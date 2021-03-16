package hello.hellospring.service;

import hello.hellospring.domain.Member;
import hello.hellospring.repository.MemberRepository;
import hello.hellospring.repository.MemoryMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Transactional
public class MemberService {

    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    /**
     * 회원가입
     */

    public Long join(Member member){
        //같은 이름이 있는 중복 회원X
        /**
         * Optional로 객체를 감싸서 사용할경우 null을 직접 다루지 않아도 된다.
         */
        //optional을 쓸때 optional을 바로 반환하는 방법은 권장하지 않는다.
        //Optional<Member> result = memberRepository.findByName(member.getName());

        /**
         *  Optional로 감쌋기때문에 사용할 수 있는 메소드
         *  ifPresent : 혹시 값이 있다면
         */

//        result.ifPresent(m ->{
//            throw new IllegalStateException("이미 존재하는 회원입니다.");
//        });


        //optional을 바로 반환하지 않고 사용하는 방법
        /*
        memberRepository.findByName(member.getName())
                    .ifPresent(m ->{
                        throw new IllegalStateException("이미 존재하는 회원입니다.");
                    });
        */

        //리팩토링하여 완성, 단축키 Ctrl+Alt+M
        validateDuplicateMember(member);//중복회원 검증


        memberRepository.save(member);
        return member.getId();
    }

    private void validateDuplicateMember(Member member) {
        memberRepository.findByName(member.getName())
                .ifPresent(m ->{
                    throw new IllegalStateException("이미 존재하는 회원입니다.");
                });
    }

    /**
     * 전체 회원 조회
     */
    public List<Member> findMembers(){
        return memberRepository.findAll();
    }

    public Optional<Member> findOne(Long memberId){
        return memberRepository.findById(memberId);
    }
}
