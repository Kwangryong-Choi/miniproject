package miniproject;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface memberjoin_mapper {
	public int member_insert(memberjoin_DTO dto);
	
	public memberjoin_DTO email_check(String email);
	
	public memberjoin_DTO login_ok(String lemail, String lpass);
	
	public memberjoin_DTO email_search(String sc_user_name, String sc_phone_num);

	public memberjoin_DTO passwd_search(String sc_email, String sc_phone_num);
	
	public memberjoin_DTO passwd_check(String pr_password);

	public int passwd_change(memberjoin_DTO dto);
	
	public int counsel_insert(Map<String, String> c_data);
}
