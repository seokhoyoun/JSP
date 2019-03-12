/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.37
 * Generated at: 2019-03-12 11:57:34 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import board.model.vo.Board;
import member.model.vo.Member;

public final class boardTitleListView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/views/board/../common/header.jsp", Long.valueOf(1551701000464L));
    _jspx_dependants.put("/views/board/../common/footer.jsp", Long.valueOf(1551698660712L));
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
    _jspx_imports_classes.add("board.model.vo.Board");
    _jspx_imports_classes.add("java.util.ArrayList");
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
      out.write("    \r\n");
 
    ArrayList<Board> list = (ArrayList<Board>) request.getAttribute("list");
	int listCount = ((Integer) request.getAttribute("listCount")).intValue();
	int currentPage = ((Integer) request.getAttribute("currentPage")).intValue();
	int maxPage = ((Integer) request.getAttribute("maxPage")).intValue();
	int startPage = ((Integer) request.getAttribute("startPage")).intValue();
	int endPage = ((Integer) request.getAttribute("endPage")).intValue();
	
	Member loginUser = (Member) session.getAttribute("loginUser");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/first/resources/js/jquery-3.3.1.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tfunction showWriteForm(){\r\n");
      out.write("\t\tlocation.href = \"/first/views/board/boardWriteForm.jsp\";\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t$(function(){\r\n");
      out.write("\t\tshowDiv();\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(\"input[name=item]\").on(\"change\", function(){\r\n");
      out.write("\t\t\tshowDiv();\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("\tfunction showDiv(){\r\n");
      out.write("\t\tif($('input[name=\"item\"]').eq(0).is(\":checked\")){\r\n");
      out.write("\t\t\t$(\"#titleDiv\").css(\"display\", \"block\");\r\n");
      out.write("\t\t\t$(\"#writerDiv\").css(\"display\", \"none\");\r\n");
      out.write("\t\t\t$(\"#dateDiv\").css(\"display\", \"none\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif($('input[name=\"item\"]').eq(1).is(\":checked\")){\r\n");
      out.write("\t\t\t$(\"#titleDiv\").css(\"display\", \"none\");\r\n");
      out.write("\t\t\t$(\"#writerDiv\").css(\"display\", \"block\");\r\n");
      out.write("\t\t\t$(\"#dateDiv\").css(\"display\", \"none\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif($('input[name=\"item\"]').eq(2).is(\":checked\")){\r\n");
      out.write("\t\t\t$(\"#titleDiv\").css(\"display\", \"none\");\r\n");
      out.write("\t\t\t$(\"#writerDiv\").css(\"display\", \"none\");\r\n");
      out.write("\t\t\t$(\"#dateDiv\").css(\"display\", \"block\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>First</title>\r\n");
      out.write("<style>\r\n");
      out.write("\theader nav ul {\r\n");
      out.write("\t\tlist-style : none;\r\n");
      out.write("\t}\r\n");
      out.write("\theader nav ul li {\r\n");
      out.write("\t\tfloat: left;\r\n");
      out.write("\t\tmargin-right: 5px;\r\n");
      out.write("\t\tbackground-color : orange;\r\n");
      out.write("\t}\r\n");
      out.write("\theader nav ul li a {\r\n");
      out.write("\t\tdisplay: block;\r\n");
      out.write("\t\ttext-align: center;\r\n");
      out.write("\t\tpadding-top: 5px;\r\n");
      out.write("\t\tpadding-bottom: 0;\r\n");
      out.write("\t\twidth: 120px;\r\n");
      out.write("\t\theight: 35px;\r\n");
      out.write("\t\tcolor: navy;\r\n");
      out.write("\t\tfont-weight: bold;\r\n");
      out.write("\t\ttext-decoration:none;\r\n");
      out.write("\t}\r\n");
      out.write("\theader nav ul li a:hover{\r\n");
      out.write("\t\tbackground-color: olive;\r\n");
      out.write("\t\ttext-shadow : 1px 1px 2px white;\r\n");
      out.write("\t\tbox-shadow: 2px 2px 4px gray;\r\n");
      out.write("\t}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<header>\r\n");
      out.write("\t\t<nav>\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li><a  href=\"/first/index.jsp\">Home</a></li>\r\n");
      out.write("\t\t\t\t<li><a  href=\"/first/nlist\">공지사항</a></li>\r\n");
      out.write("\t\t\t\t<li><a  href=\"/first/blist?page=1\">게시판</a></li>\r\n");
      out.write("\t\t\t\t<li><a  href=\"\">메뉴1</a></li>\r\n");
      out.write("\t\t\t\t<li><a  href=\"\">메뉴2</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</nav>\r\n");
      out.write("\t</header>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("<hr style=\"clear:both\">\r\n");
      out.write("<h2 align=\"center\">게시글 목록</h2>\r\n");
      out.write("\t<h4 align=\"center\">총 게시글 갯수 : ");
      out.print( listCount );
      out.write("</h4>\r\n");
      out.write("\t");
 if(loginUser != null) { 
      out.write("\r\n");
      out.write("\t\t<div style=\"align:center; text-align:center;\">\r\n");
      out.write("\t\t\t<button onclick=\"showWriteForm();\"> 글쓰기</button>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t");
} 
      out.write("\r\n");
      out.write("\t<div>\r\n");
      out.write("\t\t<h2>검색할 항목을 선택하세요</h2>\r\n");
      out.write("\t\t<input type=\"radio\" name=\"item\" value=\"title\" checked> 제목 &nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t<input type=\"radio\" name=\"item\" value=\"writer\"> 작성자 &nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t<input type=\"radio\" name=\"item\" value=\"date\"> 날짜 &nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"titleDiv\">\r\n");
      out.write("\t\t<form action=\"/first/bsearcht\" method=\"POST\">\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"search\" value=\"title\">\r\n");
      out.write("\t\t\t<label>검색할 제목을 입력하세요 : <input name=\"keyword\"></label>\r\n");
      out.write("\t\t\t<input type=\"submit\" value=\"검색\">\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"writerDiv\">\r\n");
      out.write("\t\t<form action=\"/first/bsearchw\" method=\"POST\">\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"search\" value=\"writer\">\r\n");
      out.write("\t\t\t<label>검색할 아이디를 입력하세요 : <input name=\"keyword\"></label>\r\n");
      out.write("\t\t\t<input type=\"submit\" value=\"검색\">\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"dateDiv\">\r\n");
      out.write("\t\t<form action=\"/first/bsearchd\" method=\"POST\">\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"search\" value=\"date\">\r\n");
      out.write("\t\t\t<label>\r\n");
      out.write("\t\t\t검색할 날짜를 선택하세요 : \r\n");
      out.write("\t\t\t<input type=\"date\" name=\"begin\"> ~\r\n");
      out.write("\t\t\t<input type=\"date\" name=\"end\"> \r\n");
      out.write("\t\t\t</label>\r\n");
      out.write("\t\t\t<input type=\"submit\" value=\"검색\">\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("<br>\r\n");
      out.write("\t<table align=\"center\" border=\"1\" cellspacing=\"0\" width=\"700\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<th>번호</th>\r\n");
      out.write("\t\t\t<th>제목</th>\r\n");
      out.write("\t\t\t<th>작성자</th>\r\n");
      out.write("\t\t\t<th>날짜</th>\r\n");
      out.write("\t\t\t<th>조회수</th>\r\n");
      out.write("\t\t\t<th>첨부파일</th>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t");
 for(Board e : list) { 
      out.write("\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"center\">");
      out.print( e.getBoardNum() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t");
 if(e.getBoardReplyLev() == 1){  //원글의 댓글일 때
      out.write("\r\n");
      out.write("\t\t\t\t\t\t&nbsp; &nbsp; →\r\n");
      out.write("\t\t\t\t\t");
} else if(e.getBoardReplyLev() == 2) { // 댓글의 댓글일 때
      out.write("\r\n");
      out.write("\t\t\t\t\t\t&nbsp; &nbsp; &nbsp; &nbsp; →→\r\n");
      out.write("\t\t\t\t\t");
 }
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t");
 if(loginUser != null){ 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<a href=\"/first/bdetail?bnum=");
      out.print( e.getBoardNum() );
      out.write("&page=");
      out.print( currentPage);
      out.write('"');
      out.write('>');
      out.print( e.getBoardTitle() );
      out.write("</a>\r\n");
      out.write("\t\t\t\t\t");
 } else { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
      out.print( e.getBoardTitle() );
      out.write("\r\n");
      out.write("\t\t\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td align=\"center\">");
      out.print( e.getBoardWriter() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td align=\"center\">");
      out.print( e.getBoardDate() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td align=\"center\">");
      out.print( e.getBoardReadCount() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td align=\"center\">\r\n");
      out.write("\t\t\t\t");
if(e.getBoardOriginalFileName() != null){ 
      out.write("\r\n");
      out.write("\t\t\t\t\tº\r\n");
      out.write("\t\t\t\t");
} else { 
      out.write("\r\n");
      out.write("\t\t\t\t\t&nbsp;\r\n");
      out.write("\t\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t");
 } 
      out.write("\r\n");
      out.write("\t</table>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\t<div style=\"text-align:center\">\r\n");
      out.write("\t\t");
 if(currentPage <= 1){ 
      out.write("\r\n");
      out.write("\t\t[맨처음]\r\n");
      out.write("\t\t");
} else { 
      out.write("\r\n");
      out.write("\t\t\t<a href=\"/first/blist?page=1\">[맨처음]</a> &nbsp;\r\n");
      out.write("\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t");
 if((currentPage -10) < startPage && (currentPage -10) > 1){ 
      out.write("\r\n");
      out.write("\t\t\t<a href=\"/first/blist?page=");
      out.print( startPage - 10);
      out.write("\">[prev]</a>\r\n");
      out.write("\t\t");
} else {
      out.write("\r\n");
      out.write("\t\t\t[prev]\r\n");
      out.write("\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\t\t");
 for(int p = startPage; p <= endPage; p++){ 
			if(p == currentPage){ 
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<font color=\"red\" size=\"4\"><b>[");
      out.print( p );
      out.write("]</b></font>\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t");
 } else {
      out.write("\r\n");
      out.write("\t\t\t<a href=\"/first/blist?page=");
      out.print( p );
      out.write('"');
      out.write('>');
      out.print( p );
      out.write("</a>\r\n");
      out.write("\t\t");
 }} 
      out.write("\r\n");
      out.write("\t\t");
if((currentPage+10) > endPage && (currentPage + 10) < maxPage) { 
      out.write("\r\n");
      out.write("\t\t\t<a href=\"/first/blist?page=");
      out.print( endPage+10 );
      out.write("\">[next]&nbsp;</a>\r\n");
      out.write("\t\t");
} else {
      out.write("\r\n");
      out.write("\t\t\t[next] &nbsp;\r\n");
      out.write("\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t");
 if(currentPage >= maxPage) { 
      out.write("\r\n");
      out.write("\t\t\t[맨끝]&nbsp;\r\n");
      out.write("\t\t");
} else { 
      out.write("\r\n");
      out.write("\t\t\t<a href=\"/first/blist?page=");
      out.print( maxPage );
      out.write("\">[맨끝]</a>\r\n");
      out.write("\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("<hr>\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<footer align=\"center\">\r\n");
      out.write("copyright@kh.org 2019-03-04 master : 홍길동<br>\r\n");
      out.write("tel : 02-1234-5642 fax : 02-1233-1234 서울시 강남구 역삼동\r\n");
      out.write("</footer>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
