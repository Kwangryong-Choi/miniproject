package miniproject;

import org.springframework.stereotype.Repository;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Repository("memberjoin_DTO")
public class memberjoin_DTO {
	int midx;
	String email, password, user_name, phone_num, ad_use, today;
}