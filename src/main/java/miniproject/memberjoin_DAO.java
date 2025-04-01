package miniproject;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository("memberjoin_DAO")
public class memberjoin_DAO implements memberjoin_mapper {
	
	@Resource(name="template")
	public SqlSessionTemplate st;
	
	public int member_insert(memberjoin_DTO dto) {
		int result = this.st.insert("member_insert",dto);
		
//		System.out.println(result);
//		System.out.println("memberjoin_DAO.java로 값 옴");
		return result;
	}
	
	@Override
	public memberjoin_DTO email_check(String email) {
		memberjoin_DTO email_check = this.st.selectOne("email_check",email);
		return email_check;
	}
	
	@Override
	public memberjoin_DTO login_ok(String lemail, String lpass) {
		Map<String, String> data = new HashMap<String, String>();
		data.put("lemail", lemail);
		data.put("lpass", lpass);
		
		memberjoin_DTO login_ok = this.st.selectOne("login_ok", data);
		return login_ok;
	}
	
	@Override
	public memberjoin_DTO email_search(String sc_user_name, String sc_phone_num) {
		Map<String, String> data = new HashMap<String, String>();
		data.put("sc_user_name", sc_user_name);
		data.put("sc_phone_num", sc_phone_num);
		
		memberjoin_DTO search_ok = this.st.selectOne("email_search", data);
		return search_ok;
	}
	
	@Override
	public memberjoin_DTO passwd_search(String sc_email, String sc_phone_num) {
		Map<String, String> data = new HashMap<String, String>();
		data.put("sc_email", sc_email);
		data.put("sc_phone_num", sc_phone_num);
		
		memberjoin_DTO search_ok = this.st.selectOne("passwd_search", data);
		return search_ok;
	}
	
	@Override
	public memberjoin_DTO passwd_check(String pr_password) {
		memberjoin_DTO passwd_check = this.st.selectOne("passwd_check", pr_password);
		return passwd_check;
	}
	
	@Override
	public int passwd_change(memberjoin_DTO dto) {
		int passwd_change = this.st.update("passwd_update", dto);
		return passwd_change;
	}
	
	@Override
	public int counsel_insert(Map<String, String> c_data) {
		int counsel_insert = this.st.insert("counsel_insert", c_data);
		return counsel_insert;
	}
}
