<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 페이지</title>
</head>
<body>
	<form action="/testh/join">
		이름 : <input name='name' required><br>
		아이디 : <input name='userid' required><br>
		패스워드 : <input name='userpwd' required><br>
		<input type="submit">
	</form>
</body>
</html>