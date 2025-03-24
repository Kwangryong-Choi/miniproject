package miniproject;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface memberjoin_mapper {
	public int member_insert(memberjoin_DTO dto);
}
