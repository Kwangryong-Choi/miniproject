<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>온라인 부동산 중개</title>
  <link rel="stylesheet" type="text/css" href="./css/index.css?v=7">
</head>
<body>
<!-- 최상단 + 메뉴 (top.jsp) -->
	<%@ include file="./top.jsp" %>
<!-- 최상단 + 메뉴 끝 -->
 <main>
  <!--카테고리 및 배너 (banner.jsp) -->
	<%@ include file="./banner.jsp" %>
  <!--카테고리 및 배너 끝-->
  <!-- 퀵 메뉴 (quickmenu.jsp) -->
	<%@ include file="./quickmenu.jsp" %>
  <!-- 퀵 메뉴 끝 -->
  <!--금주 분양 매물 정보 시작 (weekinfo.jsp)-->
	<%@ include file="./weekinfo.jsp" %>
  <!--금주 분양 매물 정보 끝-->
  <!--추천 분양 정보 (mdchoice.jsp)-->
	<%@ include file="./mdchoice.jsp" %>
  <!--추천 분양 정보 끝-->
 </main>
 <!-- 카피라이터 (copyright.jsp) -->
	<%@ include file="./copyright.jsp" %>
 <!-- 카피라이터 끝 -->
</body>
</html>