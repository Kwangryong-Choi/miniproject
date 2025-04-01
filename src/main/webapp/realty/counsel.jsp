<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상담신청</title>
<link rel="stylesheet" type="text/css" href="./css/index.css?v=1">
<link rel="stylesheet" type="text/css" href="./css/counsel.css?v=3">
</head>
<body>

<!-- 최상단 + 메뉴 (top.jsp) -->
	<%@ include file="./top.jsp" %>
<!-- 최상단 + 메뉴 끝 -->

<form id="f_counsel" method="post" action="./counsel.do">
<main>
<section class="sub">
<p>상담신청</p>
<div>
<span class="list_title">◎ <span style="color: blue;">상담자 정보</span></span>
<ul class="sub_ul">
<li>상담자명</li>    
<li><input type="text" class="sel_input" name="c_name" readonly></li> 
<li>이메일</li>    
<li><input type="text" class="sel_input" name="c_email" readonly></li> 
<li>연락처</li>    
<li><input type="text" class="sel_input" name="c_phonenum" readonly></li> 
<li>임대형태</li>    
<li>
<label><input type="checkbox" class="sel_check" name="c_lease" value="공공임대"> 공공임대</label>
<label><input type="checkbox" class="sel_check" name="c_lease" value="민간임대"> 민간임대</label>
<label><input type="checkbox" class="sel_check" name="c_lease" value="민간분양"> 민간분양</label>
<label><input type="checkbox" class="sel_check" name="c_lease" value="기타"> 기타</label>
</li>   
<li>주거형태</li>    
<li>
<label><input type="checkbox" class="sel_check" name="c_living" value="아파트"> 아파트</label>
<label><input type="checkbox" class="sel_check" name="c_living" value="빌라&&단독주택"> 빌라,단독주택</label>
<label><input type="checkbox" class="sel_check" name="c_living" value="사무실&&상가&&빌딩"> 사무실.상가.빌딩</label>
</li>       
<li>상담일시</li>    
<li>
<input type="date" class="sel_input2" name="c_day"> * 해당 일시에 맞춰서 담당자가 연락 드립니다.   
</li>    
<li>상담내용</li>    
<li style="height: 150px !important; line-height: 150px;">
<textarea class="sel_input3" placeholder="구체적인 상담내용을 입력해 주세요" name="c_counsel" minlength="10"></textarea>
</li>
</ul>
</div>
<div><input type="button" value="상담신청" onclick="submit_counsel()"></div>
</section>
</main>
</form>

 <!-- 카피라이터 (copyright.jsp) -->
	<%@ include file="./copyright.jsp" %>
 <!-- 카피라이터 끝 -->
 
</body>
<script src="./js/counsel.js?v=4"></script>
</html>