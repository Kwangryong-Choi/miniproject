package miniproject;

import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class main_controller extends md5_pass {
	PrintWriter pw = null;
	
	@Resource(name="memberjoin_DAO")
	private memberjoin_DAO dao;
	
	@Resource(name="memberjoin_DTO")
	private memberjoin_DTO dto;
	
	
	
	@PostMapping("/realty/join_ok.do")
	public String memberjoin_ok(memberjoin_DTO dto, Model m){
		/*
		System.out.println(dto.getMidx());
		System.out.println(dto.getEmail());
		System.out.println(dto.getPassword());
		System.out.println(dto.getUser_name());
		System.out.println(dto.getPhone_num());
		System.out.println(dto.getAd_required());
		System.out.println(dto.getAd_use());
		System.out.println(dto.getToday());
		*/
		try {
//			System.out.println(this.dao.member_insert(dto));
			int result = this.dao.member_insert(dto);
			System.out.println(result);
			
			String msg = "";
			if(result == 1) {
				this.pw.write("<script>"
						+ "alert('사용 가능한 아이디 입니다.');"
						+ "location.href='./member_join.jsp';"
						+ "</script>");
				System.out.println(msg);
				m.addAttribute("msg", msg);
			}
		} catch (Exception e) {
			
		}finally {
			this.pw.close();
		}
		return null;
	}
	
	
	@PostMapping("/realty/email_check.do")
	public String email_check(memberjoin_DTO dto, HttpServletResponse res, @RequestParam("email") String email) {
		try {
			memberjoin_DTO email_check = this.dao.email_check(dto.email);
			this.pw = res.getWriter();
			if(email_check.email == email) {
				this.pw.write("<script>"
						+ "alert('사용 불가능한 아이디입니다.');"
						+ "history.go(-1);"
						+ "</script>");
			}else {
				this.pw.write("<script>"
						+ "alert('사용 불가능한 아이디입니다.');"
						+ "history.go(-1);"
						+ "</script>");
			}
		} catch (Exception e) {
			this.pw.write("<script>"
					+ "alert('사용 가능한 아이디입니다.');"
					+ "location.href='./realty/member_join.do';"
					+ "</script>");
		}finally {
			this.pw.close();
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
