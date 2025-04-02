package miniproject;

import org.springframework.stereotype.Repository;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Repository("memberjoin_DTO")
public class memberjoin_DTO {
	int midx;
	String email, password, user_name, phone_num, ad_required, ad_use, today;
	String lemail, lpass;
	String sc_user_name, sc_phone_num;
	String sc_email;
	String pr_password, ch_password;
	int cidx;
	String c_name, c_email, c_phonenum, c_lease, c_living, c_day, c_counsel, c_today;
	
	int ti_idx, ti_price, ti_num;
	String ti_title, ti_address, ti_apt, ti_part, sell_day, in_day, ti_img, ti_heat, structure, present;
	
	int rv_idx;
	String rv_title, rv_day, rv_time, rv_name, rv_radio, rv_phonenum, rv_today;
}