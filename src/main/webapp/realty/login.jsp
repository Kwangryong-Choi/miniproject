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
<title>로그인</title>
<link rel="stylesheet" type="text/css" href="./css/index.css?v=<%=date%>">
<link rel="stylesheet" type="text/css" href="./css/login.css?v=<%=date%>">
<style>
.box {
   width: 800px;
   height: 300px;
   border: 1px solid black;
   overflow: auto;
}

</style>
</head>
<body>

<!-- 최상단 + 메뉴 (top.jsp) -->
	<%@ include file="./top.jsp" %>
<!-- 최상단 + 메뉴 끝 -->

<main>
		<form id="lo_f" method="post" action="./login_ok.do">
	<aside class="login_pg">	
		<p>이메일로 시작하기</p>
		<div><input type="text" name="lemail" placeholder="이메일 주소"></div>
		<div><input type="password" name="lpass" placeholder="비밀번호"></div>
		<div><input type="button" value="로그인" onclick="logincheck()"></div>
		<div>
			<span>이메일 찾기</span>
			<span>비밀번호 찾기</span>
		</div>
	</aside>
		</form>
</main>

 <!-- 카피라이터 (copyright.jsp) -->
	<%@ include file="./copyright.jsp" %>
 <!-- 카피라이터 끝 -->
 
</body>
<script src="./js/login.js?v=<%=date%>"></script>
</html>