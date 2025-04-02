package miniproject;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

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
	
	
	
	@PostMapping("/realty/counsel.do")
	public String counsel(memberjoin_DTO dto, HttpServletResponse res, @RequestParam(name = "c_lease",required = false) ArrayList<String> lease, 
			@RequestParam(name = "c_living", required = false) ArrayList<String> living) {
		res.setContentType("text/html;charset=utf-8");
//		System.out.println(c_data);
		
		try {
			this.pw = res.getWriter();
			String c_lease = String.join(",", lease);
			String c_living = String.join(",", living);
			int counsel_insert = 0;
			Map<String, String> c_data = new HashMap<String, String>();
			c_data.put("c_name", dto.c_name);
			c_data.put("c_email", dto.c_email);
			c_data.put("c_phonenum", dto.c_phonenum);
			c_data.put("c_lease", c_lease);
			c_data.put("c_living", c_living);
			c_data.put("c_day", dto.c_day);
			c_data.put("c_counsel", dto.c_counsel);
			counsel_insert = this.dao.counsel_insert(c_data);
			if(counsel_insert > 0) {
				this.pw.print("<script>"
						+ "alert('정상적으로 상담신청이 되었습니다.');"
						+ "location.href='./index.jsp';"
						+ "</script>");
			}else {
				this.pw.print("<script>"
						+ "alert('오류가 발생했습니다 다시 정확히 입력해주세요.');"
						+ "history.go(-1);"
						+ "</script>");
			}
			
		} catch (Exception e) {
			
		}finally {
			this.pw.close();
		}
		
		return null;
	}
	
	
	@PostMapping("/realty/reservation.do")
	public String reservation(memberjoin_DTO dto, Model m,
			@RequestParam(name = "rv_name",required = false) String rv_name) {

		int reservation_insert = this.dao.reservation_insert(dto);
		if(reservation_insert > 0) {
			memberjoin_DTO rv_select = this.dao.reservation_select(rv_name);
			m.addAttribute("rv_title", rv_select.rv_title);
			m.addAttribute("rv_day", rv_select.rv_day);
			m.addAttribute("rv_time", rv_select.rv_time);
			m.addAttribute("rv_name", rv_select.rv_name);
			m.addAttribute("rv_radio", rv_select.rv_radio);
			m.addAttribute("rv_phonenum", rv_select.rv_phonenum);
		}else {
			
		}
		
		return "/realty/reservation_check";
	}
	
	
	@PostMapping("/realty/md_board_ok.do")
	public String bannerok(@ModelAttribute(name = "dto") memberjoin_DTO dto, MultipartFile bfile,
			HttpServletRequest req) throws Exception {
		String file_new = null;
		
		if(bfile.getSize() > 0) {
			
			// 웹 디렉토리 개발자가 생성한 파일명으로 저장하는 코드
			String url = req.getServletContext().getRealPath("/upload/");
			System.out.println(url);
		}
		
//		System.out.println(this.callback);
		
		return null;
	}
	
	
}
