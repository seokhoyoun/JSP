/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.37
 * Generated at: 2019-04-09 07:48:47 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class boardReplyForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/views/board/../common/header.jsp", Long.valueOf(1554710042576L));
    _jspx_dependants.put("/views/board/../common/footer.jsp", Long.valueOf(1554710042575L));
    _jspx_dependants.put("jar:file:/C:/Users/user2/Documents/GitHub/JSP/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/secondWebProject/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1554712457956L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
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

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>second</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
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
      out.write("\r\n");
      out.write("<hr style=\"clear:both;\">\r\n");
      out.write("<h2 align=\"center\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.bnum }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("번 글의 댓글달기</h2>\r\n");
      out.write("<form action=\"/second/breply\" method=\"post\">\r\n");
      out.write("<input type=\"hidden\" name=\"bnum\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.bnum }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("<input type=\"hidden\" name=\"page\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.page }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("<table align=\"center\">\r\n");
      out.write("<tr><th>제목</th><td><input type=\"text\" name=\"btitle\"></td></tr>\r\n");
      out.write("<tr><th>작성자</th><td><input type=\"text\" name=\"bwriter\" readonly value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginUser.userId }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"></td></tr>\r\n");
      out.write("<tr><th>내용</th><td><textarea cols=\"50\" rows=\"5\" name=\"bcontent\"></textarea></td></tr>\r\n");
      out.write("<tr><th colspan=\"2\">\r\n");
      out.write("\t<input type=\"submit\" value=\"댓글등록\"> &nbsp; \r\n");
      out.write("\t<a href=\"javascript:history.go(-1);\">[이전 페이지로 이동]</a> &nbsp;\r\n");
      out.write("\t<a href=\"/second/blist?page=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.page }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">[목록]</a>\r\n");
      out.write("</th></tr>\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
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
