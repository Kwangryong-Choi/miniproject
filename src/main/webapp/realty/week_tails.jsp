<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="cr" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>금주 분양 매물 정보</title>
<link rel="stylesheet" type="text/css" href="./css/index.css?v=1">
<link rel="stylesheet" type="text/css" href="./css/week_tails.css?v=1">
</head>
<body>

<!-- 최상단 + 메뉴 (top.jsp) -->
	<%@ include file="./top.jsp" %>
<!-- 최상단 + 메뉴 끝 -->

<main>
	<div class="weektails">
		<p>분양정보</p>
		<div id="weektails">
			<p>${ti_title}</p>
            <ul>
                <li>종류</li>
                <li>${ti_apt} | ${ti_part} </li>
                <li>주소</li>
				<li>${ti_address}</li>
                <li>규모</li>
				<li>총 104세대 | 총 2개동</li>
                <li>시기</li>
				<li>${sell_day} | ${in_day} </li>
                <li>난방구조</li>
				<li>${ti_heat}</li>
                <li>건설사</li>
				<li>${structure}</li>
                <li>사진정보</li>
				<li><img src="./room/${ti_img}"></li>
            </ul>
		</div>
        <div><button class="btn_css">방문예약</button></div>
        <div><button class="btn_close">방문예약완료</button></div>
	</div>
</main>

 <!-- 카피라이터 (copyright.jsp) -->
	<%@ include file="./copyright.jsp" %>
 <!-- 카피라이터 끝 -->
 
</body>
</html>