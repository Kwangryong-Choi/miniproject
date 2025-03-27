package miniproject;

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
	
	
}
