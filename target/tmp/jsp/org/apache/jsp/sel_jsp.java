/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.4.8.v20171121
 * Generated at: 2021-07-05 10:19:00 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sel_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems;

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
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.release();
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

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>查询结果</title>\r\n");
      out.write("\r\n");
      out.write("    <style>\r\n");
      out.write("        body{\r\n");
      out.write("            background-color: #ebf0e7;\r\n");
      out.write("        }\r\n");
      out.write("        .titlebox{\r\n");
      out.write("            height: 45px;\r\n");
      out.write("            background-color: #FFFFFF;\r\n");
      out.write("            margin-bottom: 20px;\r\n");
      out.write("        }\r\n");
      out.write("        .usertitle{\r\n");
      out.write("            float: right;\r\n");
      out.write("            margin: 10px;\r\n");
      out.write("            font-size: 15px;\r\n");
      out.write("            width: 200px;\r\n");
      out.write("            color: #000000;\r\n");
      out.write("        }\r\n");
      out.write("        .usertitle a{\r\n");
      out.write("            color: black;\r\n");
      out.write("            text-decoration:none\r\n");
      out.write("        }\r\n");
      out.write("        .usertitle a svg{\r\n");
      out.write("            width: 15px;\r\n");
      out.write("            height: 15px;\r\n");
      out.write("        }\r\n");
      out.write("        .titlecenter{\r\n");
      out.write("            float: left;\r\n");
      out.write("            text-align:center ;\r\n");
      out.write("            width: 200px;\r\n");
      out.write("            font-size: 26px;\r\n");
      out.write("            font-weight: 400;\r\n");
      out.write("            margin:0;\r\n");
      out.write("            padding-top: 10px;\r\n");
      out.write("            padding-bottom:10px ;\r\n");
      out.write("            background-color: #002140;\r\n");
      out.write("            color: #FFFFFF;\r\n");
      out.write("            box-shadow: 2px 0 6px rgb(0 21 41 );\r\n");
      out.write("        }\r\n");
      out.write("        .titlecenter svg{\r\n");
      out.write("            width: 25px;\r\n");
      out.write("            height:25px;\r\n");
      out.write("        }\r\n");
      out.write("        .navbar {\r\n");
      out.write("            width: 70%;\r\n");
      out.write("            background-color: #FFFFFF;\r\n");
      out.write("        }\r\n");
      out.write("        .navbar a {\r\n");
      out.write("            float: left;\r\n");
      out.write("            width: auto;\r\n");
      out.write("            display: block;\r\n");
      out.write("            color: black;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            padding: 12px 20px;\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("        }\r\n");
      out.write("        .navbar a svg{\r\n");
      out.write("            width: 18px;\r\n");
      out.write("            height: 18px;\r\n");
      out.write("        }\r\n");
      out.write("        .navbar a:hover{\r\n");
      out.write("            border-bottom: 4px solid #67c4d6;\r\n");
      out.write("            color: #67c4d6;\r\n");
      out.write("        }\r\n");
      out.write("        .leftbox{\r\n");
      out.write("            float:left;\r\n");
      out.write("            width: 16%;\r\n");
      out.write("            height:500px;\r\n");
      out.write("            background-color: #002140;\r\n");
      out.write("            padding:20px ;\r\n");
      out.write("            box-sizing: border-box;\r\n");
      out.write("        }\r\n");
      out.write("        .leftbox select{\r\n");
      out.write("            width: 150px;\r\n");
      out.write("            height: 30px;\r\n");
      out.write("            color: #888888;\r\n");
      out.write("            line-height: 30px!important;\r\n");
      out.write("            font-size: 12px;\r\n");
      out.write("            border-radius: 15px;\r\n");
      out.write("            padding: 0 35px 0 17px;\r\n");
      out.write("            border: 2px solid #FFFFFF;\r\n");
      out.write("            background: 0 0;\r\n");
      out.write("            box-sizing: border-box;\r\n");
      out.write("        }\r\n");
      out.write("        .leftbox input{\r\n");
      out.write("            width: 50px;\r\n");
      out.write("            height: 30px;\r\n");
      out.write("            color: #888888;\r\n");
      out.write("            line-height: 30px!important;\r\n");
      out.write("            font-size: 12px;\r\n");
      out.write("            border-radius: 15px;\r\n");
      out.write("            padding: 0 35px 0 17px;\r\n");
      out.write("            border: 2px solid #FFFFFF;\r\n");
      out.write("            background: 0 0;\r\n");
      out.write("            box-sizing: border-box;\r\n");
      out.write("        }\r\n");
      out.write("        .search{\r\n");
      out.write("            margin-left: 100px;\r\n");
      out.write("        }\r\n");
      out.write("        #value{\r\n");
      out.write("            width: 160px;\r\n");
      out.write("            height: 30px;\r\n");
      out.write("            line-height: 30px!important;\r\n");
      out.write("            font-size: 12px;\r\n");
      out.write("            border-radius: 15px;\r\n");
      out.write("            padding: 0 35px 0 17px;\r\n");
      out.write("            border: 2px solid #FFFFFF;\r\n");
      out.write("            background: 0 0;\r\n");
      out.write("            box-sizing: border-box;\r\n");
      out.write("        }\r\n");
      out.write("        .leftbox a{\r\n");
      out.write("            color: white;\r\n");
      out.write("            font-size: 18px;\r\n");
      out.write("            font-weight: 100;\r\n");
      out.write("            text-decoration:none\r\n");
      out.write("        }\r\n");
      out.write("        .mainBox{\r\n");
      out.write("            width: 70%;\r\n");
      out.write("            float: left;\r\n");
      out.write("            background-color: #FFFFFF;\r\n");
      out.write("            box-shadow: 10px 10px 5px #888888;\r\n");
      out.write("        }\r\n");
      out.write("        .maintitle{\r\n");
      out.write("            height: 40px;\r\n");
      out.write("            font-size: 18px;\r\n");
      out.write("            border-bottom:0.5px solid #EBF0E7;\r\n");
      out.write("        }\r\n");
      out.write("        .maintitle svg{\r\n");
      out.write("            width: 18px;\r\n");
      out.write("            height: 18px;\r\n");
      out.write("        }\r\n");
      out.write("        .maintable{\r\n");
      out.write("            margin: 10px;\r\n");
      out.write("            padding: 5px;\r\n");
      out.write("            font-weight: 400;\r\n");
      out.write("            color: #747474;\r\n");
      out.write("        }\r\n");
      out.write("        .rightbox{\r\n");
      out.write("            float:right;\r\n");
      out.write("            width: 22%;\r\n");
      out.write("            background-color: white;\r\n");
      out.write("            padding:20px ;\r\n");
      out.write("            box-sizing: border-box;\r\n");
      out.write("        }\r\n");
      out.write("        .righttitle{\r\n");
      out.write("            height: 40px;\r\n");
      out.write("            font-size: 15px;\r\n");
      out.write("            border-bottom:0.5px solid #EBF0E7;\r\n");
      out.write("        }\r\n");
      out.write("        .righttitle svg{\r\n");
      out.write("            width: 15px;\r\n");
      out.write("            height: 15px;\r\n");
      out.write("        }\r\n");
      out.write("        .righttable{\r\n");
      out.write("            margin: 10px;\r\n");
      out.write("            padding: 5px;\r\n");
      out.write("            font-weight: 400;\r\n");
      out.write("            font-size: 15px;\r\n");
      out.write("            color: #747474;\r\n");
      out.write("        }\r\n");
      out.write("        .mainbox{\r\n");
      out.write("            float:left;\r\n");
      out.write("            width: 55%;\r\n");
      out.write("            background-color: white;\r\n");
      out.write("            padding:20px ;\r\n");
      out.write("            box-sizing: border-box;\r\n");
      out.write("            box-shadow: 10px 10px 5px #888888;\r\n");
      out.write("        }\r\n");
      out.write("        .maintitle{\r\n");
      out.write("            height: 40px;\r\n");
      out.write("            font-size: 18px;\r\n");
      out.write("            border-bottom:0.5px solid #EBF0E7;\r\n");
      out.write("        }\r\n");
      out.write("        .maintitle svg{\r\n");
      out.write("            width: 18px;\r\n");
      out.write("            height: 18px;\r\n");
      out.write("        }\r\n");
      out.write("        .maintable{\r\n");
      out.write("            margin: 10px;\r\n");
      out.write("            padding: 5px;\r\n");
      out.write("            font-weight: 400;\r\n");
      out.write("            color: #747474;\r\n");
      out.write("        }\r\n");
      out.write("        .rightbox{\r\n");
      out.write("            float:right;\r\n");
      out.write("            width: 26%;\r\n");
      out.write("            background-color: white;\r\n");
      out.write("            padding:20px ;\r\n");
      out.write("            box-sizing: border-box;\r\n");
      out.write("        }\r\n");
      out.write("        .righttitle{\r\n");
      out.write("            height: 40px;\r\n");
      out.write("            font-size: 15px;\r\n");
      out.write("            border-bottom:0.5px solid #EBF0E7;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"titlebox\">\r\n");
      out.write("    <div class=\"usertitle\">\r\n");
      out.write("        欢迎管理员！&nbsp;&nbsp;|\r\n");
      out.write("        <a href=\"logout.jsp\">\r\n");
      out.write("            <svg t=\"1625191369578\" class=\"icon\" viewBox=\"0 0 1024 1024\" version=\"1.1\" xmlns=\"http://www.w3.org/2000/svg\" p-id=\"4900\" width=\"200\" height=\"200\"><path d=\"M950.093 487.772l-179.775-173.078c-14.382-13.851-35.955-13.851-50.336 0-14.382 13.842-14.382 34.614 0 48.465l118.647 114.228h-345.168c-21.573 0-35.955 13.842-35.955 34.614s14.382 34.614 35.955 34.614h345.168l-118.639 114.228c-14.382 13.851-14.382 34.623 0 48.465 7.192 6.93 14.382 10.386 25.164 10.386 10.792 0 17.982-3.465 25.173-10.386l179.775-176.535s0-3.465 3.6-3.465c10.782-10.386 10.782-31.149-3.6-41.535z\" p-id=\"4901\" fill=\"#2c2c2c\"></path><path d=\"M853.010 754.307c-21.573 0-35.955 13.851-35.955 34.614v69.237c0 20.763-14.382 34.614-35.955 34.614h-611.235c-21.573 0-35.955-13.851-35.955-34.614v-692.317c0-20.763 14.382-34.614 35.955-34.614h611.235c21.573 0 35.955 13.851 35.955 34.614v69.237c0 20.764 14.382 34.614 35.955 34.614s35.955-13.851 35.955-34.614v-69.237c0-58.842-46.736-103.842-107.865-103.842h-611.235c-61.119 0-107.865 45-107.865 103.842v692.317c0 58.842 46.747 103.842 107.865 103.842h611.235c61.128 0 107.865-45 107.865-103.842v-69.237c0-20.764-14.382-34.614-35.955-34.614z\" p-id=\"4902\" fill=\"#00aa00\"></path></svg>\r\n");
      out.write("            退出\r\n");
      out.write("        </a>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"titlecenter\">\r\n");
      out.write("        <svg t=\"1625189270473\" class=\"icon\" viewBox=\"0 0 1024 1024\" version=\"1.1\" xmlns=\"http://www.w3.org/2000/svg\" p-id=\"1335\" width=\"200\" height=\"200\"><path d=\"M764.9 503.5H520.5V259.2c0-139.8 111.2-254.5 247.8-255.7 67.7-0.6 131.2 25.4 179 73.2 47.8 47.8 73.8 111.3 73.3 178.9-1.2 136.6-115.9 247.9-255.7 247.9z m-188-56.4h188c109 0 198.4-86.1 199.3-192 0.4-52.4-19.7-101.6-56.7-138.6-36.6-36.6-85.2-56.7-136.9-56.7h-1.8c-105.8 1-191.9 90.4-191.9 199.4v187.9z m-323.5 573.5c-66.8 0-129.5-26-176.8-73.3-47.8-47.8-73.8-111.4-73.2-179 1.2-136.6 115.9-247.8 255.7-247.8h244.4v244.3c0 139.9-111.2 254.6-247.9 255.7l-0.2-28.2 0.2 28.2c-0.8 0.1-1.5 0.1-2.2 0.1z m5.7-443.7c-109 0-198.4 86.1-199.3 191.9-0.5 52.4 19.7 101.6 56.7 138.6 36.6 36.6 85.2 56.7 136.9 56.7h1.6c105.9-0.9 192-90.3 192-199.4V576.9H259.1z m244.3-73.4H259.7c-65.3 0-127.7-24.2-175.7-68.2-48.8-44.7-77.3-105-80.3-169.8C0.5 196.3 24.9 130.8 72.6 80.9c23.1-24.2 50.3-43.2 80.8-56.6C185 10.4 218.7 3.4 253.5 3.4c66.8 0 129.6 26 176.8 73.2 47.2 47.2 73.2 110 73.2 176.8l-0.1 250.1zM253.5 59.8c-53.4 0-103.2 21.3-140.1 60-36.9 38.7-55.8 89.4-53.3 143 2.3 49.8 24.4 96.3 62.1 130.9 37.6 34.5 86.5 53.4 137.6 53.4h187.4V253.5c0-51.7-20.1-100.4-56.7-136.9-36.7-36.6-85.3-56.8-137-56.8z m517.1 960.8h-2.3c-136.6-1.2-247.8-115.9-247.8-255.7V520.5h244.3c139.9 0 254.6 111.2 255.7 247.9 0.5 67.6-25.5 131.2-73.3 178.9-47.2 47.3-109.9 73.3-176.6 73.3zM576.9 576.9v187.9c0 109 86.1 198.4 191.9 199.4h1.8c51.7 0 100.2-20.1 136.9-56.7 37-37 57.2-86.2 56.8-138.6-0.9-105.9-90.3-192-199.3-192H576.9z\" p-id=\"1336\" fill=\"#f4ea2a\"></path></svg>\r\n");
      out.write("        We Project\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"navbar\">\r\n");
      out.write("        <a href=\"all\">\r\n");
      out.write("            <svg t=\"1625190501224\" class=\"icon\" viewBox=\"0 0 1024 1024\" version=\"1.1\" xmlns=\"http://www.w3.org/2000/svg\" p-id=\"1436\" width=\"200\" height=\"200\"><path d=\"M395.1616 563.2c22.8352 0 31.0784 2.3552 39.424 6.8608 8.3456 4.4544 14.8992 11.008 19.3536 19.3536 4.5056 8.3456 6.8608 16.5888 6.8608 39.424v202.4448c0 63.4368-7.168 89.088-20.48 114.176a139.5712 139.5712 0 0 1-58.112 58.0096l-10.1376 5.0176c-22.3744 10.1376-48.9984 15.5136-103.936 15.5136H192.6656c-63.4368 0-89.088-7.168-114.176-20.48a139.5712 139.5712 0 0 1-58.0096-58.112l-5.0176-10.1376c-9.3696-20.6848-14.6432-44.9536-15.4112-91.8016L0 755.9168c0-63.4368 7.168-89.088 20.48-114.176a139.5712 139.5712 0 0 1 58.112-58.0096l10.1376-5.0176c20.6848-9.3696 44.9536-14.6432 91.8016-15.4112L395.1616 563.2z m233.6768 0h202.4448c63.4368 0 89.088 7.168 114.176 20.48 24.9856 13.4144 44.6464 33.0752 58.0096 58.112l5.0176 10.1376c10.1376 22.3744 15.5136 48.9984 15.5136 103.936v75.4176c0 63.4368-7.168 89.088-20.48 114.176a139.5712 139.5712 0 0 1-58.112 58.0096l-10.1376 5.0176c-22.3744 10.1376-48.9984 15.5136-103.936 15.5136h-75.4176c-63.4368 0-89.088-7.168-114.176-20.48a139.5712 139.5712 0 0 1-58.0096-58.112l-5.0176-10.1376c-9.3696-20.6848-14.6432-44.9536-15.4112-91.8016L563.2 628.8384c0-22.8352 2.3552-31.0784 6.8608-39.424a46.5408 46.5408 0 0 1 19.3536-19.3536c8.3456-4.5056 16.5888-6.8608 39.424-6.8608zM358.4 665.6H183.3984l-16.896 0.4608c-22.2208 0.9216-31.0272 3.328-39.6288 7.936a37.2224 37.2224 0 0 0-16.0768 16.0768c-5.12 9.5744-7.5776 19.3536-8.192 47.5136L102.4 755.9168v75.3664c0 42.7008 2.304 54.4256 8.3968 65.8432 3.84 7.168 8.9088 12.2368 16.0768 16.0768 9.5744 5.12 19.3536 7.5776 47.5136 8.192l18.3296 0.2048h75.3664c42.7008 0 54.4256-2.304 65.8432-8.3968a37.2224 37.2224 0 0 0 16.0768-16.0768c5.12-9.5744 7.5776-19.3536 8.192-47.5136L358.4 831.2832V665.6z m482.2016 0H665.6v175.0016l0.4608 16.896c0.9216 22.2208 3.328 31.0272 7.936 39.6288 3.84 7.168 8.9088 12.2368 16.0768 16.0768 9.5744 5.12 19.3536 7.5776 47.5136 8.192l18.3296 0.2048h75.3664c42.7008 0 54.4256-2.304 65.8432-8.3968a37.2224 37.2224 0 0 0 16.0768-16.0768c5.12-9.5744 7.5776-19.3536 8.192-47.5136l0.2048-18.3296v-75.3664c0-42.7008-2.304-54.4256-8.3968-65.8432a37.2224 37.2224 0 0 0-16.0768-16.0768c-10.496-5.632-21.2992-8.0384-56.5248-8.3456zM180.5312 0.1536L268.0832 0c63.4368 0 89.088 7.168 114.176 20.48 24.9856 13.4144 44.6464 33.0752 58.0096 58.112l5.0176 10.1376c10.1376 22.3744 15.5136 48.9984 15.5136 103.936v202.496c0 22.8352-2.3552 31.0784-6.8608 39.424a46.5408 46.5408 0 0 1-19.3536 19.3536c-8.3456 4.5056-16.5888 6.8608-39.424 6.8608H192.7168c-63.4368 0-89.088-7.168-114.176-20.48A139.5712 139.5712 0 0 1 20.5824 382.1568l-5.0176-10.1376C6.144 351.3856 0.8704 327.168 0.1024 280.2688L0 192.7168c0-63.4368 7.168-89.088 20.48-114.176A139.5712 139.5712 0 0 1 78.6432 20.5824l10.1376-5.0176C109.4144 6.144 133.632 0.8704 180.5312 0.1024z m563.2 0L831.2832 0c63.4368 0 89.088 7.168 114.176 20.48 24.9856 13.4144 44.6464 33.0752 58.0096 58.112l5.0176 10.1376c10.1376 22.3744 15.5136 48.9984 15.5136 103.936v75.4176c0 63.4368-7.168 89.088-20.48 114.176a139.5712 139.5712 0 0 1-58.112 58.0096l-10.1376 5.0176c-22.3744 10.1376-48.9984 15.5136-103.936 15.5136h-202.496c-22.8352 0-31.0784-2.3552-39.424-6.8608a46.5408 46.5408 0 0 1-19.3536-19.3536c-4.5056-8.3456-6.8608-16.5888-6.8608-39.424V192.7168c0-63.4368 7.168-89.088 20.48-114.176A139.5712 139.5712 0 0 1 641.8432 20.5824l10.1376-5.0176c20.6848-9.3696 44.9536-14.6432 91.8016-15.4112zM277.4016 102.4L192.7168 102.4c-42.7008 0-54.4256 2.304-65.8432 8.3968a37.2224 37.2224 0 0 0-16.0768 16.0768c-5.12 9.5744-7.5776 19.3536-8.192 47.5136L102.4 192.7168v75.3664c0 42.7008 2.304 54.4256 8.3968 65.8432 3.84 7.168 8.9088 12.2368 16.0768 16.0768 9.5744 5.12 19.3536 7.5776 47.5136 8.192L192.7168 358.4H358.4V192.7168c0-36.1472-1.6384-50.1248-5.888-60.416l-2.56-5.4272a37.2224 37.2224 0 0 0-16.0256-16.0768l-5.376-2.56c-9.4208-3.7888-21.8112-5.5296-51.1488-5.7856z m563.2 0L755.9168 102.4c-42.7008 0-54.4256 2.304-65.8432 8.3968a37.2224 37.2224 0 0 0-16.0768 16.0768c-5.632 10.496-8.0384 21.2992-8.3456 56.5248L665.6 358.4h165.6832c36.1472 0 50.1248-1.6384 60.416-5.888l5.4272-2.56a37.2224 37.2224 0 0 0 16.0768-16.0256c5.12-9.5744 7.5776-19.3536 8.192-47.5136L921.6 268.0832V192.7168c0-42.7008-2.304-54.4256-8.3968-65.8432a37.2224 37.2224 0 0 0-16.0768-16.0768l-5.376-2.56c-9.4208-3.7888-21.8112-5.5296-51.1488-5.7856z\" p-id=\"1437\" fill=\"#67c4d6\"></path></svg>\r\n");
      out.write("            管理员主页\r\n");
      out.write("        </a>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"leftbox\">\r\n");
      out.write("    <form action=\"asel\" method=\"post\">\r\n");
      out.write("        <select name=\"sel\">\r\n");
      out.write("            <option value=\"\">请选择查询</option>\r\n");
      out.write("            <option value=\"user_id\">用户id</option>\r\n");
      out.write("            <option value=\"name\">用户姓名</option>\r\n");
      out.write("            <option value=\"team_id\">团队id</option>\r\n");
      out.write("            <option value=\"team_name\">团队名</option>\r\n");
      out.write("            <option value=\"p_id\">项目id</option>\r\n");
      out.write("            <option value=\"p_title\">项目名</option>\r\n");
      out.write("        </select><br><br>\r\n");
      out.write("        <input name=\"value\" id=\"value\" placeholder=\"请输入查询信息\"><br><br>\r\n");
      out.write("        <div class=\"search\">\r\n");
      out.write("            <input style=\"color: #FFFFFF;\" type=\"submit\" value=\"搜索\">\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </form>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"mainBox\">\r\n");
      out.write("    <div class=\"maintitle\">\r\n");
      out.write("        &nbsp;&nbsp;&nbsp;查询结果\r\n");
      out.write("        <svg t=\"1625196429462\" class=\"icon\" viewBox=\"0 0 1024 1024\" version=\"1.1\" xmlns=\"http://www.w3.org/2000/svg\" p-id=\"7446\" width=\"200\" height=\"200\"><path d=\"M524.202667 487.381333a17.408 17.408 0 0 1-24.405334 0L226.261333 218.325333a17.408 17.408 0 0 0-24.448 0l-25.941333 25.514667a17.493333 17.493333 0 0 0 0 24.917333l323.925333 318.549334a17.408 17.408 0 0 0 24.405334 0L848.128 268.8a17.493333 17.493333 0 0 0 0-24.917333l-25.941333-25.514667a17.408 17.408 0 0 0-24.448 0l-273.493334 269.056z\" p-id=\"7447\" fill=\"#2c2c2c\"></path><path d=\"M524.202667 705.706667a17.408 17.408 0 0 1-24.405334 0l-273.536-269.013334a17.408 17.408 0 0 0-24.448 0l-25.941333 25.472a17.493333 17.493333 0 0 0 0 24.917334l323.925333 318.592a17.408 17.408 0 0 0 24.405334 0l323.925333-318.549334a17.493333 17.493333 0 0 0 0-24.96l-25.941333-25.472a17.408 17.408 0 0 0-24.448 0l-273.493334 269.013334z\" p-id=\"7448\" fill=\"#67c4d6\"></path></svg>\r\n");
      out.write("    </div>\r\n");
      out.write("    <a href=\"all\" style=\"text-decoration:none;margin-left: 550px\">\r\n");
      out.write("        <svg style=\"width: 15px;\r\n");
      out.write("             height: 15px;\"\r\n");
      out.write("             t=\"1625318878804\" class=\"icon\" viewBox=\"0 0 1024 1024\" version=\"1.1\" xmlns=\"http://www.w3.org/2000/svg\" p-id=\"6639\" width=\"200\" height=\"200\"><path d=\"M622.650611 284.901749 447.745069 284.901749 447.745069 142.823869 63.980685 334.705038l383.76336 191.882192L447.744046 384.834762l189.391465 0c149.914358 0 224.855164 62.789045 224.855164 188.368158 0 129.928165-77.435627 194.876386-232.338602 194.876386L187.952184 768.079306l0 99.93199L634.146433 868.011296c211.184817 0 316.777737-95.104031 316.777737-285.311071C950.924169 384.178823 841.510224 284.901749 622.650611 284.901749z\" p-id=\"6640\"></path></svg>\r\n");
      out.write("        返回\r\n");
      out.write("    </a>\r\n");
      out.write("    <div class=\"maintable\" style=\"margin-left: 200px;\">\r\n");
      out.write("        <table style=\"border-spacing: 20px;\">\r\n");
      out.write("            <tr><td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${info}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td></tr>\r\n");
      out.write("            ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            ");
      if (_jspx_meth_c_005fforEach_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<img style=\"width: 220px;\r\n");
      out.write("    position:absolute;\r\n");
      out.write("    bottom: 0px;\r\n");
      out.write("    right:20px\" src=\"img/潍坊.png\" >\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /sel.jsp(261,12) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/sel.jsp(261,12) '${users}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${users}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      // /sel.jsp(261,12) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVarStatus("i");
      // /sel.jsp(261,12) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("u");
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("                <tr><td>人员id:");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${u.user_id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td></tr>\r\n");
            out.write("                <tr><td>名字：");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${u.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td></tr>\r\n");
            out.write("                <tr><td>手机号:");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${u.phone}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td></tr>\r\n");
            out.write("                <tr><td>邮箱：");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${u.email}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td></tr>\r\n");
            out.write("                <tr><td>状态：");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${u.i_status}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td></tr>\r\n");
            out.write("            ");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f1_reused = false;
    try {
      _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f1.setParent(null);
      // /sel.jsp(268,12) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f1.setItems(new org.apache.jasper.el.JspValueExpression("/sel.jsp(268,12) '${projects}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${projects}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      // /sel.jsp(268,12) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f1.setVarStatus("i");
      // /sel.jsp(268,12) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f1.setVar("p");
      int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
        if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("                <tr><td>项目id：");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p.p_id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td></tr>\r\n");
            out.write("                <tr><td>项目名：");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p.p_title}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td></tr>\r\n");
            out.write("                <tr> <td>负责人id:");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p.leader_id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td></tr>\r\n");
            out.write("                <tr><td>描述：");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p.desct}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td></tr>\r\n");
            out.write("            ");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f1.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
      _jspx_th_c_005fforEach_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f1_reused);
    }
    return false;
  }
}
