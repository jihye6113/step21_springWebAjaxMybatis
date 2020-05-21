<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery-3.5.1.min.js"></script>
<script type="text/javascript">
   $(function(){
	   $("#loadBtn").click(function(){
		   $("#display").load("load");
	   });
	   
	   $("#ajaxBtn").click(function(){
		   $.ajax({
			   url :"ajax", //서버주소
			   type: "post", //요청방식(get,post,put,delete)
			   dataType:"text" , //서버에게 받은 응답데이터타입(text,html,xml,json)
			   data: "name=장희정",//서버에게 보낼 parameter정보
			   success: function(result){
				   //alert(result)
				   $("#display").text(result);
			   },
			   error: function(err){
				   alert("오류발생 : " + err)
			   }
		   });
	   });
	   /////////////////////////////////////////////////
	   $("#arrayBtn").click(function(){
		   $.ajax({
			   url :"array", //서버주소
			   type: "post", //요청방식(get,post,put,delete)
			   dataType:"json" , //서버에게 받은 응답데이터타입(text,html,xml,json)
			  // data: "name=장희정",//서버에게 보낼 parameter정보
			   success: function(result){
				  //alert(result)
				  let str="";
				  $.each(result,function(index, item){
					  str+="<input type='checkbox' value='"+index+"'>"+item 
				  });
				  
				  $("#display").html(str);
			   },
			   error: function(err){
				   alert("오류발생 : " + err)
			   }
		   });
	   });
	   /////////////////////////////////////////////////
	   $("#dtoBtn").click(function(){
		   $.ajax({
			   url :"jsonDTO", //서버주소
			   type: "post", //요청방식(get,post,put,delete)
			   dataType:"json" , //서버에게 받은 응답데이터타입(text,html,xml,json)
			  // data: "name=장희정",//서버에게 보낼 parameter정보
			   success: function(result){
				  alert(result.id +" | "+ result.age+" | " + result.addr)
			   },
			   error: function(err){
				   alert("오류발생 : " + err)
			   }
		   });
	   });
	   //////////////////////////////////////////////////////
	   $("#listBtn").click(function(){
		   $.ajax({
			   url :"jsonList", //서버주소
			   type: "post", //요청방식(get,post,put,delete)
			   dataType:"json" , //서버에게 받은 응답데이터타입(text,html,xml,json)
			  // data: "name=장희정",//서버에게 보낼 parameter정보
			   success: function(result){
				 // alert(result)
				 let str="<table><tr>";
				 str+="<th>순서</th><th>ID</th><th>AGE</th><th>ADDR</th>";
				 str+"<th>PHONE</th></tr>";
				 
				 $.each(result, function(index, item){
					 str+="<tr>";
					 str+="<td>"+(index+1)+"</td>";
					 str+="<td>"+item.id+"</td>";
					 str+="<td>"+item.age+"</td>";
					 str+="<td>"+item.addr+"</td>";
					 str+="<td>"+item.phone+"</td>";
					 str+"</tr>";
				 });
				 
				 $("#display").html(str);
			   },
			   error: function(err){
				   alert("오류발생 : " + err)
			   }
		   });
	   });
	   ////////////////////////////////////////////////
	   $("#mapBtn").click(function(){
		   $.ajax({
			   url :"jsonMap", //서버주소
			   type: "post", //요청방식(get,post,put,delete)
			   dataType:"json" , //서버에게 받은 응답데이터타입(text,html,xml,json)
			  // data: "name=장희정",//서버에게 보낼 parameter정보
			   success: function(result){
				 alert(result.message +" | " + result.pageNum);
				 alert(result.memberList)
				 alert(result.dto +" | " + result.dto.id)
				 
				 $.each(result.memberList , function(index, item){
					 alert(index+" , " + item +" , " + item.id)
				 })
			   },
			   error: function(err){
				   alert("오류발생 : " + err)
			   }
		   });
	   });
	   
	   
   })//ready끝
</script>
</head>
<body>

<input type="button" value="load함수" id="loadBtn">
<input type="button" value="ajax함수" id="ajaxBtn">

<input type="button" value="json결과(array)" id="arrayBtn">
<input type="button" value="json결과(DTO)" id="dtoBtn">
<input type="button" value="json결과(List)" id="listBtn">
<input type="button" value="json결과(Map)" id="mapBtn">

<hr>
<div id="display"></div>



</body>
</html>



