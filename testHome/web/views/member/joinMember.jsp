
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Project Two</title>
<link rel="stylesheet" href="../../resources/css/style.css">
</head>
<body>
	<header class="header">
		<h1 class="header__title">도그 하우스</h1>
	</header>

	<main> <span class="top_menu">
		<ul>
			<li><a href="">아이디/비밀번호 찾기</a></li>
			<li><a href="">회원가입</a></li>
			<li><a href="views/member/joinMember.jsp" class="login">로그인</a></li>
		</ul>
	</span>
	<nav class="navigation">
		<ul class="navigation__list">
			<li class="navigation__item"><span class="item__icon"><span
					class="icon__emoji"><img src="../../resources/images/home.png" alt="pizza"></span></span> <span
				class="item__text">About us</span></li>
			<li class="navigation__item"><span class="item__icon"><span
					class="icon__emoji"><img src="../../resources/images/dog.png" alt="dog"></span></span> <span
				class="item__text">펫시터 찾기</span></li>
			<li class="navigation__item"><span class="item__icon"><span
					class="icon__emoji"><img src="../../resources/images/pizza.png" alt="pizza"></span></span>
				<span class="item__text">게시판</span></li>
			<li class="navigation__item"><span class="item__icon"><span
					class="icon__emoji">☘</span></span> <span class="item__text">고객센터</span></li>
		</ul>
	</nav>
	<form action="/testh/login" method="post">
		아이디 : <input name='userid' required><br>
		패스워드 : <input name='userpwd' required><br>
		<input type="submit" value="로그인">
	</form>
	</main>
	<script type="text/javascript" src="resources/js/main.js"></script>
</body>
</html>
