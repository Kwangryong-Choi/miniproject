function logincheck(){
	if(lo_f.lemail.value == ""){
		alert("이메일을 입력해주세요.");
	}else if(lo_f.lpass.value == ""){
		alert("비밀번호를 입력해주세요.");
	}else{
		lo_f.submit();
	}
}