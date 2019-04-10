<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>second</title>
</head>
<body>
<c:if test="${!empty exception }">
<h3>JSP 오류발생 : <%= exception.getMessage() %></h3>
</c:if>
<c:if test="${empty exception }">
<h3>서블릿 오류발생 : ${message }</h3>
</c:if>
<a href="javascript:history.go(-1);">이전 페이지로 이동</a>
</body>
</html>