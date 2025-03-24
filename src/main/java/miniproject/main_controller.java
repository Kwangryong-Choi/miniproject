package miniproject;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class main_controller {
	@Resource(name="memberjoin_DAO")
	private memberjoin_DAO dao;
	
	@Resource(name="memberjoin_DTO")
	private memberjoin_DTO dto;
	
	@PostMapping("/realty/join_ok.do")
	public String memberjoin_ok(memberjoin_DTO dto, Model m){
		try {
			int result = this.dao.member_insert(dto);
			String msg = "";
			if(result > 0) {
				msg = "alert('과정 개설이 올바르게 생성되었습니다.');"
						+ "location.href='./realty/email_search';";
			}
			m.addAttribute("msg",msg);
		} catch (Exception e) {
			
		}finally {
			
		}
		return null;
	}
}
