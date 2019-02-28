<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String mes = (String) request.getAttribute("message");
%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Project Two</title>
<link rel="stylesheet" href="c22.css">
</head>

<body>
	<header class="header">
		<h1 class="header__title">도그 하우스</h1>
	</header>
	<main> <span class="top_menu">
		<ul>
			<li><a href="">아이디/비밀번호 찾기</a></li>
			<li><a href="">회원가입</a></li>
			<li><a href="">로그인</a></li>
		</ul>
	</span>
	<nav class="navigation">
		<ul class="navigation__list">
			<li class="navigation__item"><span class="item__icon"><span
					class="icon__emoji"><img src="home.png" alt="pizza"></span></span> <span
				class="item__text">About us</span></li>
			<li class="navigation__item"><span class="item__icon"><span
					class="icon__emoji"><img src="dog.png" alt="dog"></span></span> <span
				class="item__text">펫시터 찾기</span></li>
			<li class="navigation__item"><span class="item__icon"><span
					class="icon__emoji"><img src="pizza.png" alt="pizza"></span></span>
				<span class="item__text">게시판</span></li>
			<li class="navigation__item"><span class="item__icon"><span
					class="icon__emoji">☘</span></span> <span class="item__text">고객센터</span></li>
		</ul>
	</nav>
	<div>
		<h1>회원 서비스 오류</h1>
		메세지 : <%= mes %>
	</div>
	</main>
</body>

</html>