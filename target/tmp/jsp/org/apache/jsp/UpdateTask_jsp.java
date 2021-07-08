/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.4.8.v20171121
 * Generated at: 2021-07-05 10:49:29 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import vo.User;
import vo.Task;

public final class UpdateTask_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("vo.Task");
    _jspx_imports_classes.add("vo.User");
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>任务修改</title>\r\n");
      out.write("\r\n");
      out.write("    <style >\r\n");
      out.write("        .mainBox{\r\n");
      out.write("            width: 70%;\r\n");
      out.write("            float: left;\r\n");
      out.write("            background-color: #FFFFFF;\r\n");
      out.write("            box-shadow: 10px 10px 5px #888888;\r\n");
      out.write("        }\r\n");
      out.write("        #user_id,#p_id,#t_id,#title,#desc,#s_t,#e_t{\r\n");
      out.write("            width: 251px;\r\n");
      out.write("            height: 32px;\r\n");
      out.write("            border: 1.5px solid  #003140;\r\n");
      out.write("            border-radius: 8px;\r\n");
      out.write("        }\r\n");
      out.write("        .rightBox{\r\n");
      out.write("            width: 10%;\r\n");
      out.write("            float: right;\r\n");
      out.write("        }\r\n");
      out.write("        .rightBox img{\r\n");
      out.write("            width: 160px;\r\n");
      out.write("            position:absolute;\r\n");
      out.write("            bottom:25px;\r\n");
      out.write("            right:20px\r\n");
      out.write("        }\r\n");
      out.write("        .btn_sub{\r\n");
      out.write("            width: 80px;\r\n");
      out.write("            height: 40px;\r\n");
      out.write("            background-color:  #003f52;\r\n");
      out.write("            border: 1px solid  #003f52;\r\n");
      out.write("            border-radius: 5px;\r\n");
      out.write("            padding-left: 10px ;\r\n");
      out.write("            color:white;\r\n");
      out.write("            font-family: 宋体;\r\n");
      out.write("        }\r\n");
      out.write("        .btn_sub:hover{\r\n");
      out.write("            filter: brightness(1.1);\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "navigator.jsp", out, false);
      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "left.jsp", out, false);
      out.write('\r');
      out.write('\n');

    User user = (User) request.getSession().getAttribute("curUser");
    int id = user.getUser_id();

    Task task = (Task)request.getSession().getAttribute("task");


      out.write("\r\n");
      out.write("<div class=\"mainBox\">\r\n");
      out.write("    <h2 style=\"text-align: center;\">修改任务</h2>\r\n");
      out.write("    <form method=\"post\" action=\"/UpdateTask\">\r\n");
      out.write("        <table cellpadding=\"10px\" align=\"center\">\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td class=\"td_left\">您的id：<input name=\"user_id\" id=\"user_id\" type=\"text\" value=\"");
      out.print(id);
      out.write("\" readonly ></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td class=\"td_left\">项目id：<input name=\"p_id\" id=\"p_id\" type=\"text\" value=\"");
      out.print(task.getP_id());
      out.write("\" readonly></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td class=\"td_left\">任务编号：<input name=\"t_id\" id=\"t_id\" type=\"text\" value=\"");
      out.print(task.getT_id());
      out.write("\" readonly></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td class=\"td_left\">任务名称：<input name=\"title\" id=\"title\" type=\"text\" value=\"");
      out.print(task.getT_title());
      out.write("\"></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td class=\"td_left\">任务描述：<input name=\"desc\" id=\"desc\" type=\"text\" value=\"");
      out.print(task.getDesct());
      out.write("\"></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td class=\"td_left\">开始时间：<input name=\"s_t\" id=\"s_t\" type=\"datetime-local\" value=\"");
      out.print(task.getS_t());
      out.write("\"></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td class=\"td_left\">结束时间：<input name=\"e_t\" id=\"e_t\" type=\"datetime-local\" value=\"");
      out.print(task.getE_t());
      out.write("\"></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td colspan=\"2\" align=\"center\" >\r\n");
      out.write("                    <input type=\"submit\" class=\"btn_sub\" value=\"提交\">&nbsp;&nbsp;\r\n");
      out.write("                    <input type=\"reset\" class=\"btn_sub\" value=\"重置\">\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("    </form>\r\n");
      out.write("</div>\r\n");
      out.write("<img style=\"width: 280px;\r\n");
      out.write("    position:absolute;\r\n");
      out.write("    bottom: 0px;\r\n");
      out.write("    right:20px\" src=\"img/南京.png\" >\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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