<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="cr" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
  <link rel="stylesheet" type="text/css" href="./css/index.css?v=7">
  <link rel="stylesheet" type="text/css" href="./css/member_join.css?v=3">
<style>
.box {
   width: 800px;
   height: 300px;
   border: 1px solid black;
   overflow: auto;
}
</style>
<title>회원가입</title>
</head>
<body>

<!-- 최상단 + 메뉴 (top.jsp) -->
	<%@ include file="./top.jsp" %>
<!-- 최상단 + 메뉴 끝 -->

<main>
	<form id="f" method="post">
		<p>이메일로 회원가입</p>
		<div>
			<a>이메일</a> <input type="text" placeholder=" 이메일 주소를 입력해주세요." autocomplete="none" id="email_ck" name="email" style="width:400px; float:left;">
			<input type="button" value="중복체크" class="mail_btn" onclick="email_check()">
			<input type="hidden" name="email_checked">
		</div>
		<div>
			<a>비밀번호</a> <input type="password" placeholder=" 10~16자(영문,숫자,특수 문자 조합)로 입력해주세요." autocomplete="none" name="password">
		</div>
		<div>
			<a>비밀번호 확인</a> <input type="password"  placeholder=" 비밀번호를 다시 한 번 입력해주세요." autocomplete="none" id="password_check">
		</div>
		<div>
		    <a>이름</a> <input type="text" placeholder=" 이름을 입력해주세요." autocomplete="none" name="user_name">
		</div>
		<div>
		    <a>휴대폰번호</a> <input type="text" placeholder=" -없이 숫자만 입력해주세요." autocomplete="none" name="phone_num">
		</div>
		<div>
		<input type="checkbox" id="check_all" onclick="allcheck()"> <span>전체 동의</span> </div>
		
		<div class="line"></div>
		
	<div class="bottom">
		<input type="hidden" name="ad_required">
		<div class="box1"><input type="checkbox" name="ad_re_box" onclick="not_all()"> <a class="a1">(필수) <span>만 14세 이상입니다.</span></a></div>
		<div class="box2"><input type="checkbox" name="ad_re_box" onclick="not_all()"> <a class="a2">(필수) <span><u>이용약관</u>에 동의</span></a></div>
		<div class="box3"><input type="checkbox" name="ad_re_box" onclick="not_all()"> <a class="a3">(필수) <span><u>개인정보 수집 및 이용</u>에 동의</span></a></div>
		<section class="text1"><div id="ag1"></div>   </section>
		<div class="box4"><input type="checkbox" name="ad_use_check"> <span>(선택) 마케팅 수신에 동의</span></div>
		<input type="hidden" name="ad_use">
		<section class="text2"><div  id="ag2"></div>   </section>
	</div>
		<div><input type="button" value="가입 하기" onclick="join_submit()"></div>
	</form>
</main>

 <!-- 카피라이터 (copyright.jsp) -->
	<%@ include file="./copyright.jsp" %>
 <!-- 카피라이터 끝 -->
 
</body>
<script>
window.onload = function(){
	var http = new XMLHttpRequest;	// ajax 통신
	http.open("GET","./agree1.txt",false);	// GET 통신을 이용하여 해당 파일을 로드
	http.send();	// 통신 실행
	document.getElementById("ag1").innerHTML = http.response;	// HTML에 내용을 출력
	
	http.open("GET","./agree2.txt",false);
	http.send();
	document.getElementById("ag2").innerHTML = http.response;
}


function email_check(){
	var email = document.getElementById("email_ck")
	if(email.value == ""){
		alert("아이디를 입력해주세요");
	}else{
		var http;
		http = new XMLHttpRequest();
		http.open("post","./email_check.do",false);
		http.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
		http.send("email=" + encodeURIComponent(email.value));
	}
}


</script>
<script src="./js/member_join.js?v=6"></script>
</html>