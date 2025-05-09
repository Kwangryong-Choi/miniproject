<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	Date date = new Date();
%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>모댈 하우스 사전 방문예약</title>
<link rel="stylesheet" type="text/css" href="./css/index.css?v=<%=date%>">
<link rel="stylesheet" type="text/css" href="./css/reservation.css?v=<%=date%>">
</head>
<body>
<!-- 최상단 + 메뉴 (top.jsp) -->
	<%@ include file="./top.jsp" %>
<!-- 최상단 + 메뉴 끝 -->
<form id="rv_f" method="post" action="./reservation.do">
<main>
<section class="sub">
<p>모델 하우스 사전 방문예약</p>
<div>
<span class="list_title">
<span style="color: blue;">분양정보</span>
<span style="color: red;">LH센트럴힐(공공임대)</span>
<input type="hidden" name="rv_title" value="LH센트럴힐(공공임대)">
</span>
<ul class="sub_ul">
<li>방문일시</li>    
<li><input type="date" class="sel_input" name="rv_day"></li> 
<li>방문시간</li>    
<li>
<select class="sel_input2" name="rv_time">
    <option value="">방문시간선택</option>
    <option value="09:00">09:00</option>
    <option value="11:00">11:00</option>
    <option value="13:00">13:00</option>
    <option value="15:00">15:00</option>
    <option value="17:00">17:00</option>
</select> * 해당 시간에 맞춰서 방문해 주셔야 합니다.
</li> 
<li>방문자명</li>    
<li><input type="text" class="sel_input" name="rv_name"></li> 
<li>방문인원</li>    
<li>
<label><input type="radio" class="sel_check" name="rv_radio" value="1명" checked> 1명</label>
<label><input type="radio" class="sel_check" name="rv_radio" value="2명"> 2명</label> ※ 방문인원은 최대 2명까지 입니다.
</li>   
<li>연락처</li>    
<li><input type="text" class="sel_input" name="rv_phonenum"></li>       
</ul>
</div>
<div>
<input type="button" value="방문 예약등록" onclick="rv_submit()">
</div>
</section>
</main>
</form>
 <!-- 카피라이터 (copyright.jsp) -->
	<%@ include file="./copyright.jsp" %>
 <!-- 카피라이터 끝 -->
</body>
<script src="./js/reservation.js?v=<%=date%>"></script>
</html>