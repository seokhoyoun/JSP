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
testCore.jsp 에서 저장된 result 변수값 확인 : ${sessionScope.result }<br>
testCore.jsp 에서 전송온 no 값 확인 : ${param.no }<br>
<hr>
<h4>fmt:formatDate 태그 : 날짜와 시간에 포맷 적용 태그 (java.util.Date)</h4>
<fmt:formatDate value="<%= new java.util.Date() %>" /><br>
<c:set var="today" value="<%= new java.util.Date() %>" />
<fmt:formatDate value="${today }" type="time"/><br>
<fmt:formatDate value="${today }" type="both"/><br>
<hr>
[short] : <fmt:formatDate value="${today }" type="both" dateStyle="short" timeStyle="short" /><br>
[medium] : <fmt:formatDate value="${today }" type="both" dateStyle="medium" timeStyle="medium" /><br>
[long] : <fmt:formatDate value="${today }" type="both" dateStyle="long" timeStyle="long" /><br>
[full] : <fmt:formatDate value="${today }" type="both" dateStyle="full" timeStyle="full" /><br>
<hr>
현재날짜 : <fmt:formatDate value="${today }" type="date" pattern="yyyy/MM/dd (E)" /><br>
현재 시간 : <fmt:formatDate value="${today }" type="time" pattern="(a) hh:mm:ss"/>
<hr>
<h4>fmt:setLocale 태그 : 지역대 설정하는 태그임</h4>
<fmt:setLocale value="ko_kr"/>
<h4>fmt:timeZone 태그 : 시간대 설정 / setTimezone 사용해도 가능</h4>
한국 현재 시간 : <fmt:formatDate value="${today }" type="both" /> <br>
뉴욕 현재 시간 : <fmt:timeZone value="America/New_York">
	<fmt:formatDate value="<%= new java.util.Date() %>" type="both"/>
</fmt:timeZone><br>
런던 현재 시간 : <fmt:timeZone value="Europe/London">
	<fmt:formatDate value="<%=new java.util.Date() %>" type="both"/>
</fmt:timeZone><br>
<hr>
<form action="testEncoding.jsp" method="POST">
전송값 : <input name="test"><br>
<input type="submit" value="전송하기" />
</form>
<hr>
<h4>fmt:formatNumber 태그 : 숫자데이터 포맷 적용 태그</h4>
숫자 그대로 : <fmt:formatNumber value="1234567689" groupingUsed="false"/><br>
천단위 기호 : <fmt:formatNumber value="1234567689" groupingUsed="true"/><br>
실수값 소숫점 아래 자릿수 지정 : pattern 속성 사용함.
(#, 0 으로 자릿수 지정함) <br>
# 사용한 경우 : <fmt:formatNumber value="1.234567" pattern="#.##"></fmt:formatNumber><br>
# 사용한 경우 : <fmt:formatNumber value="1.2" pattern="#.##" /><br>
0 사용한 경우 : <fmt:formatNumber value="1.2" pattern="#.00" /><br>
<hr>
<fmt:formatNumber value="0.12" type="percent"/> <br>
<fmt:formatNumber value="12346557" type="currency"/> <br>
<fmt:formatNumber value="12345665" type="currency" currencySymbol="$"/> <br>
</body>
</html>