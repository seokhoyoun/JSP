<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true"%>
    
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
<%if(exception != null) { %>
	<h3>JSP 오류 발생 : <%= exception.getMessage() %></h3>
<%} else { %>
<h3>서블릿 오류발생 : <%= message %></h3>
<%} %>
<a href="javascript:history.go(-1);"> 이전 페이지로 이동</a>
</body>
</html>