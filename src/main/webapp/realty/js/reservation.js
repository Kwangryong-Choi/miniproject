function rv_submit(){
	if(rv_f.rv_day.value == ""){
		alert("방문일시를 선택해주세요.");
	}else if(rv_f.rv_time.value == ""){
		alert("방문시간을 선택해주세요.")
	}else if(rv_f.rv_name.value == ""){
		alert("이름을 입력해주세요.")
	}else if(rv_f.rv_radio.value == ""){
		alert("방문인원을 선택해주세요.")
	}else if(rv_f.rv_phonenum.value == ""){
		alert("전화번호를 선택해주세요.")
	}else{
		rv_f.submit();
	}
}

// 지나간 날짜 제외하는 법
function datecheck(){
	var day = new Date();
	var edate = day.getFullYear() + day.getMonth() + 1 + day.getDate();
	console.log(edate);
	var sdate = frm.rdate.value.replaceAll("-","");
	var sdate = date.teoISOSString().split('T')[0];
	console.log(sdate);
	
	if(edate < sdate){
		alert("해당 날짜 선택을 잘못하셨습니다.");
	}else{
		var t = date.getHours()+""+date.getMinutes().padStart(2,"0");	// 현재시간
		console.log(t);	// 165
		var ut = frm.rtime.value + "" + 00;	// 사용자가 선택한 시간
		if(t > ut){
			alert("현재 선택한 시간은 이미 예매가 끝났습니다.");
		}else{
			alert("예매하시겠습니까?");
		}
	}
}