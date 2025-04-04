/*
var board_text = document.getElementById("board_text");
var editorData = editor.getData(); // 'editor'는 CKEditor 인스턴스
var textContent = editorData.replace(/<[^>]*>/g, '');  // HTML 태그 제거
*/

var editor = CKEDITOR.instances['board_text'];
if(editor){
	var content = editor.getData();
	console.log(content);
}

function md_board_write(){
	if(md_board_form.md_title.value == ""){
		alert("제목을 입력해주세요.");
	}else if(md_board_form.md_user.value == ""){
		alert("글쓴이를 입력해주세요.");
	}else if(md_board_form.md_img.value == ""){
		alert("이미지를 선택해주세요.");
	}else if(content < 10){
		alert("내용은 최소 10자 이상 작성해주세요.");
	}else{
		md_board_form.submit();
	}
}


/*

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
*/