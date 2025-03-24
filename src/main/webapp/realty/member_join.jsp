<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>
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
<title>Insert title here</title>
</head>
<body>

<!-- �ֻ�� + �޴� (top.jsp) -->
	<%@ include file="./top.jsp" %>
<!-- �ֻ�� + �޴� �� -->

<main>
	<form id="f" method="post">
		<p>�̸��Ϸ� ȸ������</p>
		<div>
			<a>�̸���</a> <input type="text" placeholder=" �̸��� �ּҸ� �Է����ּ���." autocomplete="none" name="email" style="width:400px; float:left;">
			<input type="button" value="�ߺ�üũ" class="mail_btn" onclick="email_check">
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
		<div class="box1"><input type="checkbox" name="box1" onclick="not_all()"> <a class="a1">(�ʼ�) <span>�� 14�� �̻��Դϴ�.</span></a></div>
		<div class="box2"><input type="checkbox" name="box1" onclick="not_all()"> <a class="a2">(�ʼ�) <span><u>�̿���</u>�� ����</span></a></div>
		<div class="box3"><input type="checkbox" name="box1" onclick="not_all()"> <a class="a3">(�ʼ�) <span><u>�������� ���� �� �̿�</u>�� ����</span></a></div>
		<section class="text1"><div id="ag1"></div>   </section>
		<div class="box4"><input type="checkbox" name="ad_use"> <span>(����) ������ ���ſ� ����</span></div>
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

</script>
<script src="./js/member_join.js?v=2"></script>
</html>