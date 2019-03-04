package member.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.model.service.MemberService;
import member.model.vo.Member;

/**
 * Servlet implementation class MemberDetailServelet
 */
@WebServlet("/myinfo")
public class MemberDetailServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberDetailServelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 내 정보 보기 처리용 컨트롤러
		// 전송온 값에 한글이 있을경우 인코딩처리
		request.setCharacterEncoding("utf-8");
		// 전송온 값 꺼내서 변수 또는 객체에 저장
		String userid= request.getParameter("userid");
		//3 서비스 모델로 값 전달하고 결괍다기
		Member member = new MemberService().selectMenu(userid);
		// 4. 받은 결과를 가지고 성공 실패에 따라 뷰 선택하여 출력
		// 내보낼 값에 한글이 있다면 컨텐츠 타입을 지정
		response.setContentType("text/htmll charset=utf-8");
		RequestDispatcher view = null;
		if(member != null) {
			// 조회 성공
			view = request.getRequestDispatcher("views/member/memberDetailView.jsp");
			request.setAttribute("member", member);
			view.forward(request, response);
		} else {
			// 조회 실패
			view = request.getRequestDispatcher("views/member/memberError.jsp");
			request.setAttribute("message", userid +"님에 대한 조회를 실패했습니다.");
			view.forward(request, response);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
