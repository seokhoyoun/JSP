<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="member.model.vo.Member"%>
<%
	Member member = (Member) request.getAttribute("member");
	Member loginUser = (Member) session.getAttribute("loginUser");
	// 취미 checked 처리
	String[] hobbies = member.getHobby().split(",");
	String[] checked = new String[9];
	for (String e : hobbies) {
		switch (e) {
			case "game" :
				checked[0] = "checked";
				break;
			case "reading" :
				checked[1] = "checked";
				break;
			case "music" :
				checked[2] = "checked";
				break;
			case "climb" :
				checked[3] = "checked";
				break;
			case "sport" :
				checked[4] = "checked";
				break;
			case "moive" :
				checked[5] = "checked";
				break;
			case "travel" :
				checked[6] = "checked";
				break;
			case "cook" :
				checked[7] = "checked";
				break;
			case "etc" :
				checked[8] = "checked";
				break;
		}
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보 상세보기</title>
<script type="text/javascript"
	src="/first/resources/js/jquery-3.3.1.min.js"></script>
<script type="text/javascript">
	$(function() {
		// 암호확인 입력 상자가 focus가 사라졌을 때,
		$("#userpwd2").blur(function() {
			console.log("포커스 사라짐");
			var pwd1 = $("#userpwd1").val();
			var pwd2 = $("#userpwd2").val();

			if (pwd1 !== pwd2) {
				alert("암호와 암호확인이 일치하지 않습니다.\n다시 입력하세요");
				$("#userpwd1").select();
			}
		});
	});
</script>
</head>
<body>
<% if(loginUser != null && loginUser.getUserid().equals("admin")){ %>
<%@ include file="../common/adminHeader.jsp" %>
<%} else { %>
<%@ include file="../common/header.jsp" %>
<%} %>
<hr style="clear:left;">
	<h1 align="center"><%=member.getUserid()%>님의 회원 정보 상세보기
	</h1>
	<br>
	<form action="/first/mupdate" method="POST">
		<table width="650px" align="center">
			<tr height="40px">
				<th width="150px">아이디</th>
				<td><input type="text" name="userid" id="userid"
					value="<%=member.getUserid()%>" readonly> &nbsp;
			</tr>
			<tr height="40px">
				<th width="150px">이름</th>
				<td><input type="text" name="username" id="username"
					value="<%=member.getUsername()%>" readonly></td>
			</tr>
			<tr height="40px">
				<th width="150px">암호</th>
				<td><input type="password" name="userpwd" id="userpwd1"
					value="<%=member.getUserpwd()%>"></td>
			</tr>
			<tr height="40px">
				<th width="150px">암호 확인</th>
				<td><input type="password" id="userpwd2"
					value="<%=member.getUserpwd()%>"></td>
			</tr>
			<tr height="40px">
				<th width="150px">성별</th>
				<td>
					<%
						if (member.getGender().equals("M")) {
					%><input type="radio"
					name="gender" value="M" checked> 남자 &nbsp; <input
					type="radio" name="gender" value="F"> 여자 <%
 	} else {
 %> <input
					type="radio" name="gender" value="M"> 남자 &nbsp; <input
					type="radio" name="gender" value="F" checked> 여자 <%
 	}
 %>
				</td>
			</tr>
			<tr height="40px">
				<th width="150px">나이</th>
				<td><input type="number" name="age" min="20" max="100"
					value="<%=member.getAge()%>"></td>
			</tr>
			<tr height="40px">
				<th width="150px">전화번호</th>
				<td><input type="tel" name="phone"
					value="<%=member.getPhone()%>"></td>
			</tr>
			<tr height="40px">
				<th width="150px">이메일</th>
				<td><input type="email" name="email"
					value="<%=member.getEmail()%>"></td>
			</tr>
			<tr height="40px">
				<th width="150px">취미</th>
				<td>
					<table>
						<tr>
							<td width="150px;"><input type="checkbox" name="hobby"
								<%=checked[0]%> value="game">게임</td>
							<td width="150px;"><input type="checkbox" name="hobby"
								<%=checked[1]%> value="reading">독서</td>
							<td width="150px;"><input type="checkbox" name="hobby"
								<%=checked[2]%> value="music">음악감상</td>
						</tr>
						<tr>
							<td width="150px;"><input type="checkbox" name="hobby"
								<%=checked[3]%> value="climb">등산</td>
							<td width="150px;"><input type="checkbox" name="hobby"
								<%=checked[4]%> value="sport">스포츠</td>
							<td width="150px;"><input type="checkbox" name="hobby"
								<%=checked[5]%> value="movie">영화</td>
						</tr>
						<tr>
							<td width="150px;"><input type="checkbox" name="hobby"
								<%=checked[6]%> value="travel">여행</td>
							<td width="150px;"><input type="checkbox" name="hobby"
								<%=checked[7]%> value="cook">요리</td>
							<td width="150px;"><input type="checkbox" name="hobby"
								<%=checked[8]%> value="etc">기타</td>
						</tr>
					</table>
				</td>
			</tr>
			<tr height="40px">
				<th width="150px">하고싶은 말</th>
				<td><textarea name="etc" row="3" cols="30"><%=member.getEtc()%>"</textarea></td>
			</tr>
			<tr height="40px">
				<th colspan="2"><input type="submit" value="수정하기">&nbsp;
					<input type="reset" value="작성취소"> &nbsp;
					<a href="/first/mdel?userid=<%= member.getUserid()%>">탈퇴하기</a> 
					<a href="/first/index.jsp">시작페이지로 이동</a></th>
			</tr>
		</table>
	</form>
	<%@ include file="../common/footer.jsp" %>
</body>
</html>