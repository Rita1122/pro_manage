/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.4.8.v20171121
 * Generated at: 2021-07-05 10:20:09 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userRegist_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>????????????</title>\r\n");
      out.write("    <style>\r\n");
      out.write("        * {\r\n");
      out.write("            padding: 0;\r\n");
      out.write("            margin: 0;\r\n");
      out.write("            letter-spacing: .05em;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        html {\r\n");
      out.write("            height: 100%;\r\n");
      out.write("\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        body {\r\n");
      out.write("            height: 100%;\r\n");
      out.write("\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .container {\r\n");
      out.write("            height: 100%;\r\n");
      out.write("            background-image: linear-gradient(-225deg, #7085B6 0%, #87A7D9 50%, #DEF3F8 100%);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .login-wrapper {\r\n");
      out.write("            background-color: #fff;\r\n");
      out.write("            width: 250px;\r\n");
      out.write("            height: 550px;\r\n");
      out.write("            border-radius: 15px;\r\n");
      out.write("            padding: 0 50px;\r\n");
      out.write("            position: relative;\r\n");
      out.write("            left: 50%;\r\n");
      out.write("            top: 50%;\r\n");
      out.write("            transform: translate(-50%, -50%);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .login-wrapper .header {\r\n");
      out.write("            font-size: 30px;\r\n");
      out.write("            font-weight: bold;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            line-height: 75px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .login-wrapper .form-warpper .input-item {\r\n");
      out.write("            display: block;\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            margin-bottom: 20px;\r\n");
      out.write("            border: 0;\r\n");
      out.write("            padding: 10px;\r\n");
      out.write("            border-bottom: 1px solid rgb(128, 125, 125);\r\n");
      out.write("            font-size: 15px\r\n");
      out.write("        }\r\n");
      out.write("        .btn{\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            padding: 10px;\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            margin-top: 40px;\r\n");
      out.write("            background-image: linear-gradient(\r\n");
      out.write("                    -225deg\r\n");
      out.write("                    , #7085B6 0%, #87A7D9 50%, #DEF3F8 100%);\r\n");
      out.write("            color: #fff;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("        function checkname() {\r\n");
      out.write("            var name = document.getElementById(\"name\").value;\r\n");
      out.write("            var span = document.getElementById(\"span_name\");\r\n");
      out.write("            if (name == \"\" || name == null) {\r\n");
      out.write("                span.innerHTML = \"<font color='red' size='2'>??????????????????</font>\";\r\n");
      out.write("                document.getElementById(\"name\").value = \"\";\r\n");
      out.write("                document.getElementById(\"name\").focus();\r\n");
      out.write("                return false;\r\n");
      out.write("            } else if (name.length > 10) {\r\n");
      out.write("                span.innerHTML = \"<font color='red' size='2'>????????????????????????10</font>\";\r\n");
      out.write("                document.getElementById(\"name\").value = \"\";\r\n");
      out.write("                document.getElementById(\"name\").focus();\r\n");
      out.write("                return false\r\n");
      out.write("            } else {\r\n");
      out.write("                span.innerHTML = \"<font color='green' size='2'>???????????????</font>\";\r\n");
      out.write("                return true;\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        function checkpwd() {\r\n");
      out.write("            var pwd = document.getElementById(\"password\").value;\r\n");
      out.write("            var span = document.getElementById(\"span_pwd\");\r\n");
      out.write("            if (pwd == \"\" || pwd == null) {\r\n");
      out.write("                span.innerHTML = \"<font color='red' size='2'>??????????????????</font>\";\r\n");
      out.write("                document.getElementById(\"password\").value = \"\";\r\n");
      out.write("                document.getElementById(\"password\").focus();\r\n");
      out.write("                return false;\r\n");
      out.write("            } else if (pwd.length < 6) {\r\n");
      out.write("                span.innerHTML = \"<font color='red' size='2'>????????????????????????6</font>\";\r\n");
      out.write("                document.getElementById(\"password\").value = \"\";\r\n");
      out.write("                document.getElementById(\"password\").focus();\r\n");
      out.write("                return false;\r\n");
      out.write("            } else if (pwd.length > 16) {\r\n");
      out.write("                span.innerHTML = \"<font color='red' size='2'>????????????????????????16</font>\";\r\n");
      out.write("                document.getElementById(\"password\").value = \"\";\r\n");
      out.write("                document.getElementById(\"password\").focus();\r\n");
      out.write("                return false;\r\n");
      out.write("            } else {\r\n");
      out.write("                span.innerHTML = \"<font color='green' size='2'>????????????</font>\";\r\n");
      out.write("                return true;\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        function checkemail() {\r\n");
      out.write("            var email = document.getElementById(\"email\").value;\r\n");
      out.write("            var span = document.getElementById(\"span_email\");\r\n");
      out.write("            if (email == \"\" || email == null) {\r\n");
      out.write("                span.innerHTML = \"<font color='red' size='2'>??????????????????</font>\";\r\n");
      out.write("                document.getElementById(\"email\").value = \"\";\r\n");
      out.write("                document.getElementById(\"email\").focus();\r\n");
      out.write("                return false;\r\n");
      out.write("            } else if (email.indexOf(\"@\", 0) == -1) {\r\n");
      out.write("                span.innerHTML = \"<font color='red' size='2'>???????????????'@'??????</font>\";\r\n");
      out.write("                document.getElementById(\"email\").value = \"\";\r\n");
      out.write("                document.getElementById(\"email\").focus();\r\n");
      out.write("                return false\r\n");
      out.write("            } else if (email.indexOf(\".\", 0) == -1) {\r\n");
      out.write("                span.innerHTML = \"<font color='red' size='2'>???????????????'.'??????</font>\";\r\n");
      out.write("                document.getElementById(\"email\").value = \"\";\r\n");
      out.write("                document.getElementById(\"email\").focus();\r\n");
      out.write("                return false\r\n");
      out.write("            } else {\r\n");
      out.write("                span.innerHTML = \"<font color='green' size='2'>????????????</font>\";\r\n");
      out.write("                return true;\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        function checkphone() {\r\n");
      out.write("            var phone = document.getElementById(\"phone\").value;\r\n");
      out.write("            var span = document.getElementById(\"span_phone\");\r\n");
      out.write("            if (phone == \"\" || phone == null) {\r\n");
      out.write("                span.innerHTML = \"<font color='red' size='2'>?????????????????????</font>\";\r\n");
      out.write("                document.getElementById(\"phone\").value = \"\";\r\n");
      out.write("                document.getElementById(\"phone\").focus();\r\n");
      out.write("                return false;\r\n");
      out.write("            } else if (phone.length > 11) {\r\n");
      out.write("                span.innerHTML = \"<font color='red' size='2'>???????????????????????????</font>\";\r\n");
      out.write("                document.getElementById(\"phone\").value = \"\";\r\n");
      out.write("                document.getElementById(\"phone\").focus();\r\n");
      out.write("                return false\r\n");
      out.write("            } else if (!/^\\d+$/.test(phone)) {\r\n");
      out.write("                span.innerHTML = \"<font color='red' size='2'>????????????????????????????????????</font>\";\r\n");
      out.write("                document.getElementById(\"phone\").value = \"\";\r\n");
      out.write("                document.getElementById(\"phone\").focus();\r\n");
      out.write("                return false\r\n");
      out.write("            } else {\r\n");
      out.write("                span.innerHTML = \"<font color='green' size='2'>???????????????</font>\";\r\n");
      out.write("                return true;\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("    <div class=\"login-wrapper\">\r\n");
      out.write("        <div class=\"header\">???   ???</div>\r\n");
      out.write("        <div class=\"form-warpper\">\r\n");
      out.write("            <form action=\"/regist\" method=\"post\">\r\n");
      out.write("                <input id=\"name\" type=\"text\" name=\"name\" onblur=\"checkname()\" placeholder=\"username\"  class=\"input-item\">\r\n");
      out.write("                <span id=\"span_name\"></span>\r\n");
      out.write("                <input type=\"password\"id=\"password\"  name=\"password\" placeholder=\"password\"onblur=\"checkpwd()\" class=\"input-item\">\r\n");
      out.write("                <span id=\"span_pwd\"></span>\r\n");
      out.write("                <input type=\"text\"id=\"email\"  name=\"email\" placeholder=\"email\" onblur=\"checkemail()\"class=\"input-item\">\r\n");
      out.write("                <span id=\"span_email\"></span><input type=\"text\"id=\"phone\"  name=\"phone\" onblur=\"checkphone()\"placeholder=\"phone\" class=\"input-item\">\r\n");
      out.write("                <span id=\"span_phone\"></span>\r\n");
      out.write("\r\n");
      out.write("                <input type=\"submit\"  value=\" ???  ??? \" class=\"btn\"/></form>\r\n");
      out.write("        </div>\r\n");
      out.write("        <br>\r\n");
      out.write("        <div class=\"msg\">\r\n");
      out.write("            ?????????????<a href=\"userLogin.jsp\">????????????</a>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");

    String info = (String) request.getAttribute("info1");
    if (info == null || info == "") {
        info = "";
    }

      out.write("\r\n");
      out.write("<div style=\"position:absolute;top:250px;left:620px;margin-left: 20px;color:#6b6d71\">");
      out.print(info);
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
