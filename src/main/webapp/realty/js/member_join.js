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
	}else if(f.ad_re_box[0].checked==false || f.ad_re_box[1].checked==false || f.ad_re_box[2].checked==false){
		alert("필수 약관에 모두 동의해주세요.")
	}else{
		f.ad_required.value = "Y";
		// 체크박스는 체크되어 있지 않을 경우 value 속성을 사용하지 못하게 됨
		if(f.ad_use_check.checked == false){
			f.ad_use.value = "N";
		}else if(f.ad_use_check.checked == true){
			f.ad_use.value = "Y";
		}
		alert("해당 정보를 사이트에 반영하시겠습니까?");
		f.action = "./join_ok.do";
		f.submit();
	}
}

function allcheck(){
	var check_all = document.getElementById("check_all");
	var ad_re_box = document.getElementsByName("ad_re_box");
	var ea = ad_re_box.length;
	for(var f=0; f<ea; f++){  //전체선택 클릭시 아래 체크박스 모두 선택되도록 작동 
		ad_re_box[f].checked = true ;  //같은 이름의 name값은 배열로 순차적으로 처리됨
	}
	if(check_all.checked == false){
		for(var f=0; f<ea; f++){  //전체선택 클릭시 아래 체크박스 모두 선택되도록 작동 
			ad_re_box[f].checked = false ;  //같은 이름의 name값은 배열로 순차적으로 처리됨
		}
	}
}

function not_all(){
	var check_all = document.getElementById("check_all");
	var ad_re_box = document.getElementsByName("ad_re_box");
	var ea = ad_re_box.length;
	var ct=0;
	for(var ff=0; ff<ea; ff++){
		if(ad_re_box[ff].checked == true){
			ct++;
		}
	}
	if(ea == ct){
		check_all.checked = true;
	}else{
		check_all.checked = false;
	}
}