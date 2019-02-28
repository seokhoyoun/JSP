<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="member.model.vo.Member"%>
<% Member loginMember = (Member)session.getAttribute("loginMember"); %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Project Two</title>
<link rel="stylesheet" href="resources/css/style.css">
</head>
<body>
	<header class="header">
		<h1 class="header__title">도그 하우스</h1>
	</header>

	<main><%if (loginMember == null) { %> <span class="top_menu">
		<ul>
			<li><a href="">아이디/비밀번호 찾기</a></li>
			<li><a href="">회원가입</a></li>
			<li><a href="views/member/joinMember.jsp" class="login">로그인</a></li>
		</ul>
	</span><% } else { %>
	<span class="top_menu">
		<ul>
			<li><a href="">내정보보기</a></li>
			<li><a href="/testh/logout">로그아웃</a></li>
			<li><a href="">쪽지함</a></li>
		</ul>
	</span>
	<% } %>
	<nav class="navigation">
		<ul class="navigation__list">
			<li class="navigation__item"><span class="item__icon"><span
					class="icon__emoji"><img src="resources/images/home.png" alt="pizza"></span></span> <span
				class="item__text">About us</span></li>
			<li class="navigation__item"><span class="item__icon"><span
					class="icon__emoji"><img src="resources/images/dog.png" alt="dog"></span></span> <span
				class="item__text">펫시터 찾기</span></li>
			<li class="navigation__item"><span class="item__icon"><span
					class="icon__emoji"><img src="resources/images/pizza.png" alt="pizza"></span></span>
				<span class="item__text">게시판</span></li>
			<li class="navigation__item"><span class="item__icon"><span
					class="icon__emoji">☘</span></span> <span class="item__text">고객센터</span></li>
		</ul>
	</nav>
	<section class="featured">
		<!-- <h2 class="featured__title">Featured Services</h2> -->
		<div class="featured__wrapper">
			<article class="featured-content">
				<h4 class="featured-content__title">Host of the Month</h4>
				<button class="featured-content__button">
					<span></span>
				</button>
			</article>
			<article class="featured-content">
				<h4 class="featured-content__title">Q & A</h4>
				<button class="featured-content__button">
					<span></span>
				</button>
			</article>
			<article class="featured-content">
				<h4 class="featured-content__title">Map</h4>
				<button class="featured-content__button">
					<span></span>
				</button>
			</article>
			<article class="featured-content">
				<h4 class="featured-content__title">Review</h4>
				<button class="featured-content__button">
					<span></span>
				</button>
			</article>
		</div>
	</section>
	</main>
	<script type="text/javascript" src="resources/js/main.js"></script>
</body>
</html>