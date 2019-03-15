package test.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import test.model.vo.User;

/**
 * Servlet implementation class TestServlet5
 */
@WebServlet("/t5.do")
public class TestServlet5 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServlet5() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// test5 버튼 클릭시 요청 되는 컨트롤러
		int no = Integer.parseInt(request.getParameter("no"));
		System.out.println("t5 : "+ no);
		
		ArrayList<User> userList = new ArrayList<>();
		userList.add(new User("1234","p1234","ㄱㄱㄱ",21,"asda@asd.com","12332333"));
		userList.add(new User("1234","p1234","ㄱㄱ2ㄱ",21,"asda@asd.com","12332333"));
		userList.add(new User("1234","p1234","ㄱㄱ3ㄱ",21,"asda@asd.com","12332333"));
		userList.add(new User("1234","p1234","ㄱㄱ4ㄱ",21,"asda@asd.com","12332333"));
		userList.add(new User("1234","p1234","ㄱㄱ5ㄱ",21,"asda@asd.com","12332333"));
		userList.add(new User("1234","p1234","ㄱㄱ6ㄱ",21,"asda@asd.com","12332333"));
		
		// 전송할 JSON 객체 하나 준비
		JSONObject sendJson = new JSONObject();
		// 리스트 객체들을 저장할 json 배열객체 준비
		JSONArray jsonArr = new JSONArray();
		// 리스트 또는 맵에서 객체를 하나씩 꺼냄
		for(User user : userList) {
			// 꺼낸 user 정보를 저장할 json객체 준비
			JSONObject userJson = new JSONObject();
			// user 객체가 가진 필드값 한개씩 꺼내서 jsonUser에 옮겨 기록 저장하기
			userJson.put("userid", user.getUserId());
			userJson.put("userpwd", user.getUserPwd());
			// json에서 한글깨짐 막으려면
			userJson.put("username", URLEncoder.encode(user.getUserName(), "utf-8"));
			userJson.put("age", user.getAge());
			userJson.put("email", user.getEmail());
			userJson.put("phone", user.getPhone());
			
			//json객체를 json 배열에 기록 저장
			jsonArr.add(userJson);
		}
		// json 배열은 전송할 수 없음.
		// 전송용 json 객체에 json 배열을 저장함
		sendJson.put("list", jsonArr);
		System.out.println("t5 : "+ sendJson.toJSONString());
		// 내보내기 : ajax 통신은 출력스트림 필요함
		response.setContentType("application/json");
		PrintWriter out = response.getWriter();
		out.append(sendJson.toJSONString());
		out.flush();
		out.close();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
