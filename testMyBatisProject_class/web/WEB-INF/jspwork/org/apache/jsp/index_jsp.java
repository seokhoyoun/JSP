/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.37
 * Generated at: 2019-04-12 12:11:50 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("jar:file:/D:/수업자료/server_workspace/testMyBatisProject/web/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/views/common/header.jsp", Long.valueOf(1554882924149L));
    _jspx_dependants.put("/views/common/footer.jsp", Long.valueOf(1551698658000L));
    _jspx_dependants.put("/views/common/adminHeader.jsp", Long.valueOf(1554882924163L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1554712464388L));
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

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
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
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
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>testm</title>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/testm/resources/js/jquery-3.3.1.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(function(){\r\n");
      out.write("\t\t//주기적으로 반복 실행되게 되게 하려면\r\n");
      out.write("\t\tsetInterval(function(){ \r\n");
      out.write("\t\t\tvar currentTime = new Date();\r\n");
      out.write("\t\t\tvar hour = currentTime.getHours();\t\t\t\r\n");
      out.write("\t\t\tvar minute = currentTime.getMinutes();\r\n");
      out.write("\t\t\tvar second = currentTime.getSeconds();\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$(\"#clock\").html(\"<h1 align='center'>\" + hour + \" : \" \r\n");
      out.write("\t\t\t\t\t+ minute + \" : \" + second +\r\n");
      out.write("\t\t\t\t\t\"</h1>\");\r\n");
      out.write("\t\t}, 1000);\r\n");
      out.write("\t\t//시간은 1000 이 1초임\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//게시글 조회수 많은 순으로 5개 조회 결과 출력 처리\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\turl: \"/testm/btop5\",\r\n");
      out.write("\t\t\ttype: \"get\",\r\n");
      out.write("\t\t\tdataType: \"json\",\r\n");
      out.write("\t\t\tsuccess: function(data){\r\n");
      out.write("\t\t\t\tconsole.log(\"btop5 : \" + data);\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tvar jsonStr = JSON.stringify(data);\r\n");
      out.write("\t\t\t\tvar json = JSON.parse(jsonStr);\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tvar values = \"\";\r\n");
      out.write("\t\t\t\tfor(var i in json.list){\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t} //for in\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t//테이블에 추가\r\n");
      out.write("\t\t\t\t$(\"#toplist\").html($(\"#toplist\").html() + values);\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\terror: function(jqXHR, textStatus, errorThrown){\r\n");
      out.write("\t\t\t\tconsole.log(\"error : \" + jqXHR + \", \" + \r\n");
      out.write("\t\t\t\t\t\ttextStatus + \", \" + errorThrown);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//최근 등록된 공지글 5개 조회 출력 처리\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\turl: \"/testm/ntop5\",\r\n");
      out.write("\t\t\ttype: \"get\",\r\n");
      out.write("\t\t\tdataType: \"json\",\r\n");
      out.write("\t\t\tsuccess: function(data){\r\n");
      out.write("\t\t\t\tconsole.log(\"success : \" + data);\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tvar jsonStr = JSON.stringify(data);\r\n");
      out.write("\t\t\t\tvar json = JSON.parse(jsonStr);\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tvar values = \"\";\r\n");
      out.write("\t\t\t\tfor(var i in json.list){\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_005fif_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_005fif_005f3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t} //for in\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t$(\"#newnotice\").html($(\"#newnotice\").html() + values);\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\terror: function(jqXHR, textStatus, errorThrown){\r\n");
      out.write("\t\t\t\tconsole.log(\"error : \" + jqXHR + \", \" + \r\n");
      out.write("\t\t\t\t\t\ttextStatus + \", \" + errorThrown);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<h1>testMyBatisProject</h1>\r\n");
      if (_jspx_meth_c_005fif_005f4(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_c_005fif_005f5(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<hr style=\"clear:left;\">\r\n");
      if (_jspx_meth_c_005fif_005f6(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_c_005fif_005f7(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<div id=\"clock\" style=\"float:left;margin-left:20px;width:200px;height:70px;padding:0;background:black;color:white\">\r\n");
      out.write("</div>\r\n");
      out.write("<hr style=\"clear:left;\">\r\n");
      out.write("<section>\r\n");
      out.write("<div style=\"float:left;border:1px solid navy;padding:5px;margin:5px\">\r\n");
      out.write("\t<h4>인기 게시글</h4>\r\n");
      out.write("\t<table id=\"toplist\" border=\"1\" cellspacing=\"0\">\r\n");
      out.write("\t<tr><th>번호</th><th width=\"200\">제목</th><th>조회수</th></tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("</div>\r\n");
      out.write("<div style=\"float:left;border:1px solid navy;padding:5px;margin:5px\">\r\n");
      out.write("\t<h4>신규 공지글</h4>\r\n");
      out.write("\t<table id=\"newnotice\" border=\"1\" cellspacing=\"0\">\r\n");
      out.write("\t<tr><th>번호</th><th width=\"200\">제목</th><th>날짜</th></tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("</div>\r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<br style=\"clear:left\"><br><br>\r\n");
      out.write("<hr style=\"clear:left\">\r\n");
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /index.jsp(40,5) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ !empty loginUser }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\tvalues += \"<tr><td>\" + json.list[i].bnum\r\n");
          out.write("\t\t\t\t\t\t+ \"</td><td><a href='/testm/bdetail?bnum=\" \r\n");
          out.write("\t\t\t\t\t\t+ json.list[i].bnum + \"&page=1'>\" \r\n");
          out.write("\t\t\t\t\t\t+ decodeURIComponent(json.list[i].btitle).replace(/\\+/gi, \" \")      \r\n");
          out.write("\t\t\t\t\t\t+ \"</a></td><td>\" + json.list[i].rcount\r\n");
          out.write("\t\t\t\t\t\t+ \"</td></tr>\";\r\n");
          out.write("\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f1_reused = false;
    try {
      _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f1.setParent(null);
      // /index.jsp(48,5) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ empty loginUser }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
      if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\tvalues += \"<tr><td>\" + json.list[i].bnum\r\n");
          out.write("\t\t\t\t\t\t\t+ \"</td><td>\" + decodeURIComponent(json.list[i].btitle).replace(/\\+/gi, \" \")      \r\n");
          out.write("\t\t\t\t\t\t\t+ \"</td><td>\" + json.list[i].rcount\r\n");
          out.write("\t\t\t\t\t\t\t+ \"</td></tr>\";\r\n");
          out.write("\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      _jspx_th_c_005fif_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f2_reused = false;
    try {
      _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f2.setParent(null);
      // /index.jsp(78,5) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!empty loginUser }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
      if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\tvalues += \"<tr><td>\" + json.list[i].no \r\n");
          out.write("\t\t\t\t\t\t+ \"</td><td><a href='/testm/ndetail?no=\"\r\n");
          out.write("\t\t\t\t\t\t+ json.list[i].no + \"'>\"\r\n");
          out.write("\t\t\t\t\t\t+ decodeURIComponent(json.list[i].ntitle).replace(/\\+/gi, \" \")\r\n");
          out.write("\t\t\t\t\t\t+ \"</a></td><td>\" + json.list[i].ndate + \"</td></tr>\";\r\n");
          out.write("\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fif_005f2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
      _jspx_th_c_005fif_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f2, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f2_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f3(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f3_reused = false;
    try {
      _jspx_th_c_005fif_005f3.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f3.setParent(null);
      // /index.jsp(85,5) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty loginUser }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f3 = _jspx_th_c_005fif_005f3.doStartTag();
      if (_jspx_eval_c_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\tvalues += \"<tr><td>\" + json.list[i].no + \"</td><td>\" \r\n");
          out.write("\t\t\t\t\t\t\t+ decodeURIComponent(json.list[i].ntitle).replace(/\\+/gi, \" \")\r\n");
          out.write("\t\t\t\t\t\t\t+ \"</td><td>\" + json.list[i].ndate + \"</td></tr>\";\r\n");
          out.write("\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fif_005f3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f3);
      _jspx_th_c_005fif_005f3_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f3, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f3_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f4(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f4_reused = false;
    try {
      _jspx_th_c_005fif_005f4.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f4.setParent(null);
      // /index.jsp(104,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ !empty loginUser and loginUser.userId eq 'admin' }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f4 = _jspx_th_c_005fif_005f4.doStartTag();
      if (_jspx_eval_c_005fif_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
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
          out.write("\t<li><a href=\"/testm/index.jsp\">home</a></li>\r\n");
          out.write("\t<li><a href=\"/testm/mall\">회원관리</a></li>\r\n");
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
          int evalDoAfterBody = _jspx_th_c_005fif_005f4.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f4);
      _jspx_th_c_005fif_005f4_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f4, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f4_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f5(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f5_reused = false;
    try {
      _jspx_th_c_005fif_005f5.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f5.setParent(null);
      // /index.jsp(107,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty loginUser or loginUser.userId ne 'admin' }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f5 = _jspx_th_c_005fif_005f5.doStartTag();
      if (_jspx_eval_c_005fif_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
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
          out.write("\t<li><a href=\"/testm/index.jsp\">home</a></li>\r\n");
          out.write("\t<li><a href=\"/testm/nlist\">공지사항</a></li>\r\n");
          out.write("\t<li><a href=\"/testm/blist?page=1\">게시글</a></li>\r\n");
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
          int evalDoAfterBody = _jspx_th_c_005fif_005f5.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f5);
      _jspx_th_c_005fif_005f5_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f5, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f5_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f6(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f6 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f6_reused = false;
    try {
      _jspx_th_c_005fif_005f6.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f6.setParent(null);
      // /index.jsp(111,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty loginUser }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f6 = _jspx_th_c_005fif_005f6.doStartTag();
      if (_jspx_eval_c_005fif_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("<div style=\"float:left;\">\r\n");
          out.write("<form action=\"/testm/login\" method=\"post\">\r\n");
          out.write("<table>\r\n");
          out.write("<tr>\r\n");
          out.write("<th>아이디 : </th>\r\n");
          out.write("<td><input type=\"text\" name=\"userid\" required> </td>\r\n");
          out.write("</tr>\r\n");
          out.write("<tr>\r\n");
          out.write("<th>암 호 : </th>\r\n");
          out.write("<td><input type=\"password\" name=\"userpwd\" required> </td>\r\n");
          out.write("</tr>\r\n");
          out.write("<tr>\r\n");
          out.write("\t<th colspan=\"2\">\r\n");
          out.write("\t\t<input type=\"submit\" value=\"로그인\"> \r\n");
          out.write("\t\t&nbsp; &nbsp; \r\n");
          out.write("\t\t<a href=\"/testm/views/member/enroll.html\">회원가입</a>\r\n");
          out.write("\t</th>\r\n");
          out.write("</tr>\r\n");
          out.write("<tr>\r\n");
          out.write("\t<th colspan=\"2\">\r\n");
          out.write("\t\t<a href=\"\">아이디찾기</a>\r\n");
          out.write("\t\t&nbsp; &nbsp;\r\n");
          out.write("\t\t<a href=\"\">암호찾기</a>\r\n");
          out.write("\t</th>\r\n");
          out.write("</tr>\r\n");
          out.write("</table>\r\n");
          out.write("</form>\r\n");
          out.write("</div>\r\n");
          int evalDoAfterBody = _jspx_th_c_005fif_005f6.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f6);
      _jspx_th_c_005fif_005f6_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f6, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f6_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f7(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f7 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f7_reused = false;
    try {
      _jspx_th_c_005fif_005f7.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f7.setParent(null);
      // /index.jsp(141,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!empty loginUser }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f7 = _jspx_th_c_005fif_005f7.doStartTag();
      if (_jspx_eval_c_005fif_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t<div style=\"float:left;\">\r\n");
          out.write("\t<table>\r\n");
          out.write("\t<tr>\r\n");
          out.write("\t<th>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.loginUser.userName }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write(" 님</th>\r\n");
          out.write("\t<td><a href=\"/testm/logout\">로그아웃</a> </td>\r\n");
          out.write("\t</tr>\r\n");
          out.write("\t<tr>\r\n");
          out.write("\t\t<th colspan=\"2\">\r\n");
          out.write("\t\t\t<a href=\"\">쪽지</a>\r\n");
          out.write("\t\t\t&nbsp; &nbsp;\r\n");
          out.write("\t\t\t<a href=\"/testm/myinfo?userid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginUser.userId }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("\">내 정보 보기</a>\r\n");
          out.write("\t\t</th>\r\n");
          out.write("\t</tr>\r\n");
          out.write("\t</table>\r\n");
          out.write("\t</div>\r\n");
          int evalDoAfterBody = _jspx_th_c_005fif_005f7.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f7);
      _jspx_th_c_005fif_005f7_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f7, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f7_reused);
    }
    return false;
  }
}
