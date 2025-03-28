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
	public String memberjoin_ok(memberjoin_DTO dto, HttpServletResponse res){
		res.setContentType("text/html;charset=utf-8");
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
//			System.out.println(result);
			
			this.pw = res.getWriter();
			
			if(result == 0) {
				this.pw.write("<script>"
						+ "alert('회원가입 되지 않았습니다. 이미 가입된 휴대폰번호 입니다.);"
						+ "history.go(-1);"
						+ "</script>");
			}else if(result > 0) {
				this.pw.write("<script>"
						+ "alert('회원가입 되었습니다. 로그인 페이지로 이동합니다.');"
						+ "location.href='./login.jsp';"
						+ "</script>");
			}
		} catch (Exception e) {
			
		}finally {
			this.pw.close();
		}
		return null;
	}
	
	
	@PostMapping("/realty/email_check.do")
	public String email_check(memberjoin_DTO dto, @RequestParam("email") String email, HttpServletResponse res) {
		res.setContentType("text/html;charset=utf-8");
		memberjoin_DTO email_check = this.dao.email_check(dto.email);
		try {
			this.pw = res.getWriter();
			if(email_check != null) {
				this.pw.write("<script>"
						+ "alert('사용 불가능한 아이디입니다.');"
						+ "</script>");
			}else {
				this.pw.write("<script>"
						+ "alert('사용 가능한 아이디입니다.');"
						+ "</script>");
			}
			
		} catch (Exception e) {
			
		}finally {
			this.pw.close();
		}
		return "/realty/member_join";
	}
	
	
	@PostMapping("/realty/login_ok.do")
	public String login_ok(memberjoin_DTO dto, HttpServletResponse res) throws Exception {
		res.setContentType("text/html;charset=utf-8");
		memberjoin_DTO login_ok = this.dao.login_ok(dto.lemail, dto.lpass);
		
		this.pw = res.getWriter();
		if(login_ok != null) {
			this.pw.print("<script>"
					+ "alert('정상적으로 로그인되었습니다.');"
					+ "location.href='./index.jsp';"
					+ "</script>");
		}else {
			this.pw.print("<script>"
					+ "alert('이메일과 비밀번호를 정확히 입력해주세요.');"
					+ "history.go(-1);"
					+ "</script>");
		}
		this.pw.close();
		
		return null;
	}
	
	@PostMapping("/realty/email_search.do")
	public String email_search(memberjoin_DTO dto, Model m) {
		memberjoin_DTO search_ok = this.dao.email_search(dto.sc_user_name, dto.sc_phone_num);
		String msg = null;
		
		if(search_ok != null) {
			msg = search_ok.email;
		}else {
			msg = "확인되지 않는 이름과 전화번호 입니다.";
		}
		
		m.addAttribute("msg", msg);
		
		return "/realty/search_myinfo";
	}
	
	@PostMapping("/realty/passwd_search.do")
	public String passwd_search(memberjoin_DTO dto, Model m) {
		memberjoin_DTO search_ok = this.dao.passwd_search(dto.sc_email, dto.sc_phone_num);
		String msg = null;
		
		if(search_ok != null) {
			msg = search_ok.password;
		}else {
			msg = "확인되지 않는 이메일과 전화번호 입니다.";
		}
		
		m.addAttribute("msg", msg);
		
		return "/realty/search_myinfo2";
	}
	
	@PostMapping("/realty/change_passwd.do")
	public String change_passwd(memberjoin_DTO dto, Model m) {
		memberjoin_DTO passwd_check = this.dao.passwd_check(dto.pr_password);
		String msg = null;
		
		if(passwd_check != null) {
			this.dao.passwd_change(dto);
			msg = dto.ch_password;
		}else {
			msg = "비밀번호를 정확히 입력해주세요.";
		}
		
		m.addAttribute("msg", msg);
		
		return "/realty/search_myinfo3";
	}
	
	
	
	public String macbook_login() {
		String pw = "a123456";
		
		String result = this.md5_make(pw);
		System.out.println(result);
		
		return null;
	}
	
	
}
