var password_check = document.getElementById("password_check");

function join_submit(){
	if(f.email.value==""){
		alert("이메일을 입력해주세요.")
	}else if(f.password.value==""){
		alert("비밀번호를 입력해주세요.")
	}else if(f.password.value != password_check.value){
		alert("비밀번호가 맞지 않습니다.")
	}else if(f.user_name.value==""){
		alert("이름을 입력해주세요.")
	}else if(f.phone_num.value==""){
		alert("전화번호를 입력해주세요.")
	}else if(isNaN(f.phone_num.value)){
		alert("숫자만 입력해주세요.");
	}else if(f.box1[0].checked==false || f.box1[1].checked==false || f.box1[2].checked==false){
		alert("필수 약관에 모두 동의해주세요.")
	}else{
		if(f.ad_use.checked == false){
			f.ad_use.value = "N";
		}else if(f.ad_use.checked == true){
			f.ad_use.value = "Y";
		}
		alert("해당 정보를 사이트에 반영하시겠습니까?");
		f.action = "./join_ok.do";
		f.submit();
	}
}

function allcheck(){
	var check_all = document.getElementById("check_all");
	var box1 = document.getElementsByName("box1");
	var ea = box1.length;
	for(var f=0; f<ea; f++){  //전체선택 클릭시 아래 체크박스 모두 선택되도록 작동 
		box1[f].checked = true ;  //같은 이름의 name값은 배열로 순차적으로 처리됨
	}
	if(check_all.checked == false){
		for(var f=0; f<ea; f++){  //전체선택 클릭시 아래 체크박스 모두 선택되도록 작동 
			box1[f].checked = false ;  //같은 이름의 name값은 배열로 순차적으로 처리됨
		}
	}
}

function not_all(){
	var check_all = document.getElementById("check_all");
	var box1 = document.getElementsByName("box1");
	var ea = box1.length;
	var ct=0;
	for(var ff=0; ff<ea; ff++){
		if(box1[ff].checked == true){
			ct++;
		}
	}
	if(ea == ct){  //
		check_all.checked = true;
	}else{
		check_all.checked = false;
	}
}

window.onload = function(){
	var http = new XMLHttpRequest;	// ajax 통신
	http.open("GET","./agree1.txt",false);	// GET 통신을 이용하여 해당 파일을 로드
	http.send();	// 통신 실행
	document.getElementById("ag1").innerHTML = http.response;	// HTML에 내용을 출력
	
//	var http2 = new XMLHttpRequest;
	http.open("GET","./agree2.txt",false);
	http.send();
	document.getElementById("ag2").innerHTML = http.response;
}