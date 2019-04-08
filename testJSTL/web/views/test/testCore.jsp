<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>JSTL core library test page</h1>
<h4>c.set 태그 : 변수 선언과 값 기록용 태그</h4>
<c:set var="num1" value="100"/>
<c:set var="num2" value="200"/>
num1: ${num1 } <br>
num2: ${num2 } <br>
<c:set var="sum" value="${num1+num2}" />
sum: ${sum }<br>
<%
	int n1 = 11 , n2 = 22;
%>
<c:set var="result" value="<%= n1 + n2 %>" scope="session"/>
result : ${result } <br>
<hr>
<h4>c:set 태그로 배열만들기</h4>
<c:set var="colors">
	red,yellow,green,blue,magenta
</c:set>
colors: ${colors }
<hr>
<h4>c:remove 태그 : 변수 삭제하는 태그</h4>
<c:remove var="result" scope="session" />
<hr>
<h4>c:out 출력하기 태그</h4>
그대로 출력 : <c:out value="<h2>태그로 출력하기</h2>" escapeXml="true"/>
<hr>
태그해석해서 출력 : <c:out value="<h2>태그로 출력하기</h2>" escapeXml="false"/>
<hr>
전송 온 값 출력 :
<c:out value="${ param.name}" default="손님"/><br>
<hr>
<h4>c:if 태그 : if문과 같음</h4>
<c:if test="${num1 > num2 }">
num1이 크다
</c:if>
<c:if test="${num1 <= num2 }">
num2가 크거나 같다
</c:if>
<br>
<hr>
<h4>c:choose 태그 - switch</h4>
<c:set var="no" value="3" />
<c:choose>
<c:when test="${no eq 1}">반갑습니다</c:when>
<c:when test="${no eq 2}">환영합니다</c:when>
<c:otherwise>안녕하세요</c:otherwise>
</c:choose>
<hr>
<h4>forEach 태그</h4>
<c:forEach begin="1" end="10">
반복확인 <br>
</c:forEach>
<hr>
<c:forEach var="count" begin="1" end="10" step="2">
${count }<br>
</c:forEach>
<hr>
<h4>반복 카운트용 변수를 html 태그의 값으로 적용 가능함</h4>
<c:forEach var="size" begin="1" end="7">
	<font size="${size}">글자크기 ${size }</font>
</c:forEach>
<hr>
<c:forEach items="${colors }" var="colors">
	<font color="${colors }">글자색 적용</font> <br>
</c:forEach>
<hr>
<%
	java.util.ArrayList<String> list = new java.util.ArrayList<>();
	list.add("java");
	list.add("java1");
	list.add("java2");
	list.add("java3");
%>
<c:forEach items="<%= list %>" var="category" varStatus="status">
	${status.count } : ${category } <br>
</c:forEach>
<hr>
<h4>forTokens</h4>
<c:forTokens items="yellow,pink,red,blue" delims="," var="clr">
	<li>${clr }</li>
</c:forTokens>
<hr>
<c:forTokens items="core/fmt:sql*java" delims="/:*" var="temp">
	<li>${temp }</li>
</c:forTokens>
</body>
</html>