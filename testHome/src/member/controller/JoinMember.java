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
 * Servlet implementation class JoinMember
 */
@WebServlet("/minsert")
public class JoinMember extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JoinMember() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		Member member = new Member();
		member.setUserId(request.getParameter("userid"));
		member.setUserPwd(request.getParameter("userpwd"));
		member.setUserName(request.getParameter("username"));
		member.setAge(Integer.parseInt(request.getParameter("age")));
		member.setPhone(request.getParameter("phone"));
		member.setEmail(request.getParameter("email"));
		member.setHobby(String.join(",", request.getParameterValues("hobby")));
		
		int result = new MemberService().insertMember(member);
		response.setContentType("text/html; charset=utf-8");
		
		if(result > 0) {
			response.sendRedirect("/testh/index.jsp");
		} else {
			RequestDispatcher view = request.getRequestDispatcher("views/member/memberError.jsp");
			request.setAttribute("message", "회원가입 실패");
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
