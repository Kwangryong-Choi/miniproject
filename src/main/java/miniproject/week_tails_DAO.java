package miniproject;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository("week_tails_DAO")
public class week_tails_DAO implements week_tails_mapper {
	@Resource(name="template")
	public SqlSessionTemplate st;
	
	@Override
	public memberjoin_DTO weekinfo1(memberjoin_DTO dto) {
		memberjoin_DTO weekinfo1 = this.st.selectOne("select_weekinfo1", dto);
		return weekinfo1;
	}
	@Override
	public memberjoin_DTO weekinfo2(memberjoin_DTO dto) {
		memberjoin_DTO weekinfo2 = this.st.selectOne("select_weekinfo2", dto);
		return weekinfo2;
	}
	@Override
	public memberjoin_DTO weekinfo3(memberjoin_DTO dto) {
		memberjoin_DTO weekinfo3 = this.st.selectOne("select_weekinfo3", dto);
		return weekinfo3;
	}
	@Override
	public memberjoin_DTO weekinfo4(memberjoin_DTO dto) {
		memberjoin_DTO weekinfo4 = this.st.selectOne("select_weekinfo4", dto);
		return weekinfo4;
	}
	@Override
	public memberjoin_DTO weekinfo5(memberjoin_DTO dto) {
		memberjoin_DTO weekinfo5 = this.st.selectOne("select_weekinfo5", dto);
		return weekinfo5;
	}
	@Override
	public memberjoin_DTO weekinfo6(memberjoin_DTO dto) {
		memberjoin_DTO weekinfo6 = this.st.selectOne("select_weekinfo6", dto);
		return weekinfo6;
	}
	@Override
	public memberjoin_DTO weekinfo7(memberjoin_DTO dto) {
		memberjoin_DTO weekinfo7 = this.st.selectOne("select_weekinfo7", dto);
		return weekinfo7;
	}
	@Override
	public memberjoin_DTO weekinfo8(memberjoin_DTO dto) {
		memberjoin_DTO weekinfo8 = this.st.selectOne("select_weekinfo8", dto);
		return weekinfo8;
	}
}
