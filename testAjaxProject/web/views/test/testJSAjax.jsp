<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test javascript ajax</title>
</head>
<body>
<h1>JS로 ajax 테스트</h1>
<hr>
<h2>1. 서버로 보내는 값 없고, 결과로 문자열 받아서 출력처리하는 방법: get</h2>
<p id="p1" style="width:300px; height:50px; border:1px solid black;"></p>
<button id="test1">테스트</button>

<h2>2. 서버로 값을보내고 결과로 문자열을 받아 출력 처리하는방법 : get 방식</h2>
아이디 : <input type="text" id="userid"><br>
암호 : <input type="password" id="userpwd"><br>
<p id="p2" style="width:300px; height:50px; border:1px solid black;"></p>
<button id="test2">테스트</button>

<h3>3. 테스트 JS</h3>
<button id='btn'>Click Me!</button>
<div id="popup-div">yes</div>

<!-- javascript ajax 사용 1 -->
<script>
	// 3. JS
	const btn = document.getElementById('btn');
	const popup = document.getElementById('popup-div');
	
	btn.addEventListener('click',function(){
		popup.style.border = "1px solid red";
	});
	
	// 2. JS
	const btn2 = document.getElementById('test2');
	const p2 = document.getElementById('p2');
	const userid = document.getElementById('userid')
	const userpwd = document.getElementById('userpwd')
	
	btn2.addEventListener('click', ()=>{
		console.log(userid.value+"/"+userpwd.value);
		const request = new XMLHttpRequest();
		
		request.onload = ()=>{
			let text = request.responseText;
			p2.innerHTML = text;
		};
		const data = 'userid='+encodeURIComponent(userid.value)+'&userpwd='+encodeURIComponent(userpwd.value);
		request.open('POST', '/testa/t2.do');
		request.setRequestHeader('Content-Type','application/x-www-form-urlencoded');
		request.send(data);
		
	});
	// 1. JS
	const ajaxBtn1 = document.querySelector('#test1');
	const p1 = document.querySelector('#p1');
	ajaxBtn1.addEventListener('click', function(e){
		// 컨트롤러를 요청하고 결과로 문자열만 받는 경우
		console.log(e);
		const request = new XMLHttpRequest();
		
		request.onload = function(){
			let text = request.responseText;
			p1.textContent = text;
		};
		request.open('GET', '/testa/t1.do');
		request.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
		request.send();
	});
	
	
</script>

</body>
</html>