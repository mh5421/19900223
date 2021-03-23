package hello.core.autowired;

import hello.core.member.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.lang.Nullable;

import java.util.Optional;

public class AutoWiredTest {

    @Test
    void AutowiredOption(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(TestBean.class);
    }

    static class TestBean{

        //required가 false면 메소드 자체가 호출이 안된다.
        @Autowired(required = false)
        public void setNoBean1(Member noBean1){
            System.out.println("nobean1 = " + noBean1);
        }

        //@Nullable을 넣어주면 호출은 하지만 null값이 들어가있다.
        @Autowired
        public void setNoBean2(@Nullable Member noBean2){
            System.out.println("nobean2 = " + noBean2);
        }

        //Optional의 값을 호출한다.
        @Autowired
        public void setNoBean3(Optional<Member> noBean3){
            System.out.println("nobean3 = " + noBean3);
        }

    }

}
