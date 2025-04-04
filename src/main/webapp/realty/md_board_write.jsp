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
<title>추천분양 정보 게시판</title>
<link rel="stylesheet" type="text/css" href="./css/index.css?v=<%=date%>">
<link rel="stylesheet" type="text/css" href="./css/md_board_view.css?v=<%=date%>">
<script src="./ckeditor/ckeditor.js"></script>
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
<form id="md_board_form" method="post" action="./md_board_ok.do" enctype="multipart/form-data">
<main>
    <section class="sub">
        <p>추천분양 정보 게시판</p>
        <div class="boards">이번주 신규 매물정보를 한눈에 확인하실 수 있습니다.</div>
        <div class="info_board">
          <ul>
            <li>제&nbsp;&nbsp;&nbsp;목</li>
            <li><input type="text" class="board_in2" name="md_title"></li>
            <li>글쓴이</li>
            <li><input type="text" class="board_in1" name="md_user"></li>
            <li>썸네일 이미지</li>
            <li><input type="file" name="md_img"></li>
            <li class="litext">내&nbsp;&nbsp;&nbsp;용</li>
            <li class="litext">
                <textarea id="board_text" name="board_text">
                    
                </textarea>
            </li>
          </ul>
        </div>
        <div class="board_btn">
            <input type="button" value="등&nbsp;&nbsp;&nbsp;록" class="btns" onclick="md_board_write()">
        </div>
    </section>
    <script>
    window.onload = function(){
        CKEDITOR.replace('board_text',{
            height : 360
        });
    };
    </script>
</main>
</form>
 <!-- 카피라이터 (copyright.jsp) -->
	<%@ include file="./copyright.jsp" %>
 <!-- 카피라이터 끝 -->
</body>
<script src="./js/md_board_write.js?v=<%=date%>"></script>
</html>