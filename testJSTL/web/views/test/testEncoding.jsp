<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>testFmt.jsp에서 전송한 테스트값 출력 확인</h1>
<%-- ${param.test }<br> --%>
<%-- <%
	request.setCharacterEncoding("utf-8");
	String value = request.getParameter("test");
%>
<%= value %><br> --%>
<fmt:requestEncoding value="utf-8"/>
${param.test }
</body>
</html>