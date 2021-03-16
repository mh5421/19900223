package hello.hellospring.service;

import hello.hellospring.domain.Member;
import hello.hellospring.repository.MemberRepository;
import hello.hellospring.repository.MemoryMemberRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
@Transactional
class MemberServiceIntegrationTest {

    //외부에서 MemoryMemberRepository를 넣어주는데 이런 문법을 디펜던시 인젝션 = DI라고 한다.
    @Autowired MemberService memberService;
    @Autowired MemberRepository memberRepository;



    //Test는 한글로 이름을 적어도 된다. 빌드 될때 Test코드는 포함되지 않는다.
    @Test
    void 회원가입() {
        //Test는 거의 given when then구조를 기반으로 검증을 한다. 때문에 Test코드가 길어도 주석으로 구분이 쉽다.
        //given
        Member member = new Member();
        member.setName("spring");

        //when
        Long saveId = memberService.join(member);

        //then
        Member findMember = memberService.findOne(saveId).get();
        assertThat(member.getName()).isEqualTo(findMember.getName());
    }

    //Test는 예외처리 로직이 정상처리보다 더 중요하다. 꼭 예외처리가 되는것도 확인해야한다.
    @Test
    public void 중복_회원_예외(){
        //given
        Member member1 = new Member();
        member1.setName("spring");

        Member member2 = new Member();
        member2.setName("spring");

        //when
        memberService.join(member1);
        //try-catch를 사용하여 예외처리를 하는 방법
        //try-catch는 길고 직관적이지 못하여 더 좋은 문법을 사용
/*

        try{
            memberService.join(member2);
            fail("예외가 발생해야 합니다");

        } catch(IllegalStateException e){
            assertThat(e.getMessage()).isEqualTo("이미 존재하는 회원입니다.123123");
        }
*/

        IllegalStateException e = assertThrows(IllegalStateException.class, () -> memberService.join(member2));

        assertThat(e.getMessage()).isEqualTo("이미 존재하는 회원입니다.");

        //then

    }

}