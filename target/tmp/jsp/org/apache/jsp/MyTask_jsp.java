/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.4.8.v20171121
 * Generated at: 2021-07-05 10:31:52 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import vo.Task;
import java.util.ArrayList;

public final class MyTask_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/E:/devsoft/apache-maven-3.6.3/re/org/apache/taglibs/taglibs-standard-impl/1.2.5/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425949870000L));
    _jspx_dependants.put("file:/E:/devsoft/apache-maven-3.6.3/re/org/apache/taglibs/taglibs-standard-impl/1.2.5/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1615965042051L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("vo.Task");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>我的任务</title>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/myTask.css\"/>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "navigator.jsp", out, false);
      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "left.jsp", out, false);
      out.write("\r\n");
      out.write("<div class=\"mainBox\">\r\n");
      out.write("    <div class=\"maintitle\">\r\n");
      out.write("        我的任务列表\r\n");
      out.write("        <svg t=\"1625196429462\" class=\"icon\" viewBox=\"0 0 1024 1024\" version=\"1.1\" xmlns=\"http://www.w3.org/2000/svg\" p-id=\"7446\" width=\"200\" height=\"200\"><path d=\"M524.202667 487.381333a17.408 17.408 0 0 1-24.405334 0L226.261333 218.325333a17.408 17.408 0 0 0-24.448 0l-25.941333 25.514667a17.493333 17.493333 0 0 0 0 24.917333l323.925333 318.549334a17.408 17.408 0 0 0 24.405334 0L848.128 268.8a17.493333 17.493333 0 0 0 0-24.917333l-25.941333-25.514667a17.408 17.408 0 0 0-24.448 0l-273.493334 269.056z\" p-id=\"7447\" fill=\"#2c2c2c\"></path><path d=\"M524.202667 705.706667a17.408 17.408 0 0 1-24.405334 0l-273.536-269.013334a17.408 17.408 0 0 0-24.448 0l-25.941333 25.472a17.493333 17.493333 0 0 0 0 24.917334l323.925333 318.592a17.408 17.408 0 0 0 24.405334 0l323.925333-318.549334a17.493333 17.493333 0 0 0 0-24.96l-25.941333-25.472a17.408 17.408 0 0 0-24.448 0l-273.493334 269.013334z\" p-id=\"7448\" fill=\"#67c4d6\"></path></svg>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"maintable\">\r\n");
      out.write("        <table style=\"border-spacing-top: 20px;\" >\r\n");
      out.write("            <tr>\r\n");
      out.write("                <th style=\"padding-left: 20px;padding-right: 15px;\">任务编号</th>\r\n");
      out.write("                <th style=\"padding-right: 15px;\">任务名称</th>\r\n");
      out.write("                <th style=\"padding-right: 15px;\">开始时间</th>\r\n");
      out.write("                <th style=\"padding-right: 15px;\">结束时间</th>\r\n");
      out.write("                <th style=\"padding-right: 15px;\">执行者id</th>\r\n");
      out.write("                <th style=\"padding-right: 15px;\">是否完成</th>\r\n");
      out.write("                <th style=\"padding-right: 15px;\">确认完成</th>\r\n");
      out.write("                <th style=\"padding-right: 15px;\">操作</th>\r\n");
      out.write("                <th style=\"padding-right: 15px;\"> </th>\r\n");
      out.write("            </tr>\r\n");
      out.write("\r\n");
      out.write("            ");

                List<Task> tasks = new ArrayList<>();
                tasks = (List<Task>) request.getSession().getAttribute("tasks");
                for (Task task : tasks) {

            
      out.write("\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>");
      out.print(task.getT_id());
      out.write("\r\n");
      out.write("                </td>\r\n");
      out.write("                <td>");
      out.print(task.getT_title());
      out.write("\r\n");
      out.write("                </td>\r\n");
      out.write("                <td>");
      out.print(task.getS_t());
      out.write("\r\n");
      out.write("                </td>\r\n");
      out.write("                <td>");
      out.print(task.getE_t());
      out.write("\r\n");
      out.write("                </td>\r\n");
      out.write("                <td>");
      out.print(task.getUser_id());
      out.write("\r\n");
      out.write("                </td>\r\n");
      out.write("\r\n");
      out.write("                ");

                    String info = "";

                    if (task.getT_status() == 0 && task.getUser_id() == 0) {
                        info = "未被领取";
                    } else if (task.getT_status() == 0 && task.getUser_id() != 0) {
                        info = "未完成";
                    } else if (task.getT_status() != 0) {
                        info = "已完成";
                    }
                
      out.write("\r\n");
      out.write("                <td>");
      out.print(info);
      out.write("\r\n");
      out.write("                </td>\r\n");
      out.write("                ");
 if (task.getT_status() == 0 && task.getUser_id() != 0) {
      out.write("\r\n");
      out.write("                <td><a href=\"/Finish?t_id=");
      out.print(task.getT_id());
      out.write("\">确认完成</a></td>\r\n");
      out.write("                ");
}else{
      out.write("\r\n");
      out.write("                    <td>已完成</td>\r\n");
      out.write("                ");
}
      out.write("\r\n");
      out.write("                <td><a href=\"/DeleteTask?t_id=");
      out.print(task.getT_id());
      out.write("\">删除</a></td>\r\n");
      out.write("                <td><a href=\"/getTask?t_id=");
      out.print(task.getT_id());
      out.write("\">修改</a></td>");

                } 
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<img style=\"width: 220px;\r\n");
      out.write("    position:absolute;\r\n");
      out.write("    bottom: 0px;\r\n");
      out.write("    right:20px\" src=\"img/杭州.png\" >\r\n");
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