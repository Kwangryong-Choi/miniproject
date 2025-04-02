/*
function md_board_write(){
	if(md_board_form.md_title.value == ""){
		alert("제목을 입력해주세요.");
	}else if(md_board_form.md_user.value == ""){
		alert("글쓴이를 입력해주세요.");
	}else if(md_board_form.md_img.value == ""){
		alert("이미지를 선택해주세요.");
	}else if(textarea.value.length < 10){
		alert("내용은 최소 10자 이상 작성해주세요.");
	}else{
		md_board_form.submit();
	}
}
*/

document.addEventListener('md_board_write()', function() {
  var textarea = document.getElementById("board_text");

  if(md_board_form.md_title.value == ""){
		alert("제목을 입력해주세요.");
	}else if(md_board_form.md_user.value == ""){
		alert("글쓴이를 입력해주세요.");
	}else if(md_board_form.md_img.value == ""){
		alert("이미지를 선택해주세요.");
	}else if(textarea.value.length < 10){
		alert("내용은 최소 10자 이상 작성해주세요.");
	}else{
		md_board_form.submit();
	}
});