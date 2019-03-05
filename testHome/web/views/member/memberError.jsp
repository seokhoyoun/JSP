<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String mes = (String) request.getAttribute("message");
%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>도그하우스</title>
</head>
<body>
	<div>
		<h1>회원 서비스 오류</h1>
		메세지 : <%= mes %>
	</div>
	</main>
</body>

</html>