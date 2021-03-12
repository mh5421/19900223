package hello.hellospring.repository;

import hello.hellospring.domain.Member;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.*;
/*
    Test로 먼저 구현 틀을 먼저 만들고 개발하는것을 TTD, 테스트주도개발이라고 한다.
    몇만줄의 코딩의 경우 Test없이 개발하기 정말 힘들어서 Test기능을 깊이 있게 제대로 알아놔야한다.
    Test는 서로 순서와 관계없이 의존관계와 상관없이 설계되어야 한다. 그러므로 하나의 테스트가 끝날때마다 저장소나 공용 데이터를 초기화해야한다.
*/
public class MemoryMemberRepositoryTest {

    MemoryMemberRepository repository = new MemoryMemberRepository();

    @AfterEach
    public void afterEach(){ //메소드가 실행이 끝날때마다 동작하는 콜백메소드
    repository.clearStore();
    }

    @Test
    public void save(){
        Member member = new Member();
        member.setName("spring");

        repository.save(member);

        Member result = repository.findById(member.getId()).get();
        //Assertions.assertEquals(result, member);
        assertThat(member).isEqualTo(result);
    }

    @Test
    public void findByName(){
        Member member1 = new Member();
        member1.setName("spring1");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("spring2");
        repository.save(member2);

        Member result = repository.findByName("spring1").get();

        assertThat(result).isEqualTo(member1);

    }

    @Test
    public void findAll() {
        Member member1 = new Member();
        member1.setName("spring1");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("spring2");
        repository.save(member2);

        List<Member> result = repository.findAll();

        assertThat(result.size()).isEqualTo(2);
    }


}
