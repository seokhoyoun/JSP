<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test jquery ajax</title>
<script type="text/javascript" src="/testa/resources/js/jquery-3.3.1.min.js"></script>
</head>
<body>
<h1>jQuery로 ajax 테스트</h1>
<hr>
<h2>1. 서버로 보내는 값 없고, 결과로 문자열 받아서 출력처리하는 방법: get</h2>
<p id="p1" style="width:300px; height:50px; border:1px solid black;"></p>
<button id="test1">테스트</button>

<h2>2. 서버로 값을보내고 결과로 문자열을 받아 출력 처리하는방법 : get 방식</h2>
아이디 : <input type="text" id="userid"><br>
암호 : <input type="password" id="userpwd"><br>
<p id="p2" style="width:300px; height:50px; border:1px solid black;"></p>
<button id="test2">테스트</button>
<script type="text/javascript">
	$(function(){
		$('#test2').click(function(){
			// 전송방식 get
			// $.get() $.ajax() 중 선택 사용
			//$.get() 사용
			$.get('/testa/t2.do', {userid: $('#userid').val(),
								   userpwd: $('#userpwd').val()},
								   function(data){
										$('#p2').text(data);
										//input의 기록된 값 지우기 처리
										$('#userid').val("");
										$('#userpwd').val("");
									});
			// $.ajax() 사용시
			$.ajax({
				url: '/testa/t2.do',
				type: 'GET',
				data: {userid: $('#userid').val(),
					   userpwd: $('#userpwd').val()},
				success: function(returnValue){
					$('#p2').html($('#p2').text() + "<br>"+ returnValue);
					$('#userid').val("");
					$('#userpwd').val("");
				}
			}); // ajax
			
		}); // click
	}); //ready
</script>
<hr>
<h2>3. 서버로 여러개의 값들을 보내고, 결과를 안받는 경우 : post 방식</h2>
제목 : <input id="title"><br>
작성자 : <input id="writer"><br>
내용 : <textarea rows="5" cols="50" id="content"></textarea><br>
<button id="test3">테스트</button>
<script>
	$(function(){
		$('#test3').click(function(){
		// 전송방식을 POST로 할 경우
		// $.post() 와 $.ajax() 중 선택 사용
		// $.post() 사용
		
		$.post('/testa/t3.do', 
				{
				title: $('#title').val(),
				writer: $('#writer').val(),
				content: $('#content').val()
				});
		// $.ajax() 사용시
		$.ajax({
			url: '/testa/t3.do',
			data: {
				title: $('#title').val(),
				writer: $('#writer').val(),
				content: $('#content').val()
			},
			type:"post"
		});
		
		// input 값 지우기
		$('#title').val("");
		$('#writer').val("");
		$('#content').val("");
		});
	}); //ready
</script>
<h2>4. 서버로 값 보내고, 결과로 JSON 객체로 받아 출력 처리하는 방법</h2>
번호 : <input type="number" id="no"><br>
<p id="p4" style="width:500px; height:200px; border:1px solid black;"></p>
<button id="test4">테스트</button>
<script>
	$(function(){
		$('#test4').click(function(){
			// $.getJSON() 과 $.ajax() 선택사용
			// $.getJSON
			$.getJSON('/testa/t4.do',{
				no: $('#no').val()
			},
			function(data){
				// 한개의 json 객체가문자열형태로
				// 전송이 왔을때는 받아서 바로 사용함
				// 한글 깨짐을 막기위해 문자 인코딩 처리한 값은 디코딩 처리: 자바스크립트 내장함수
				// decodeURIComponent() 사용함
				$('#p4').text(data.no+", "+data.userid+", "+data.userpwd+", "+decodeURIComponent(data.username)+", "+data.phone+", "+data.age+", "+data.email);
				
			});
			// $.ajax()
			$.ajax({
				url: '/testa/t4.do',
				data: {
					no: $('#no').val()
					},
				type: 'get',
				dataType: 'json',
				success: function(data){
					$('#p4').html($('#p4').text()+"<br>"+data.no+", "+data.userid+", "+data.userpwd+", "+decodeURIComponent(data.username)+", "+data.phone+", "+data.age+", "+data.email);
				}
			});
			
		}); //click	
	}); //ready
</script>
<h2>5. 서버로 값 보내고, 결과로 list나 map을 json배열로 받아 출력 처리하는 방법 : get</h2>
번호 : <input type="number" id="no2"><br>
<p id="p5" style="width:500px; height:300px; border:1px solid black;"></p>
<button id="test5">테스트</button>
<script>
	$(function(){
		$('#test5').click(function(){
			// $.getJSON() 과 $.ajax() 선택사용
			// $.getJSON 사용
			$.getJSON('/testa/t5.do',{
				no: $('#no2').val(),
			},
			function(data){
				console.log(data); // object 출력됨
				// 배열 객체를 문자열 형태로 바꿈
				const jsonStr1 = JSON.stringify(data);
				// 바뀐 문자열을 json 객체로 바꿈
				const json1 = JSON.parse(jsonStr1);
				
				let values1 ="";
				for(var i in json1.list){
					// 한글깨짐 막으려고 문자 인코딩 처리한 json객체 안의 값은 decodeURIComponent로 디코딩 처리
					values1 += json1.list[i].userid +" "+ json1.list[i].userpwd+" "+ decodeURIComponent(json1.list[i].username)+" "+ json1.list[i].age
					+" "+ json1.list[i].email+" "+ json1.list[i].phone+"<br>";
				} // for in 
				$('#p5').html(values1);
			});
			// $.ajax 사용
			$.ajax({
				url: '/testa/t5.do',
				data: {no : $('#no2').val()},
				type: 'POST',
				dataType: "json",
				success: function(data){
					const jsonStr = JSON.stringify(data);
					const json = JSON.parse(jsonStr);
					let values = $('#p5').html()+"<br>";
					for(var i in json.list){
						values += json.list[i].userid +" "+ json.list[i].userpwd+" "+ decodeURIComponent(json.list[i].username)+" "+ json.list[i].age
						+" "+ json.list[i].email+" "+ json.list[i].phone+"<br>";
					}
					$('#p5').html(values);
				}
			});
		}); // click;
	}); //ready
</script>
<!-- jquery ajax 사용 1 -->
<script>
	/* jQuery(document).ready(function(){
		// 이벤트 처리 코드 작성
	}); */
	$(function(){
		$('#test1').click(function(){
			// 컨트롤러를 요청하고 결과로 문자열만 받는 경우
			// jquery.get() 메소드 사용
			// $.get('요청 url', {전달이름: 전달값}, 리턴값 받아 처리할 콜백함수);
			// get 방식으로 요청됨
			$.get('/testa/t1.do',function(data){
				$('#p1').text(data);
			});
			
			// jquery.ajax() 메소드 사용
			$.ajax({
				url: "/testa/t1.do",
				type: "GET",
				success: function(data){
					$('#p1').html($('#p1').text()+ "<br>"+data);
				}
				
			});//ajax
		}); //click
	});// ready
	
</script>
</body>
</html>