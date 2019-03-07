/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.37
 * Generated at: 2019-03-07 11:37:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.notice;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import notice.model.vo.*;
import member.model.vo.Member;

public final class noticeListView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/views/notice/../common/header.jsp", Long.valueOf(1551701000464L));
    _jspx_dependants.put("/views/notice/../common/footer.jsp", Long.valueOf(1551698660712L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("notice.model.vo");
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
      			"noticeError.jsp", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("    \r\n");
 
	HashMap<Integer,Notice> hm = (HashMap<Integer,Notice>) request.getAttribute("hm"); 
	Member loginUser = (Member) session.getAttribute("loginUser");
	
	// Collection<Notice> values = hm.values();
	ArrayList<Notice> list = new ArrayList<>(hm.values());
	Collections.sort(list, new NoticeNoDesc());

      out.write("\r\n");
      out.write("\t\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>First</title>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/first/resources/js/jquery-3.3.1.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function moveWritePage(){\r\n");
      out.write("\t// 글쓰기 버튼을 클릭하면 noticeWriteForm.jsp 파일로 이동함\r\n");
      out.write("\tlocation.href = \"/first/views/notice/noticeWriteForm.jsp\";\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("$(function(){\r\n");
      out.write("\tshowDiv();\r\n");
      out.write("\t\r\n");
      out.write("\t$(\"input[name=item]\").on(\"change\", function(){\r\n");
      out.write("\t\tshowDiv();\r\n");
      out.write("\t});\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("function showDiv(){\r\n");
      out.write("\tif($('input[name=\"item\"]').eq(0).is(\":checked\")){\r\n");
      out.write("\t\t$(\"#titleDiv\").css(\"display\", \"block\");\r\n");
      out.write("\t\t$(\"#writerDiv\").css(\"display\", \"none\");\r\n");
      out.write("\t\t$(\"#dateDiv\").css(\"display\", \"none\");\r\n");
      out.write("\t}\r\n");
      out.write("\tif($('input[name=\"item\"]').eq(1).is(\":checked\")){\r\n");
      out.write("\t\t$(\"#titleDiv\").css(\"display\", \"none\");\r\n");
      out.write("\t\t$(\"#writerDiv\").css(\"display\", \"block\");\r\n");
      out.write("\t\t$(\"#dateDiv\").css(\"display\", \"none\");\r\n");
      out.write("\t}\r\n");
      out.write("\tif($('input[name=\"item\"]').eq(2).is(\":checked\")){\r\n");
      out.write("\t\t$(\"#titleDiv\").css(\"display\", \"none\");\r\n");
      out.write("\t\t$(\"#writerDiv\").css(\"display\", \"none\");\r\n");
      out.write("\t\t$(\"#dateDiv\").css(\"display\", \"block\");\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
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
      out.write("<hr style=\"clear:both;\">\r\n");
      out.write("<h1 align=\"center\">공지사항 목록 보기</h1>\r\n");
      out.write("<br>\r\n");
      out.write('\r');
      out.write('\n');
 // 관리자일 때만 글쓰기 가능 
	/* if(loginUser != null && loginUser.getUserid().equals("admin")) */
	if(loginUser != null) { 
      out.write("\r\n");
      out.write("\t<center>\r\n");
      out.write("\t\t<button onclick=\"moveWritePage();\">글쓰기</button>\r\n");
      out.write("\t</center>\r\n");
}  
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("<center>\r\n");
      out.write("\t<div>\r\n");
      out.write("\t\t<h2>검색할 항목을 선택하세요</h2>\r\n");
      out.write("\t\t<input type=\"radio\" name=\"item\" value=\"title\" checked> 제목 &nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t<input type=\"radio\" name=\"item\" value=\"writer\"> 작성자 &nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t<input type=\"radio\" name=\"item\" value=\"date\"> 날짜 &nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"titleDiv\">\r\n");
      out.write("\t\t<form action=\"/first/nsearch\" method=\"POST\">\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"search\" value=\"title\">\r\n");
      out.write("\t\t\t<label>검색할 제목을 입력하세요 : <input name=\"keyword\"></label>\r\n");
      out.write("\t\t\t<input type=\"submit\" value=\"검색\">\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"writerDiv\">\r\n");
      out.write("\t\t<form action=\"/first/nsearch\" method=\"POST\">\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"search\" value=\"writer\">\r\n");
      out.write("\t\t\t<label>검색할 아이디를 입력하세요 : <input name=\"keyword\"></label>\r\n");
      out.write("\t\t\t<input type=\"submit\" value=\"검색\">\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"dateDiv\">\r\n");
      out.write("\t\t<form action=\"/first/nsearch\" method=\"POST\">\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"search\" value=\"date\">\r\n");
      out.write("\t\t\t<label>\r\n");
      out.write("\t\t\t검색할 날짜를 선택하세요 : \r\n");
      out.write("\t\t\t<input type=\"date\" name=\"begin\"> ~\r\n");
      out.write("\t\t\t<input type=\"date\" name=\"end\"> \r\n");
      out.write("\t\t\t</label>\r\n");
      out.write("\t\t\t<input type=\"submit\" value=\"검색\">\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("</center>\r\n");
      out.write("\r\n");
      out.write("<table align=\"center\" width=\"650px\" cellspacing=\"0\" border=\"1\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<th>번호</th>\r\n");
      out.write("\t\t<th>제목</th>\r\n");
      out.write("\t\t<th>작성자</th>\r\n");
      out.write("\t\t<th>날짜</th>\r\n");
      out.write("\t\t<th>첨부파일</th>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t");

		for(Notice notice : list){
	
      out.write("\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td align=\"center\">");
      out.print( notice.getNoticeNo());
      out.write("</td>\r\n");
      out.write("\t\t<td>\r\n");
      out.write("\t");
 if(loginUser != null){ 
      out.write("\r\n");
      out.write("\t\t<a href=\"/first/ndetail?no=");
      out.print( notice.getNoticeNo() );
      out.write('"');
      out.write('>');
      out.print( notice.getNoticeTitle());
      out.write("</a>\r\n");
      out.write("\t");
 } else {
      out.write("\r\n");
      out.write("\t\t");
      out.print( notice.getNoticeTitle() );
      out.write('\r');
      out.write('\n');
      out.write('	');
} 
      out.write("\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t\t<td align=\"center\">");
      out.print( notice.getNoticeWriter());
      out.write("</td>\r\n");
      out.write("\t\t<td align=\"center\">");
      out.print( notice.getNoticeDate() );
      out.write("</td>\r\n");
      out.write("\t\t<td align=\"center\">\r\n");
      out.write("\t\t");
 if(notice.getOriginalFilePath() != null){ 
      out.write("\r\n");
      out.write("\t\t\t★\r\n");
      out.write("\t\t");
 } else { 
      out.write("\r\n");
      out.write("\t\t&nbsp;\r\n");
      out.write("\t\t");
} 
      out.write("\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t");
} 
      out.write("\r\n");
      out.write("</table>\r\n");
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
