<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>



 <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
  <script src="${pageContext.request.contextPath}/resources/js/jquery-3.5.1.min.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
  
<script>
  $(function(){
	  $("#keyWord").keyup(function(){
		  var value = $(this).val();
		  if(value==""){
			  return;
		  }
		  
		  $.ajax({
			   url :"suggest", //서버주소
			   type: "post", //요청방식(get,post,put,delete)
			   dataType:"json" , //서버에게 받은 응답데이터타입(text,html,xml,json)
			   data: "word="+ value,//서버에게 보낼 parameter정보 //{"word":value}
			   success: function(result){
				    console.log(result)
				    $( "#keyWord" ).autocomplete({
				        source: result
				      });
				  
			   },
			   error: function(err){
				   alert("오류발생 : " + err)
			   }
		   });//ajaxEnd
		  
	  });//keyWordEnd
  })//ready끝



</script>


</head>
<body>
<h3> [ Suggest 기능 구현 ]</h3>	
<form name="search" id="search">
	<input type="text" name="word" id="keyWord"/>
</form>
<!--제시어 단어 출력부분 -->
<div id="suggest" style="display:none">
 

</div>

</body>
</html>








