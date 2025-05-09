<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Date date = new Date();
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>패스워드 찾기 및 변경</title>
<link rel="stylesheet" type="text/css" href="./css/index.css?v=<%=date%>">
<link rel="stylesheet" type="text/css" href="./css/search_myinfo.css?v=<%=date%>">
</head>
<body>

<!-- 최상단 + 메뉴 (top.jsp) -->
	<%@ include file="./top.jsp" %>
<!-- 최상단 + 메뉴 끝 -->

<form id="pw_ch_f" method="post" action="./change_passwd.do">
<main>
<section class="sub">
<div>
<ul>
<li>회원가입 정보에 따른 패스워드 변경</li>
</ul>
</div>
<div class="text1 repass">
<div><input type="password" name="pr_password" placeholder="현재 비밀번호를 입력해주세요." class="passin" autocomplete="none"></div>
<div><input type="password" name="ch_password" placeholder="변경할 비밀번호를 입력하세요. 최소 10 ~ 16자 (영문,숫자,특수 문자 조합)로 입력해주세요." class="passin" autocomplete="none"></div>
</div>
<div><input type="button" value="비밀번호 변경" class="search_submit" onclick="change_passwd()"></div>
</section>
</main>
</form>

 <!-- 카피라이터 (copyright.jsp) -->
	<%@ include file="./copyright.jsp" %>
 <!-- 카피라이터 끝 -->
 
</body>
<script src="./js/change_passwd.js?v=<%=date%>"></script>
</html>