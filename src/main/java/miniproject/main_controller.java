package miniproject;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class main_controller extends md5_pass {
	@Resource(name="memberjoin_DAO")
	private memberjoin_DAO dao;
	
	@Resource(name="memberjoin_DTO")
	private memberjoin_DTO dto;
	
	
	
	@PostMapping("/realty/join_ok.do")
	public String memberjoin_ok(memberjoin_DTO dto, Model m){
		System.out.println(dto.getMidx());
		System.out.println(dto.getEmail());
		System.out.println(dto.getPassword());
		System.out.println(dto.getUser_name());
		System.out.println(dto.getPhone_num());
		System.out.println(dto.getAd_required());
		System.out.println(dto.getAd_use());
		System.out.println(dto.getToday());
		try {
//			System.out.println(this.dao.member_insert(dto));
			int result = this.dao.member_insert(dto);
//			System.out.println(result);
			String msg = "";
			if(result > 0) {
				msg = "alert('회원가입이 정상적으로 되었습니다.');"
						+ "location.href='./email_search.do';";
			}
			m.addAttribute("msg", msg);
		} catch (Exception e) {
			String msg = "";
			msg = "alert('회원가입이 정상적으로 되었습니다.');"
					+ "location.href='./email_search.do';";
		}finally {
			
		}
		return null;
	}
	
	
	
	public String macbook_login() {
		String pw = "a123456";
		
		String result = this.md5_make(pw);
		System.out.println(result);
		
		return null;
	}
}
