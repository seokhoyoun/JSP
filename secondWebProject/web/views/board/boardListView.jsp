<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ tablib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- <c:set var="list" value="${ requestScope.list"} ></c:set>
	<c:set var="listCount" value="${requestScope.listCount }"></c:set>
	<c:set var="startCount" value="${requestScope.startPage }"></c:set>
	<c:set var="endPage" value="${requestScope.endPage }"></c:set>
	<c:set var="maxPage" value="${requestScope.maxPage }"></c:set>
	<c:set var="currentPage" value="${requestScope.currentPage }"></c:set> --%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>second</title>
<script type="text/javascript"
	src="/second/resources/js/jquery-3.3.1.min.js"></script>
<script type="text/javascript">
	function showWriteForm() {
		location.href = "/second/views/board/boardWriteForm.jsp";
	}

	$(function() {
		showDiv();

		$("input[name=item]").on("change", function() {
			showDiv();
		});
	});

	function showDiv() {
		if ($("input[name=item]").eq(0).is(":checked")) {
			$("#titleDiv").css("display", "block");
			$("#writerDiv").css("display", "none");
			$("#dateDiv").css("display", "none");
		}

		if ($("input[name=item]").eq(1).is(":checked")) {
			$("#titleDiv").css("display", "none");
			$("#writerDiv").css("display", "block");
			$("#dateDiv").css("display", "none");
		}

		if ($("input[name=item]").eq(2).is(":checked")) {
			$("#titleDiv").css("display", "none");
			$("#writerDiv").css("display", "none");
			$("#dateDiv").css("display", "block");
		}
	}
</script>
</head>
<body>
	<%@ include file="../common/header.jsp"%>
	<hr style="clear: both;">
	<h2 align="center">게시글 목록</h2>
	<h4 align="center">총 게시글 갯수 : ${requestScope.listCount }</h4>
	<c:if test="${!empty loginUser }">
		<div style="align: center; text-align: center;">
			<button onclick="showWriteForm();">글쓰기</button>
		</div>
	</c:if>
	<br>
	<%-- 검색기능 --%>
	<center>
		<div>
			<h2>검색할 항목을 선택하시오.</h2>
			<input type="radio" name="item" value="title" checked> 제목
			&nbsp; &nbsp; &nbsp; <input type="radio" name="item" value="writer">
			작성자 &nbsp; &nbsp; &nbsp; <input type="radio" name="item" value="date">
			날짜
		</div>
		<div id="titleDiv">
			<form action="/second/bsearcht" method="post">
				<label>검색할 제목을 입력하시오 : <input type="text" name="keyword"></label>
				<input type="submit" value="검색">
			</form>
		</div>
		<div id="writerDiv">
			<form action="/second/bsearchw" method="post">
				<label>검색할 작성자 아이디를 입력하시오 : <input type="text"
					name="keyword"></label> <input type="submit" value="검색">
			</form>
		</div>
		<div id="dateDiv">
			<form action="/second/bsearchd" method="post">
				<label>검색할 날짜를 선택하시오 : <input type="date" name="begin">
					~ <input type="date" name="end"></label> <input type="submit"
					value="검색">
			</form>
		</div>
	</center>
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
		<c:forEach items="${list }" var="b">
			<tr>
				<td align="center">${b.boardNum }</td>
				<td>
					<%-- 댓글일 때는 제목을 들여쓰기함 --%> <c:if test="${b.boardReplyLev eq 1 }">
		&nbsp; &nbsp; ▶ 
		</c:if> 
		<c:if test="${boardReplyLev eq 2 }">
		&nbsp; &nbsp; &nbsp; &nbsp; ▶▶ 
		</c:if> <%-- 로그인 상태일 때만 상세보기 링크 설정함 --%> 
 	<c:if test="${!empty loginUser}">
		 <a href="/second/bdetail?bnum=${b.boardNum }&page="${currentPage}"></a>
 	</c:if>
	<c:if test="${ empty loginUser }">
		${b,boardNum}
	</c:if>
				</td>
				<td align="center">${b.boardWriter }</td>
				<td align="center">${b.boardDate }</td>
				<td align="center">${b.boardReadCount }</td>
				<td align="center">
	<c:if test="${!empty b.boardOriginalFileName}">*</c:if>
	<c:if test="${empty b.boardOriginalFileName }">&nbsp;</c:if>
				</td>
			</tr>
		</c:forEach>
	</table>
	<br>
	<%-- 페이징 처리 --%>
	<div style="text-align: center;">
		<%
			if (currentPage <= 1) {
		%>
		<c:if test="${currentPage <= 1}"
		[맨처음]&nbsp;
		</c:if>
		<%
			} else {
		%>
		<a href="/second/blist?page=1">[맨처음]</a>&nbsp;
		<%
			}
		%>
		<%
			if ((currentPage - 10) < startPage && (currentPage - 10) > 1) {
		%>
		<a href="/second/blist?page=<%=startPage - 10%>">[prev]</a>
		<%
			} else {
		%>
		[prev]
		<%
			}
		%>
		<%-- 현재 페이지가 포함된 페이지 그룹 숫자 출력 처리 --%>
		<%
			for (int p = startPage; p <= endPage; p++) {
				if (p == currentPage) {
		%>
		<font color="red" size="4"><b>[<%=p%>]
		</b></font>
		<%
			} else {
					if (search != null && search.equals("title")) {
		%>
		<a href="/second/bsearcht?keyword=<%=keyword%>&page=<%=p%>"><%=p%></a>
		<%
			} else if (search != null && search.equals("writer")) {
		%>
		<a href="/second/bsearchw?keyword=<%=keyword%>&page=<%=p%>"><%=p%></a>
		<%
			} else if (search != null && search.equals("date")) {
		%>
		<a
			href="/second/bsearchd?begin=<%=begin%>&end=<%=end%>&page=<%=p%>"><%=p%></a>
		<%
			} else {
		%>
		<a href="/second/blist?page=<%=p%>"><%=p%></a>
		<%
			}
				}
			}
		%>&nbsp;
		<%
			if ((currentPage + 10) > endPage && (currentPage + 10) < maxPage) {
		%>
		<a href="/second/blist?page=<%=endPage + 10%>">[next]</a>&nbsp;
		<%
			} else {
		%>
		[next]&nbsp;
		<%
			}
		%>
		<%
			if (currentPage >= maxPage) {
		%>
		[맨끝]
		<%
			} else {
		%>
		<a href="/second/blist?page=<%=maxPage%>">[맨끝]</a>
		<%
			}
		%>
	</div>
	<hr>
	<%@ include file="../common/footer.jsp"%>
</body>
</html>







