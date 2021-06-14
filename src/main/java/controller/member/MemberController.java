package controller.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import command.MemberCommand;
import service.member.MemberJoinService;
@Controller
public class MemberController {
	@Autowired
	MemberJoinService memberJoinService; 
	@RequestMapping("/member/agree")
	public String agree() {
		return "member/agree"; 
	}
	@RequestMapping("/member/memReget")
	public String memReget() {
		return "member/memberForm"; 
	}
	@RequestMapping(value="/member/memJoin", method= RequestMethod.POST)
	public String memJoin(MemberCommand memberCommand) {
		memberJoinService.memberInsert(memberCommand);
		System.out.println(memberCommand.getMembAddr());
		return "redirect:../main";
	}
	public String memList() {
		return "member/memberList";
	}
	@RequestMapping("memList")
	public String memList(Model model) {
		memberListService.memList(model);
		return "member/memberList"; 
	}
}
