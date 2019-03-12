<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList, board.model.vo.Board, member.model.vo.Member" %>
    
<% 
    ArrayList<Board> list = (ArrayList<Board>) request.getAttribute("list");
	int listCount = ((Integer) request.getAttribute("listCount")).intValue();
	int currentPage = ((Integer) request.getAttribute("currentPage")).intValue();
	int maxPage = ((Integer) request.getAttribute("maxPage")).intValue();
	int startPage = ((Integer) request.getAttribute("startPage")).intValue();
	int endPage = ((Integer) request.getAttribute("endPage")).intValue();
	
	Member loginUser = (Member) session.getAttribute("loginUser");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>First</title>
<script type="text/javascript" src="/first/resources/js/jquery-3.3.1.min.js"></script>
<script type="text/javascript">
	function showWriteForm(){
		location.href = "/first/views/board/boardWriteForm.jsp";
	}
	
	$(function(){
		showDiv();
		
		$("input[name=item]").on("change", function(){
			showDiv();
		});
	});

	function showDiv(){
		if($('input[name="item"]').eq(0).is(":checked")){
			$("#titleDiv").css("display", "block");
			$("#writerDiv").css("display", "none");
			$("#dateDiv").css("display", "none");
		}
		if($('input[name="item"]').eq(1).is(":checked")){
			$("#titleDiv").css("display", "none");
			$("#writerDiv").css("display", "block");
			$("#dateDiv").css("display", "none");
		}
		if($('input[name="item"]').eq(2).is(":checked")){
			$("#titleDiv").css("display", "none");
			$("#writerDiv").css("display", "none");
			$("#dateDiv").css("display", "block");
		}
	}
</script>
</head>
<body>
<%@ include file="../common/header.jsp" %>
<hr style="clear:both">
<div style="padding-left:40%">
	<div>
		<h2>검색할 항목을 선택하세요</h2>
		<input type="radio" name="item" value="title" checked> 제목 &nbsp;&nbsp;&nbsp;
		<input type="radio" name="item" value="writer"> 작성자 &nbsp;&nbsp;&nbsp;
		<input type="radio" name="item" value="date"> 날짜 &nbsp;&nbsp;&nbsp;
	</div>
	<div id="titleDiv">
		<form action="/first/bsearcht" method="POST">
			<input type="hidden" name="search" value="title">
			<label>검색할 제목을 입력하세요 : <input name="keyword"></label>
			<input type="submit" value="검색">
		</form>
	</div>
	<div id="writerDiv">
		<form action="/first/bsearchw" method="POST">
			<input type="hidden" name="search" value="writer">
			<label>검색할 아이디를 입력하세요 : <input name="keyword"></label>
			<input type="submit" value="검색">
		</form>
	</div>
	<div id="dateDiv">
		<form action="/first/bsearchd" method="POST">
			<input type="hidden" name="search" value="date">
			<label>
			검색할 날짜를 선택하세요 : 
			<input type="date" name="begin"> ~
			<input type="date" name="end"> 
			</label>
			<input type="submit" value="검색">
		</form>
	</div>
</div>
	<h2 align="center">게시글 목록</h2>
	<h4 align="center">총 게시글 갯수 : <%= listCount %></h4>
	<% if(loginUser != null) { %>
		<div style="align:center; text-align:center;">
			<button onclick="showWriteForm();"> 글쓰기</button>
		</div>
	<%} %>
	<br>
	<table align="center" border="1" cellspacing="0" width="700">
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>날짜</th>
			<th>조회수</th>
			<th>첨부파일</th>
		</tr>
		<% for(Board e : list) { %>
			<tr>
				<td align="center"><%= e.getBoardNum() %></td>
				<td>
					<%-- 댓글일 때는 제목을 들여쓰기함 --%>
					<% if(e.getBoardReplyLev() == 1){  //원글의 댓글일 때%>
						&nbsp; &nbsp; →
					<%} else if(e.getBoardReplyLev() == 2) { // 댓글의 댓글일 때%>
						&nbsp; &nbsp; &nbsp; &nbsp; →→
					<% }%>
					<%-- 로그인 상태일 때만 상세보기 링크 설정 --%>
					<% if(loginUser != null){ %>
						<a href="/first/bdetail?bnum=<%= e.getBoardNum() %>&page=<%= currentPage%>"><%= e.getBoardTitle() %></a>
					<% } else { %>
						<%= e.getBoardTitle() %>
					<%} %>
				</td>
				<td align="center"><%= e.getBoardWriter() %></td>
				<td align="center"><%= e.getBoardDate() %></td>
				<td align="center"><%= e.getBoardReadCount() %></td>
				<td align="center">
				<%if(e.getBoardOriginalFileName() != null){ %>
					º
				<%} else { %>
					&nbsp;
				<%} %>
				</td>
			</tr>
		<% } %>
	</table>
	<br>
	<%-- 페이징 처리 --%>
	<div style="text-align:center">
		<% if(currentPage <= 1){ %>
		[맨처음]
		<%} else { %>
			<a href="/first/blist?page=1">[맨처음]</a> &nbsp;
		<%} %>
		
		<% if((currentPage -10) < startPage && (currentPage -10) > 1){ %>
			<a href="/first/blist?page=<%= startPage - 10%>">[prev]</a>
		<%} else {%>
			[prev]
		<% } %>
		<%-- 현재 페이지가 포함 된 페이지 그룹 숫자 출력처리 --%>
		<% for(int p = startPage; p <= endPage; p++){ 
			if(p == currentPage){ %>
			
			<font color="red" size="4"><b>[<%= p %>]</b></font>													
			<% } else {%>
			<a href="/first/blist?page=<%= p %>"><%= p %></a>
		<% }} %>
		<%if((currentPage+10) > endPage && (currentPage + 10) < maxPage) { %>
			<a href="/first/blist?page=<%= endPage+10 %>">[next]&nbsp;</a>
		<%} else {%>
			[next] &nbsp;
		<% } %>
		<% if(currentPage >= maxPage) { %>
			[맨끝]&nbsp;
		<%} else { %>
			<a href="/first/blist?page=<%= maxPage %>">[맨끝]</a>
		<% } %>
		
	</div>
	
	
	
<hr>
<%@ include file="../common/footer.jsp" %>
</body>
</html>