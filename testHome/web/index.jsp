<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="member.model.vo.Member"%>
<% Member loginMember = (Member)session.getAttribute("loginMember"); %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Practice Eight</title>
    <link rel="stylesheet" href="resources/css/style.css">
</head>

<body>

    <header class="header">
        <div class="header__square" onclick="toggleNav()">● ● ●</div>
        <div class="header__topbar">
            <ul>
                <li><a href="">도그하우스 소개</a></li>
                <li><a href="">FAQ</a></li>
                <li><a href="">1:1 문의하기</a></li>
                <li><a href="">이용 방법</a></li>
            </ul>
            <ul>
                <li><a href="">로그인</a></li>
                <li><a href="">회원가입</a></li>
                <li><a href="">아이디 비밀번호 찾기</a></li>
            </ul>
        </div>
    </header>

    <main class="main">
        <aside class="nav-sidebar">
            <ul>
                <li><span>펫시터 찾기</span></li>
                <li><a href=""> 펫시터 등록 </a></li>
                <li><a href="">자유게시판</a></li>
                <li><a href="">팁 게시판</a></li>
                <li><a href="">공지사항</a> </li>
                <li><a href="">마이페이지</a> </li>
            </ul>
        </aside>
        <div class="main__info">
            <hgroup class="main__titles">
                <h6 class="main__pre-title">The grand moment</h6>
                <h2 class="main__title">도그 하우스</h2>
                <h5 class="main__subtitle">Lorem ipsum, dolor sit amet consectetur adipisicing elit.</h5>
            </hgroup>
            <a href="" class="main__link">Explore the tour</a>
        </div>
        <div class="main__photo">
            <div class="main__navigation">
                <span class="navigation__arrow">←</span>
                <span class="navigation__pagess">1/4</span>
                <span class="navigation__arrow">→</span></div>
        </div>
    </main>
    <script src="resources/js/main.js"></script>
</body>

</html>