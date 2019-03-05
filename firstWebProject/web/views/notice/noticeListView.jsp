<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ page import="java.util.*, notice.model.vo.*, member.model.vo.Member" %>    
<% 
	HashMap<Integer,Notice> hm = (HashMap<Integer,Notice>) request.getAttribute("hm"); 
	Member loginUser = (Member) session.getAttribute("loginUser");
	
	// Collection<Notice> values = hm.values();
	ArrayList<Notice> list = new ArrayList<>(hm.values());
	Collections.sort(list, new NoticeNoDesc());
%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>First</title>
</head>
<body>
<%@ include file="../common/header.jsp"%>
<hr style="clear:both;">
<h1 align="center">공지사항 목록 보기</h1>
<table align="center" width="650px" cellspacing="0" border="1">
	<tr>
		<th>번호</th>
		<th>제목</th>
		<th>작성자</th>
		<th>날짜</th>
		<th>첨부파일</th>
	</tr>
	<%
		for(Notice notice : list){
	%>
	<tr>
		<td align="center"><%= notice.getNoticeNo()%></td>
		<td>
	<% if(loginUser != null){ %>
		<a href="/first/ndetail?no=<%= notice.getNoticeNo() %>"><%= notice.getNoticeTitle()%></a>
	<% } else {%>
		<%= notice.getNoticeTitle() %>
	<%} %>
		</td>
		<td align="center"><%= notice.getNoticeWriter()%></td>
		<td align="center"><%= notice.getNoticeDate() %></td>
		<td align="center">
		<% if(notice.getOriginalFilePath() != null){ %>
			★
		<% } else { %>
		&nbsp;
		<%} %>
		</td>
	</tr>
	<%} %>
</table>
<hr>
<%@ include file="../common/footer.jsp" %>
</body>
</html>