<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>second</title>
</head>
<body>
<c:if test="${!empty loginUser and loginUser.userId eq 'admin'}">
	<c:import url="../common/adminHeader.jsp" />
</c:if>
<c:if test="${loginUser.userId ne 'admin' }">
	<c:import url="../common/header.jsp" />
</c:if>
<hr style="clear:left;">
<h1>회원서비스 오류</h1>
<c:if test="${!empty exception }">
JSP 예외발생 : <%= exception.getMessage() %> <br>
</c:if>
<c:if test="${empty exception }">
서블릿이 전달한 메세지 : ${message }  <br>
</c:if>
<br>
<a href="/second/index.jsp">시작페이지로 이동</a> <br>
<hr>
<c:import url="../common/footer.jsp"/>
</body>
</html>









