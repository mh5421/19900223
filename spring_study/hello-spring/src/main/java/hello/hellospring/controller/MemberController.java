package hello.hellospring.controller;

import hello.hellospring.domain.Member;
import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class MemberController {

    //디팬던시 인젝트 - 자동의존관계 설정
   private final MemberService memberService;

    //공통된 기능을 여러곳에서 사용할 경우 스프링컨테이너에 등록해서 사용하고 객체를 매번 생성할 필요가 없다.
   @Autowired
   public MemberController(MemberService memberService) {
        this.memberService = memberService;
   }


   @GetMapping("/members/new")
   public String createForm(){
       return "members/createMemberForm";
   }

   @PostMapping("/members/new")
   public String create(MemberForm form){
       Member member = new Member();
       member.setName(form.getName());

       System.out.println("member.getName() = " + member.getName());

       memberService.join(member);

       return "redirect:/";
   }

   @GetMapping("/members")
   public String List(Model model){
       List<Member> members = memberService.findMembers();
       model.addAttribute("members",members);
       return "members/memberList";
   }


}
