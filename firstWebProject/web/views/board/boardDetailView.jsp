<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="board.model.vo.Board, member.model.vo.Member, java.sql.Date" %>

<%  
	Board board = (Board) request.getAttribute("board");
	int currentPage = ((Integer)request.getAttribute("currentPage")).intValue();
	Member loginUser = (Member) session.getAttribute("loginUser");
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
	<h2 align="center"><%=board.getBoardNum() %>번 글 상세보기</h2>
	<br>
		<table align="center" border="1" cellspacing="0" cellpadding="10" width="500">
			<tr>
				<th>제목</th>
				<td><%= board.getBoardTitle() %></td>
			</tr>
			<tr>
				<th>글쓴이</th>
				<td><%= board.getBoardWriter() %></td>
			</tr>
			<tr>
				<th>첨부파일</th>
				<td>
					<% if(board.getBoardOriginalFileName() != null) {%>
						<a href="/first/bfdown?ofile=<%= board.getBoardOriginalFileName() %>&rfile=<%= board.getBoardRenameFileName()%>">
							<%= board.getBoardOriginalFileName() %>
						</a>
					<% } else { %>
					첨부파일 없음
					<%} %>
				</td>
			</tr>
			<tr>
				<th>내용</th>
				<td><%= board.getBoardContent() %></td>
			</tr>
			<tr>
				<th colspan="2">
				<% if(loginUser != null){ %>
					<a href="/first/views/board/boardReplyForm.jsp?bnum=<%= board.getBoardNum() %>&page=<%= currentPage %>">[댓글달기]</a>
				<%}  %>
				&nbsp; &nbsp;
				<% if(loginUser.getUserid().equals(board.getBoardWriter())){ %>
					<a href="/first/bupview?bnum=<%= board.getBoardNum() %>&page=<%= currentPage%>">[수정 페이지로 이동]</a>
					&nbsp; &nbsp;
					<a href="/first/bdelete?bnum=<%= board.getBoardNum() %>">[글 삭제]</a>
				<%}  %>
				&nbsp; &nbsp;
					<a href="/first/blist?page=<%=currentPage%>">[목록]</a>
				</th>
			</tr>
		</table>
<hr>
<%@ include file="../common/footer.jsp" %>
</body>
</html>