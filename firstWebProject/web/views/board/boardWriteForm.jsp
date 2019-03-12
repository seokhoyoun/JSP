<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="boardError.jsp"%>
<%@ page import="member.model.vo.Member" %>

<% Member loginUser = (Member) session.getAttribute("loginUser"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>First</title>
</head>
<body>
<%@ include file="../common/header.jsp" %>
<hr style="clear:both">
 <h2 align="center"> 게시글 쓰기</h2>
 <form action="/first/binsert" method="post" enctype="multipart/form-data">
 	<table align="center">
 		<tr>
 			<td>제목</td>
 			<td><input type="text" name="btitle"></td>
 		</tr>
 		<tr>
 			<td>작성자</td>
 			<td><input name="bwriter" readonly value="<%= loginUser.getUserid()%>"></td>
 		</tr>
 		<tr>
 			<td>첨부파일</td>
 			<td><input type="file" name="bupfile"></td>
 		</tr>
 		<tr>
 			<td>내용</td>
 			<td><textarea cols="50" rows="7" name="bcontent"></textarea></td>
 		</tr>
 		<tr>
 			<td align="center" colspan="2"><input type="submit" value="등록하기">&nbsp; <input type="reset" value="입력취소">&nbsp; <a href="/first/blist?page=1">[목록]</a></td>
 		</tr>
 	</table>
 </form>
 <hr>
<%@ include file="../common/footer.jsp" %>
</body>
</html>