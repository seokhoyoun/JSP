/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.37
 * Generated at: 2019-04-08 10:18:05 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import member.model.vo.Member;

public final class memberError_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/views/member/../common/header.jsp", Long.valueOf(1554710042576L));
    _jspx_dependants.put("/views/member/../common/adminHeader.jsp", Long.valueOf(1554710042575L));
    _jspx_dependants.put("/views/member/../common/footer.jsp", Long.valueOf(1554710042575L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("member.model.vo.Member");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    java.lang.Throwable exception = org.apache.jasper.runtime.JspRuntimeLibrary.getThrowable(request);
    if (exception != null) {
      response.setStatus(javax.servlet.http.HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
    }
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");

	//스크립트릿(scriptlet) 태그 영역
	//자바 코드 작성 영역임
	Member loginUser = (Member)session.getAttribute("loginUser");
	String message = (String)request.getAttribute("message");

      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>second</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
 if(loginUser != null && loginUser.getUserId().equals("admin")){ 
      out.write('\r');
      out.write('\n');
      out.write('	');
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title></title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("header nav ul { list-style: none; } \r\n");
      out.write("header nav ul li {\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("\tmargin-right: 5px;\r\n");
      out.write("\tbackground: black;\r\n");
      out.write("}\r\n");
      out.write("header nav ul li a {\r\n");
      out.write("\tdisplay: block;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tpadding-top: 5px;\r\n");
      out.write("\tpadding-bottom: 0;\r\n");
      out.write("\twidth: 120px;\r\n");
      out.write("\theight: 35px;\r\n");
      out.write("\tcolor: white;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("}\r\n");
      out.write("header nav ul li a:hover {\r\n");
      out.write("\tbackground: red;\r\n");
      out.write("\ttext-shadow: 1px 1px 2px white;\r\n");
      out.write("\tbox-shadow: 2px 2px 4px gray;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<header>\r\n");
      out.write("<nav>\r\n");
      out.write("<ul>\r\n");
      out.write("\t<li><a href=\"/second/index.jsp\">home</a></li>\r\n");
      out.write("\t<li><a href=\"/second/mall\">회원관리</a></li>\r\n");
      out.write("\t<li><a href=\"\">공지사항관리</a></li>\r\n");
      out.write("\t<li><a href=\"\">게시글관리</a></li>\r\n");
      out.write("\t<li><a href=\"\">메뉴</a></li>\r\n");
      out.write("</ul>\r\n");
      out.write("</nav>\r\n");
      out.write("</header>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write('\r');
      out.write('\n');
 }else{ 
      out.write('\r');
      out.write('\n');
      out.write('	');
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>second</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("header nav ul { list-style: none; } \r\n");
      out.write("header nav ul li {\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("\tmargin-right: 5px;\r\n");
      out.write("\tbackground: orange;\r\n");
      out.write("}\r\n");
      out.write("header nav ul li a {\r\n");
      out.write("\tdisplay: block;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tpadding-top: 5px;\r\n");
      out.write("\tpadding-bottom: 0;\r\n");
      out.write("\twidth: 120px;\r\n");
      out.write("\theight: 35px;\r\n");
      out.write("\tcolor: navy;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("}\r\n");
      out.write("header nav ul li a:hover {\r\n");
      out.write("\tbackground: olive;\r\n");
      out.write("\ttext-shadow: 1px 1px 2px white;\r\n");
      out.write("\tbox-shadow: 2px 2px 4px gray;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<header>\r\n");
      out.write("<nav>\r\n");
      out.write("<ul>\r\n");
      out.write("\t<li><a href=\"/second/index.jsp\">home</a></li>\r\n");
      out.write("\t<li><a href=\"/second/nlist\">공지사항</a></li>\r\n");
      out.write("\t<li><a href=\"/second/blist?page=1\">게시글</a></li>\r\n");
      out.write("\t<li><a href=\"\">메뉴</a></li>\r\n");
      out.write("\t<li><a href=\"\">메뉴</a></li>\r\n");
      out.write("</ul>\r\n");
      out.write("</nav>\r\n");
      out.write("</header>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write('\r');
      out.write('\n');
 } 
      out.write("\r\n");
      out.write("<hr style=\"clear:left;\">\r\n");
      out.write("<h1>회원서비스 오류</h1>\r\n");
 if(exception != null){ 
      out.write("\r\n");
      out.write("JSP 예외발생 : ");
      out.print( exception.getMessage() );
      out.write(" <br>\r\n");
 }else{ 
      out.write("\r\n");
      out.write("서블릿이 전달한 메세지 : ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${message }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("  <br>\r\n");
 } 
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("<a href=\"/second/index.jsp\">시작페이지로 이동</a> <br>\r\n");
      out.write("<hr>\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title></title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<footer align=\"center\">\r\n");
      out.write("copyright@kh.org 2019-03-04 master : 홍길동 <br>\r\n");
      out.write("tel : 02-1234-5678, 서울시 강남구 역삼동 777, fax : 02-1111-2356\r\n");
      out.write("</footer>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
