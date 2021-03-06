<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="noticeError.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- <%
	HashMap<Integer, Notice> map = 
		(HashMap<Integer, Notice>)request.getAttribute("list");
	Member loginUser = (Member)session.getAttribute("loginUser");

	/* Collection<Notice> values = map.values();
	ArrayList<Notice> list = new ArrayList<Notice>(values); */
	ArrayList<Notice> list = new ArrayList<Notice>(map.values());
	Collections.sort(list, new NoticeNoDescending());
%> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>second</title>
<script type="text/javascript" src="/second/resources/js/jquery-3.3.1.min.js"></script>
<script type="text/javascript">
function moveWritePage(){
	//글쓰기 버튼을 클릭하면, noticeWriteForm.jsp 파일로 이동함
	location.href="/second/views/notice/noticeWriteForm.jsp";
}

$(function(){
	showDiv();
	
	$("input[name=item]").on("change", function(){
		showDiv();
	});
});

function showDiv(){
	if($("input[name=item]").eq(0).is(":checked")){
		$("#titleDiv").css("display", "block");
		$("#writerDiv").css("display", "none");
		$("#dateDiv").css("display", "none");
	}
	
	if($("input[name=item]").eq(1).is(":checked")){
		$("#titleDiv").css("display", "none");
		$("#writerDiv").css("display", "block");
		$("#dateDiv").css("display", "none");
	}
	
	if($("input[name=item]").eq(2).is(":checked")){
		$("#titleDiv").css("display", "none");
		$("#writerDiv").css("display", "none");
		$("#dateDiv").css("display", "block");
	}
}
</script>
</head>
<body>
<c:import url="../common/header.jsp" />
<hr style="clear:both;">
<h2 align="center">공지사항 목록 보기</h2>
<br>
<%-- 글쓰기 버튼은 로그인했을 때만 보여지게 함 --%>
<c:if test="${!empty loginUser }">
	<button onclick="moveWritePage();">글쓰기</button>
</c:if>
<br>
<%-- 검색기능 --%>
<div>
	<h2>검색할 항목을 선택하시오.</h2>
	<input type="radio" name="item" value="title" checked> 제목 
	&nbsp; &nbsp; &nbsp; 
	<input type="radio" name="item" value="writer"> 작성자 
	&nbsp; &nbsp; &nbsp; 
	<input type="radio" name="item" value="date"> 날짜 
</div>
<div id="titleDiv">
	<form action="/second/nsearch" method="post">
	<input type="hidden" name="search" value="title">
	<label>검색할 제목을 입력하시오 : 
	<input type="text" name="keyword"></label>
	<input type="submit" value="검색">
	</form>
</div>
<div id="writerDiv">
	<form action="/second/nsearch" method="post">
	<input type="hidden" name="search" value="writer">
	<label>검색할 작성자 아이디를 입력하시오 : 
	<input type="text" name="keyword"></label>
	<input type="submit" value="검색">
	</form>
</div>
<div id="dateDiv">
	<form action="/second/nsearch" method="post">
	<input type="hidden" name="search" value="date">
	<label>검색할 날짜를 선택하시오 : 
	<input type="date" name="begin"> ~ 
	<input type="date" name="end"></label>
	<input type="submit" value="검색">
	</form>
</div>
<br>
<%-- 공지 목록 출력 --%>
<table align="center" width="650" cellspacing="0" border="1">
<tr>
	<th>번호</th>
	<th>제목</th>
	<th>작성자</th>
	<th>날짜</th>
	<th>첨부파일</th>
</tr>
<%-- <c:forEach items="${list}" var="item">
	${item.key} = ${item.value.noticeTitle }
</c:forEach> --%>
<c:forEach items="${list}" var="item">
<tr>
	<td align="center">${item.value.noticeNo }</td>
	<td>
	<c:if test="${!empty loginUser }">
		<%-- <a href="/second/ndetail?no=${item.value.noticeNo }">${item.value.noticeTitle }</a> --%>
		<c:url var="ndetail" value="/ndetail">
			<c:param name="no" value="${item.value.noticeNo }"/>
		</c:url>
		<a href="${ndetail }">${item.value.noticeTitle }</a>
	</c:if>
	<c:if test="${empty loginUser }">
		${item.value.noticeTitle}
	</c:if>
	</td>
	<td align="center">${item.value.noticeWriter }</td>
	<td align="center">${item.value.noticeDate }</td>
	<td align="center">
	<c:if test="${!empty item.value.originalFilePath }">
		◎
	</c:if>
	<c:if test="${empty item.value.originalFilePath}">
		&nbsp;
	</c:if>
	</td>
</tr>
</c:forEach>
</table>

<hr>
<c:import url="../common/footer.jsp"/>
</body>
</html>







