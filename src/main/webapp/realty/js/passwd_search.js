function passwd_search(){
	if(pw_sc_f.sc_email.value == ""){
		alert("이메일을 입력해주세요.");
	}else if(pw_sc_f.sc_phone_num.value == ""){
		alert("전화번호를 입력해주세요.");
	}else if(isNaN(pw_sc_f.sc_phone_num.value)){
		alert("숫자만 입력해주세요.");
	}else{
		pw_sc_f.submit();
	}
}