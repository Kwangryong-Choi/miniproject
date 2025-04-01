package miniproject;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class week_tails_controller {
	@Resource(name="week_tails_DAO")
	private week_tails_DAO dao;
	
	@Resource(name="memberjoin_DTO")
	private memberjoin_DTO dto;
	
	
	@GetMapping("/realty/week_tails1.do")
	public String week_tails1(memberjoin_DTO dto, Model m) {
		memberjoin_DTO weekinfo = this.dao.weekinfo1(dto);
		m.addAttribute("ti_title",weekinfo.ti_title);
		m.addAttribute("ti_address",weekinfo.ti_address);
		m.addAttribute("ti_apt",weekinfo.ti_apt);
		m.addAttribute("ti_part",weekinfo.ti_part);
		m.addAttribute("sell_day",weekinfo.sell_day);
		m.addAttribute("in_day",weekinfo.in_day);
		m.addAttribute("ti_img",weekinfo.ti_img);
		m.addAttribute("ti_heat",weekinfo.ti_heat);
		m.addAttribute("ti_price",weekinfo.ti_price);
		m.addAttribute("ti_num",weekinfo.ti_num);
		m.addAttribute("structure",weekinfo.structure);
		m.addAttribute("present",weekinfo.present);
		return "/realty/week_tails";
	}
	
	@GetMapping("/realty/week_tails2.do")
	public String week_tails2(memberjoin_DTO dto, Model m) {
		memberjoin_DTO weekinfo = this.dao.weekinfo2(dto);
		m.addAttribute("ti_title",weekinfo.ti_title);
		m.addAttribute("ti_address",weekinfo.ti_address);
		m.addAttribute("ti_apt",weekinfo.ti_apt);
		m.addAttribute("ti_part",weekinfo.ti_part);
		m.addAttribute("sell_day",weekinfo.sell_day);
		m.addAttribute("in_day",weekinfo.in_day);
		m.addAttribute("ti_img",weekinfo.ti_img);
		m.addAttribute("ti_heat",weekinfo.ti_heat);
		m.addAttribute("ti_price",weekinfo.ti_price);
		m.addAttribute("ti_num",weekinfo.ti_num);
		m.addAttribute("structure",weekinfo.structure);
		m.addAttribute("present",weekinfo.present);
		return "/realty/week_tails";
	}
	
	@GetMapping("/realty/week_tails3.do")
	public String week_tails3(memberjoin_DTO dto, Model m) {
		memberjoin_DTO weekinfo = this.dao.weekinfo3(dto);
		m.addAttribute("ti_title",weekinfo.ti_title);
		m.addAttribute("ti_address",weekinfo.ti_address);
		m.addAttribute("ti_apt",weekinfo.ti_apt);
		m.addAttribute("ti_part",weekinfo.ti_part);
		m.addAttribute("sell_day",weekinfo.sell_day);
		m.addAttribute("in_day",weekinfo.in_day);
		m.addAttribute("ti_img",weekinfo.ti_img);
		m.addAttribute("ti_heat",weekinfo.ti_heat);
		m.addAttribute("ti_price",weekinfo.ti_price);
		m.addAttribute("ti_num",weekinfo.ti_num);
		m.addAttribute("structure",weekinfo.structure);
		m.addAttribute("present",weekinfo.present);
		return "/realty/week_tails";
	}
	
	@GetMapping("/realty/week_tails4.do")
	public String week_tails4(memberjoin_DTO dto, Model m) {
		memberjoin_DTO weekinfo = this.dao.weekinfo4(dto);
		m.addAttribute("ti_title",weekinfo.ti_title);
		m.addAttribute("ti_address",weekinfo.ti_address);
		m.addAttribute("ti_apt",weekinfo.ti_apt);
		m.addAttribute("ti_part",weekinfo.ti_part);
		m.addAttribute("sell_day",weekinfo.sell_day);
		m.addAttribute("in_day",weekinfo.in_day);
		m.addAttribute("ti_img",weekinfo.ti_img);
		m.addAttribute("ti_heat",weekinfo.ti_heat);
		m.addAttribute("ti_price",weekinfo.ti_price);
		m.addAttribute("ti_num",weekinfo.ti_num);
		m.addAttribute("structure",weekinfo.structure);
		m.addAttribute("present",weekinfo.present);
		return "/realty/week_tails";
	}
	
	@GetMapping("/realty/week_tails5.do")
	public String week_tails5(memberjoin_DTO dto, Model m) {
		memberjoin_DTO weekinfo = this.dao.weekinfo5(dto);
		m.addAttribute("ti_title",weekinfo.ti_title);
		m.addAttribute("ti_address",weekinfo.ti_address);
		m.addAttribute("ti_apt",weekinfo.ti_apt);
		m.addAttribute("ti_part",weekinfo.ti_part);
		m.addAttribute("sell_day",weekinfo.sell_day);
		m.addAttribute("in_day",weekinfo.in_day);
		m.addAttribute("ti_img",weekinfo.ti_img);
		m.addAttribute("ti_heat",weekinfo.ti_heat);
		m.addAttribute("ti_price",weekinfo.ti_price);
		m.addAttribute("ti_num",weekinfo.ti_num);
		m.addAttribute("structure",weekinfo.structure);
		m.addAttribute("present",weekinfo.present);
		return "/realty/week_tails";
	}
	
	@GetMapping("/realty/week_tails6.do")
	public String week_tails6(memberjoin_DTO dto, Model m) {
		memberjoin_DTO weekinfo = this.dao.weekinfo6(dto);
		m.addAttribute("ti_title",weekinfo.ti_title);
		m.addAttribute("ti_address",weekinfo.ti_address);
		m.addAttribute("ti_apt",weekinfo.ti_apt);
		m.addAttribute("ti_part",weekinfo.ti_part);
		m.addAttribute("sell_day",weekinfo.sell_day);
		m.addAttribute("in_day",weekinfo.in_day);
		m.addAttribute("ti_img",weekinfo.ti_img);
		m.addAttribute("ti_heat",weekinfo.ti_heat);
		m.addAttribute("ti_price",weekinfo.ti_price);
		m.addAttribute("ti_num",weekinfo.ti_num);
		m.addAttribute("structure",weekinfo.structure);
		m.addAttribute("present",weekinfo.present);
		return "/realty/week_tails";
	}
	
	@GetMapping("/realty/week_tails7.do")
	public String week_tails7(memberjoin_DTO dto, Model m) {
		memberjoin_DTO weekinfo = this.dao.weekinfo7(dto);
		m.addAttribute("ti_title",weekinfo.ti_title);
		m.addAttribute("ti_address",weekinfo.ti_address);
		m.addAttribute("ti_apt",weekinfo.ti_apt);
		m.addAttribute("ti_part",weekinfo.ti_part);
		m.addAttribute("sell_day",weekinfo.sell_day);
		m.addAttribute("in_day",weekinfo.in_day);
		m.addAttribute("ti_img",weekinfo.ti_img);
		m.addAttribute("ti_heat",weekinfo.ti_heat);
		m.addAttribute("ti_price",weekinfo.ti_price);
		m.addAttribute("ti_num",weekinfo.ti_num);
		m.addAttribute("structure",weekinfo.structure);
		m.addAttribute("present",weekinfo.present);
		return "/realty/week_tails";
	}
	
	@GetMapping("/realty/week_tails8.do")
	public String week_tails8(memberjoin_DTO dto, Model m) {
		memberjoin_DTO weekinfo = this.dao.weekinfo8(dto);
		m.addAttribute("ti_title",weekinfo.ti_title);
		m.addAttribute("ti_address",weekinfo.ti_address);
		m.addAttribute("ti_apt",weekinfo.ti_apt);
		m.addAttribute("ti_part",weekinfo.ti_part);
		m.addAttribute("sell_day",weekinfo.sell_day);
		m.addAttribute("in_day",weekinfo.in_day);
		m.addAttribute("ti_img",weekinfo.ti_img);
		m.addAttribute("ti_heat",weekinfo.ti_heat);
		m.addAttribute("ti_price",weekinfo.ti_price);
		m.addAttribute("ti_num",weekinfo.ti_num);
		m.addAttribute("structure",weekinfo.structure);
		m.addAttribute("present",weekinfo.present);
		return "/realty/week_tails";
	}
}
