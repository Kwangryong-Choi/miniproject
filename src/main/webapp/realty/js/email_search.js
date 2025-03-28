function email_search(){
	if(em_sc_f.sc_user_name.value == ""){
		alert("이름을 입력해주세요.");
	}else if(em_sc_f.sc_phone_num.value == ""){
		alert("전화번호를 입력해주세요.");
	}else if(isNaN(em_sc_f.sc_phone_num.value)){
		alert("숫자만 입력해주세요.");
	}else{
		em_sc_f.submit();
	}
}