<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="notice.model.vo.Notice" %>
    <%
    	Notice notice = (Notice) request.getAttribute("notice");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>First</title>
</head>
<body>
<%@ include file="../common/header.jsp" %>
<hr style="clear:both;">

<h2 align="center"><%= notice.getNoticeNo() %>번 공지글 수정페이지</h2>
<hr>
<form action="/first/nupdate" method="POST" enctype="multipart/form-data">
<input type="hidden" name="no" value="<%= notice.getNoticeNo() %>">
<input type="hidden" name="ofile" value="<%= notice.getOriginalFilePath()%>">
<input type="hidden" name="rfile" value="<%= notice.getRenameFilePath()%>">

<table align="center" width="600">
	<tr>
		<th>제목</th>
		<td><input name="title" value="<%= notice.getNoticeTitle()%>"></td>
	</tr>
	<tr>
		<th>작성자</th>
		<td><input name="writer" value="<%= notice.getNoticeWriter()%>" readonly></td>
	</tr>
	<tr>
		<th>첨부파일</th>
		<td id="filetd">
		<% if(notice.getOriginalFilePath() != null) {%>
		<%= notice.getOriginalFilePath() %>
		<%} else { %>
		첨부파일 없음
		<%} %>&nbsp;
		<button onclick="return addFile();">첨부파일변경</button></td>
		<script>
			function addFile(){
				var filetd = document.getElementById('filetd');
				var addHTML = "<input type='file' name='upfile'>"
				filetd.innerHTML = filetd.innerHTML +'<br>'+ addHTML;
				return false;
			}
		</script>
	</tr>
	<tr>
		<th>내용</th>
		<td><textarea rows="5" cols="50" name="content"><%=notice.getNoticeContent() %></textarea></td>
	</tr>
	<tr>
		<th colspan="2">
		<input type="submit" value="수정하기"> &nbsp;
		<button onclick="history.go(-1); return false;">이전 페이지로 이동</button>
		</th>
	</tr>
</table>
</form>

<hr>
<%@ include file="../common/footer.jsp" %>
</body>
</html>