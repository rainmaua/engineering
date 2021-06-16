package service.member;

import model.MemberDTO;

public class MemberPwChangeService {
	public void pwOk(String userId, String newPw) {
		@Autowired
		MemberRepository memberRepository;
		public void pwOk(String userId, String newPw) {
			MemberDTO dto = new MemberDTO();
			dto.setMembId(userId);
			dto.setMembPw(newPw);
			memberRepository.pwChange(dto); 
		}
	}
}
