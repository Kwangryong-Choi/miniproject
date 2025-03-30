function submit_counsel(){
	if(f_counsel.c_name.value == ""){
		alert("상담자명을 입력해주세요.");
	}else if(f_counsel.c_email.value == ""){
		alert("이메일을 입력해주세요.");
	}else if(f_counsel.c_phonenum.value == ""){
		alert("연락처를 입력해주세요.");
	}else if(isNaN(f_counsel.c_phonenum.value)){
		alert("연락처는 숫자만 입력해주세요.");
	}else if(f_counsel.c_lease[0].checked == false && f_counsel.c_lease[1].checked == false && f_counsel.c_lease[2].checked == false && f_counsel.c_lease[3].checked == false){
		alert("임대형태를 1개 이상 선택해주세요.");
	}else if(f_counsel.c_living[0].checked == false && f_counsel.c_living[1].checked == false && f_counsel.c_living[2].checked == false){
		alert("주거형태를 1개 이상 선택해주세요.");
	}else if(f_counsel.c_day.value == ""){
		alert("상담일시를 선택해주세요.");
	}else if(f_counsel.c_counsel.value == ""){
		alert("상담내용을 입력해주세요.");
	}else if(f_counsel.c_counsel.value.length < 10){
		alert("상담내용은 최소 10자 이상 입력해주세요.");
	}else{
		f_counsel.submit();
	}
}