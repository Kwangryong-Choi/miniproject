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
<title>ȸ������</title>
</head>
<body>

<!-- �ֻ�� + �޴� (top.jsp) -->
	<%@ include file="./top.jsp" %>
<!-- �ֻ�� + �޴� �� -->

<main>
	<form id="f" method="post">
		<p>�̸��Ϸ� ȸ������</p>
		<div>
			<a>�̸���</a> <input type="text" placeholder=" �̸��� �ּҸ� �Է����ּ���." autocomplete="none" id="email_ck" name="email" style="width:400px; float:left;">
			<input type="button" value="�ߺ�üũ" class="mail_btn" onclick="email_check()">
			<input type="hidden" name="email_checked">
		</div>
		<div>
			<a>��й�ȣ</a> <input type="password" placeholder=" 10~16��(����,����,Ư�� ���� ����)�� �Է����ּ���." autocomplete="none" name="password">
		</div>
		<div>
			<a>��й�ȣ Ȯ��</a> <input type="password"  placeholder=" ��й�ȣ�� �ٽ� �� �� �Է����ּ���." autocomplete="none" id="password_check">
		</div>
		<div>
		    <a>�̸�</a> <input type="text" placeholder=" �̸��� �Է����ּ���." autocomplete="none" name="user_name">
		</div>
		<div>
		    <a>�޴�����ȣ</a> <input type="text" placeholder=" -���� ���ڸ� �Է����ּ���." autocomplete="none" name="phone_num">
		</div>
		<div>
		<input type="checkbox" id="check_all" onclick="allcheck()"> <span>��ü ����</span> </div>
		
		<div class="line"></div>
		
	<div class="bottom">
		<input type="hidden" name="ad_required">
		<div class="box1"><input type="checkbox" name="ad_re_box" onclick="not_all()"> <a class="a1">(�ʼ�) <span>�� 14�� �̻��Դϴ�.</span></a></div>
		<div class="box2"><input type="checkbox" name="ad_re_box" onclick="not_all()"> <a class="a2">(�ʼ�) <span><u>�̿���</u>�� ����</span></a></div>
		<div class="box3"><input type="checkbox" name="ad_re_box" onclick="not_all()"> <a class="a3">(�ʼ�) <span><u>�������� ���� �� �̿�</u>�� ����</span></a></div>
		<section class="text1"><div id="ag1"></div>   </section>
		<div class="box4"><input type="checkbox" name="ad_use_check"> <span>(����) ������ ���ſ� ����</span></div>
		<input type="hidden" name="ad_use">
		<section class="text2"><div  id="ag2"></div>   </section>
	</div>
		<div><input type="button" value="���� �ϱ�" onclick="join_submit()"></div>
	</form>
</main>

 <!-- ī�Ƕ����� (copyright.jsp) -->
	<%@ include file="./copyright.jsp" %>
 <!-- ī�Ƕ����� �� -->
 
</body>
<script>
window.onload = function(){
	var http = new XMLHttpRequest;	// ajax ���
	http.open("GET","./agree1.txt",false);	// GET ����� �̿��Ͽ� �ش� ������ �ε�
	http.send();	// ��� ����
	document.getElementById("ag1").innerHTML = http.response;	// HTML�� ������ ���
	
	http.open("GET","./agree2.txt",false);
	http.send();
	document.getElementById("ag2").innerHTML = http.response;
}


function email_check(){
	var email = document.getElementById("email_ck")
	if(email.value == ""){
		alert("���̵� �Է����ּ���");
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