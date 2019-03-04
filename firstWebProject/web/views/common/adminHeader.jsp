<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin</title>
<style>
	header nav ul {
		list-style : none;
	}
	header nav ul li {
		float: left;
		margin-right: 5px;
		background-color : black;
	}
	header nav ul li a {
		display: block;
		text-align: center;
		padding-top: 5px;
		padding-bottom: 0;
		width: 120px;
		height: 35px;
		color: white;
		font-weight: bold;
		text-decoration:none;
	}
	header nav ul li a:hover{
		background-color: red;
		text-shadow : 1px 1px 2px white;
		box-shadow: 2px 2px 4px gray;
	}
</style>
</head>
<body>
	<header>
		<nav>
			<ul>
				<li><a  href="/first/index.jsp">Home</a></li>
				<li><a  href="/first/mall">회원 관리</a></li>
				<li><a  href="">공지사항 관리</a></li>
				<li><a  href="">게시글 관리</a></li>
				<li><a  href="">메뉴</a></li>
			</ul>
		</nav>
	</header>
</body>
</html>