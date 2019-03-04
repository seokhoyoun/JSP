<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="member.model.vo.Member"%>
<%
	// 스크립트릿(scriptlit) 태그 영역
	// 자바 코드 작성 영역임.
	String message = (String)request.getAttribute("message");
	Member loginUser = (Member)session.getAttribute("loginUser");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>First</title>
</head>
<body>
<% if(loginUser != null && loginUser.getUserid().equals("admin")){ %>
<%@ include file="../common/adminHeader.jsp" %>
<%} else { %>
<%@ include file="../common/header.jsp" %>
<%} %>
<hr style="clear:left;">
<h1>회원 서비스 오류</h1>
메세지 : <%= message %>  <br>
<br>
<a href="/first/index.jsp">시작 페이지로 이동</a>
<%@ include file="../common/footer.jsp" %>
</body>
</html>