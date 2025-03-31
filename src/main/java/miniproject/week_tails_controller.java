package miniproject;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class week_tails_controller {
	@Resource(name="memberjoin_DAO")
	private memberjoin_DAO dao;
	
	@Resource(name="memberjoin_DTO")
	private memberjoin_DTO dto;
	
	
	@GetMapping("/realty/week_tails1.do")
	public String week_tails1(memberjoin_DTO dto, Model m) {
		memberjoin_DTO weekinfo = this.dao.weekinfo(dto);
		m.addAttribute("weekinfo",weekinfo);
		return "/realty/week_tails";
	}
}
