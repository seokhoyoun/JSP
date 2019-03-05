<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<header class="header">
        <div class="header__square" onclick="toggleNav()">● ● ●</div>
        <div class="header__topbar">
            <ul>
                <li><span>도그하우스 소개</span></li>
                <li><span>FAQ</span></li>
                <li><span>1:1 문의하기</span></li>
                <li><span>이용 방법</span></li>
            </ul>
            <%if(loginUser == null) { %>
            <ul>
                <li><span id="loginBtn">로그인</span></li>
                <li><span id="registerBtn">회원가입</span></li>
                <li><span>아이디 / 비밀번호 찾기</span></li>
            </ul>
            <%} else {%>
            <ul> 
                <li><span><%= loginUser.getUserName()%>님</span></li>
                <li><span><a href="/testh/logout">로그아웃</a></span></li>
                <li><span>쪽지</span></li>
                <li><span>내 정보 보기</span></li>
            </ul>
            <% } %>
        </div>
    </header>
</body>
</html>