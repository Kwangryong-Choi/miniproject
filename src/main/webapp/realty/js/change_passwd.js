function change_passwd(){
	if(pw_ch_f.pr_password.value == ""){
		alert("현재 비밀번호를 입력해주세요.");
	}else if(pw_ch_f.ch_password.value == ""){
		alert("변경할 비밀번호를 입력해주세요.");
	}else{
		pw_ch_f.submit();
	}
}