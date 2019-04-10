<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>second</title>
</head>
<body>
<c:import url="../common/header.jsp" />
<hr style="clear:both;">
<h2 align="center">${board.boardNum}번 공지글 상세보기</h2>
<br>
<table align="center" cellpadding="10" cellspacing="0" 
border="1" width="500">
<tr>
	<th>제목</th>
	<td>${board.boardTitle }</td>
</tr>
<tr>
	<th>작성자</th>
	<td>${board.boardWriter }</td>
</tr>
<tr>
	<th>첨부파일</th>
	<td>
	<c:if test="${!empty board.boardOriginalFileName }">
			<%-- <a href="/second/bfdown?ofile=${boardOriginalFileName }&rfile=${ boardRenameFileName} ">${boardOriginalFileName }</a> --%>
			<c:url var="bfdown" value="/bfdown">
				<c:param name="ofile" value="${boardOriginalFileName }"/>
				<c:param name="rfile" value="${ boardRenameFileName}" />
			</c:url>
			<a href="${bfdown }">다운로드</a>
	</c:if>
	<c:if test="${empty board.boardOriginalFileName }">
			첨부파일없음
	</c:if>
	</td>
</tr>
<tr>
	<th>내용</th>
	<td>${board.boardContent }</td>
</tr>
<tr>
	<th colspan="2">
	<c:if test="${!empty loginUser and board.boardReplyLev < 2 }">
		<%-- <a href="/second/views/board/boardReplyForm.jsp?bnum=${board.boardNum }&page=${currentPage}">[댓글달기]</a> --%>
		<c:url var="reply" value="/views/board/boardReplyForm.jsp">
			<c:param name="bnum" value="${board.boardNum }" />
			<c:param name="page" value="${currentPage }" />
		</c:url>
		<a href="${reply }">[댓글달기]</a>
	</c:if>
	&nbsp; &nbsp;
	<c:if test="${loginUser.userId eq board.boardWriter }">
		<%-- <a href="/second/bupview?bnum=${board.boardNum }&page=${currentPage}">[수정페이지로 이동]</a> --%>
		<c:url var="update" value="/bupview">
			<c:param name="bnum" value="${board.boardNum }" />
			<c:param name="page" value="${currentPage }" />
		</c:url>
		<a href="${update }">[수정페이지로 이동]</a> 
		&nbsp; &nbsp;
		<%-- <a href="/second/bdelete?bnum=${board.boardNum }">[글삭제]</a> --%>
		<c:url var="del" value="/bdelete">
			<c:param name="bnum" value="${board.boardNum }"/>
		</c:url>
		<a href="${del }"></a>
	</c:if>
	&nbsp; &nbsp;
	<%-- <a href="/second/blist?page=${currentPage}">[목록]</a> --%>
	<c:url var="blist" value="/blist">
		<c:param name="page" value="${currentPage }"></c:param>
	</c:url>
	<a href="${blist }"></a>
	</th>	
</tr>

</table>


<hr>
<c:import url="../common/footer.jsp" />
</body>
</html>





