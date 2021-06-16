package service.member;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import model.AuthInfo;
import repository.MemberRepository;
public class MemberDetailService {
	@Autowired
	MemberRepository memberRepository;
	public void memInfo(HttpSession session) {
		AuthInfo authInfo = 
				(AuthInfo)session.getAttribute("authInfo");
		String memId = authInfo.getUserId(); 
		MemberDTO dto = memberRepository.memInfo(memId);
		model.addAttribute("dto", dto);
	}
}
