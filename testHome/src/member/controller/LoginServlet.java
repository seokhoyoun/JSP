package member.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import member.model.service.MemberService;
import member.model.vo.Member;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String userId = request.getParameter("userid");
		String password = request.getParameter("password");
//		System.out.println(userId +"  "+password);
		Member loginUser = new MemberService().selectLogin(userId, password);
		System.out.println(loginUser);
	/*	if(loginUser != null) {
			HttpSession session = request.getSession();
			session.setAttribute("loginUser", loginUser);
			response.sendRedirect("/testh/index.jsp");
		} else {
			RequestDispatcher view = request.getRequestDispatcher("/index.jsp");
			request.setAttribute("message", "아이디가 존재하지 않거나 비밀번호가 다릅니다.");
			view.forward(request, response);
		}*/
		
		String result = null;
		if(loginUser != null) {
			HttpSession session = request.getSession();
			session.setAttribute("loginUser", loginUser);
			result = "ok";
		} else {
			if(userId.equals("") && !password.equals("")) {
				result = "아이디를 입력해주세요.";
			}
			else if (password.equals("") && !userId.equals("")){
				result = "비밀번호를 입력해주세요";
			}
			else if (userId.equals("") && password.equals("")) {
				result = "아이디와 비밀번호를 입력해주세요";
			}
			else if (userId != null && password != null) {
				result = "아이디와 비밀번호를 다시 확인해주세요";
			}
		}
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.append(result);
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
