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
<title>비밀번호 찾기</title>
<link rel="stylesheet" type="text/css" href="./css/index.css?v=<%=date%>">
<link rel="stylesheet" type="text/css" href="./css/passwd_search.css?v=<%=date%>">
</head>
<body>

<!-- 최상단 + 메뉴 (top.jsp) -->
	<%@ include file="./top.jsp" %>
<!-- 최상단 + 메뉴 끝 -->

<form id="pw_sc_f" method="post" action="./passwd_search.do">
<main>
<section class="sub">
<div>
<ul>
<li>이메일 찾기</li>
<li>비밀번호 찾기</li>
</ul>
</div>
<div class="text1">
<div><input type="text" name="sc_email" placeholder="가입하신 이메일을 입력하세요"></div>
<div><input type="text" name="sc_phone_num" placeholder="휴대폰 번호는 - 빼고 숫자만 입력하세요"></div>
</div>
<div><input type="button" value="비밀번호 찾기" onclick="passwd_search()"></div>
</section>
</main>
</form>

 <!-- 카피라이터 (copyright.jsp) -->
	<%@ include file="./copyright.jsp" %>
 <!-- 카피라이터 끝 -->
 
</body>
<script src="./js/passwd_search.js?v=<%=date%>"></script>
</html>