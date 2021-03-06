<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="member.model.vo.Member"%>
<% 
	Member loginUser = (Member)session.getAttribute("loginUser");
	String message = (String) request.getAttribute("message");
%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Practice Eight</title>
    <link rel="stylesheet" href="resources/css/style.css">
</head>
<body>

    <header class="header">
        <div class="header__square" onclick="toggleNav()">● ● ●</div>
        <div class="header__topbar">
            <ul>
                <li><span>도그하우스 소개</span></li>
                <li><span>FAQ</span></li>
                <li><span>1:1 문의하기</span></li>
                <li><span>이용 방법</span></li>
            </ul>
            <%if(loginUser == null) { %>
            <ul>
                <li><span id="loginBtn">로그인</span></li>
                <li><span id="registerBtn">회원가입</span></li>
                <li><span>아이디 / 비밀번호 찾기</span></li>
            </ul>
            <%} else {%>
            <ul> 
                <li><span><%= loginUser.getUserName()%>님</span></li>
                <li><span><a href="/testh/logout">로그아웃</a></span></li>
                <li><span>쪽지</span></li>
                <li><span>내 정보 보기</span></li>
            </ul>
            <% } %>
        </div>
    </header>

    <main class="main">
        <aside class="nav-sidebar">
            <ul>
                <li><span>펫시터 찾기</span></li>
                <li><a href=""> 펫시터 등록 </a></li>
                <li><a href="">자유게시판</a></li>
                <li><a href="">팁 게시판</a></li>
                <li><a href="">공지사항</a> </li>
                <li><a href="">마이페이지</a> </li>
            </ul>
        </aside>
        <div class="main__info">
            <hgroup class="main__titles">
                <h6 class="main__pre-title">The grand moment</h6>
                <h2 class="main__title">도그 하우스</h2>
                <h5 class="main__subtitle">Lorem ipsum, dolor sit amet consectetur adipisicing elit.</h5>
            </hgroup>
            <a href="" class="main__link">Explore the tour</a>
        </div>
        <div class="main__photo">
            <div class="main__navigation">
                <span class="navigation__arrow">←</span>
                <span class="navigation__pagess">1/4</span>
                <span class="navigation__arrow">→</span></div>
        </div>
        <div class="login-box">
            <img src="resources/images/usericon.png" class="avatar">
            <span class="close">x</span>
            <h1>Login Here</h1>
           
             <form action="/testh/login" method="POST">
                <p>User ID</p>
                <input type="text" name="userid" id="userid" placeholder="아이디 입력">
                <p>Password</p>
                <input type="password" name="userpwd" id="userpwd" placeholder="비밀번호 입력">
                <button type="submit" id="btn-submit">Login</button>
                <ul id="form-messages">
                </ul>
                <hr>
                <a href="#">Forget Password</a>
            </form>
        </div>
        <div class="register-box">
            <span class="close">x</span>
            <form action="/testh/minsert" method="POST" autocomplete="off" name="rform">
                <div class="reg1">
                    <p>User ID</p>
                    <input type="text" name="userid" placeholder="아이디 입력" required>&nbsp;
                    <!-- <input type="submit" name="submit" value="Check ID"> -->
                    <ul id="reg-check-id" class="error-messages">
                        <li>아이디가 이미 사용중입니다.</li>
                    </ul>
                    <p>Password</p>
                    <input type="password" name="userpwd" placeholder="비밀번호 입력" required>
                    <ul class="error-messages">
                        <li>text error!</li>
                    </ul>
                    <p>Repeat Password </p>
                    <input type="password" name="userpwd2" placeholder="비밀번호 확인" required>
                    <ul class="error-messages">
                        <li>text error!</li>
                    </ul>
                    <p>Name</p>
                    <input type="text" name="username" placeholder="이름 입력" required>
                    <ul class="error-messages">
                        <li>text error!</li>
                    </ul>
                    <p>Gender</p>
                    <input type="radio" name="gender" value="M" checked> 남자
                    &nbsp; <input type="radio" name="gender" value="F"> 여자
                </div>
                <div class="reg2">
                    <p>Age</p>
                    <input type="number" name="age" min="0" max="100" required placeholder="나이">
                    <ul class="error-messages">
                        <li>text error!</li>
                    </ul>
                    <p>Phone</p>
                    <input type="tel" name="phone" placeholder="핸드폰" required>
                    <ul class="error-messages">
                        <li>text error!</li>
                    </ul>
                    <p>Email</p>
                    <input type="email" name="email" placeholder="이메일">&nbsp;
                    <p>Interests</p>
                    <input type="checkbox" name="hobby" value="game">게임
                    <input type="checkbox" name="hobby" value="music">음악
                    <input type="checkbox" name="hobby" value="read">독서
                    <input type="checkbox" name="hobby" value="sports">운동
                    <input type="checkbox" name="hobby" value="trip">여행
                    <hr>
                    <input type="submit" id="reg-submit" value="가입하기">
                </div>
            </form>
        </div>
    </main>
    <script src="resources/js/main.js"></script>
</body>

</html>