<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<% 
	String message = (String) request.getAttribute("message");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>First</title>
</head>
<body>
<h1>공지사항 오류</h1>
<h3>오류발생 : <%= message %></h3>
<a href="javascript:history.go(-1);"> 이전 페이지로 이동</a>
</body>
</html>