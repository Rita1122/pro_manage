/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.4.8.v20171121
 * Generated at: 2021-07-05 10:20:02 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import vo.User;
import java.util.List;
import vo.Project;
import java.util.ArrayList;
import service.UserService;
import service.TaskService;

public final class userHome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("vo.Project");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("service.TaskService");
    _jspx_imports_classes.add("service.UserService");
    _jspx_imports_classes.add("vo.User");
    _jspx_imports_classes.add("java.util.ArrayList");
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <title>用户主页</title>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/userHome.css\"/>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("        function onload(){\r\n");
      out.write("            var info=document.getElementById(\"info\").value;\r\n");
      out.write("            if(info==\"非组长无法创建项目\"){\r\n");
      out.write("                alert(info);\r\n");
      out.write("            }else if(info==\"无法创建第二支队伍\"){\r\n");
      out.write("                alert(info);\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("</head>\r\n");
      out.write("<body onload=\"onload()\">\r\n");

    User user = (User) request.getSession().getAttribute("curUser");
    int id = user.getUser_id();

      out.write("\r\n");
      out.write("<div class=\"titlebox\">\r\n");
      out.write("    <div class=\"usertitle\">\r\n");
      out.write("        欢迎<");
      out.print(user.getUser_id());
      out.write(">号用户\"");
      out.print(user.getName());
      out.write("\"|\r\n");
      out.write("        <a href=\"message?id=");
      out.print(id);
      out.write("\">\r\n");
      out.write("            <svg t=\"1625190174574\" class=\"icon\" viewBox=\"0 0 1024 1024\" version=\"1.1\" xmlns=\"http://www.w3.org/2000/svg\" p-id=\"3174\" width=\"200\" height=\"200\"><path d=\"M510.138193 0.006051c21.131511 0 40.913213 7.354138 55.388763 20.572969 11.077753 10.100304 19.269704 23.36568 23.458771 37.934322l2.094533 9.122855 7.214503 2.234168 10.007213 3.537434 10.612301 2.746166 4.095976 1.117084 5.02688 1.861807c48.453532 17.687168 90.809645 46.265908 125.951255 84.991498 56.645483 62.230905 89.180564 145.779502 92.485272 236.496057l0.279271 15.220274v225.883756l92.950723 122.879274 0.605088 0.930903c7.540319 8.052316 12.334473 18.990433 13.544647 30.626728l0.325816 5.864693v57.436751c0 28.392559-21.596963 51.897875-49.2448 54.690586l-5.585421 0.279271h-258.325746l-0.465452 2.327259A130.326503 130.326503 0 0 1 512.09309 1024a129.954141 129.954141 0 0 1-88.15657-34.210707 129.535235 129.535235 0 0 1-38.353228-63.720351l-2.513439-11.729385H124.790652c-28.392559 0-51.85133-21.690054-54.690586-49.384435L69.820795 859.323155v-57.436752c0-12.008656 3.86325-23.505316 11.077752-33.047077l4.282157-5.073425 92.531817-122.413822-0.232726-225.418304c0-96.348522 32.953987-185.808357 92.764543-251.716331a314.691959 314.691959 0 0 1 111.475705-79.359531l14.335915-5.585421 11.58975-4.189067 4.142521-1.256719 9.309035-3.490889 6.423235-2.094533 1.722172-0.465452 0.325816-1.722171c3.258163-17.454442 12.194837-33.512529 25.274033-45.474641A80.988612 80.988612 0 0 1 510.138193 0.006051z m57.809113 157.881249l-56.785119-7.354139-2.001443 0.139636-55.202583 6.842141-17.733713 6.143964-8.191952 3.025437c-34.117617 12.474108-63.813441 32.53508-88.854748 60.089826-41.145939 45.38155-65.442522 107.147003-68.281778 175.335692l-0.325816 13.730828 0.279271 256.696665L162.911154 815.33796v5.864693l698.177692 0.139635v-6.376689l-107.426274-142.009343V415.840685c0-73.96029-24.668945-140.938804-68.607595-189.15961a221.322329 221.322329 0 0 0-76.241004-55.062947l-14.38246-5.678512-8.610858-3.258163-17.873349-4.794153z\" p-id=\"3175\" fill=\"#ff5500\"></path></svg>\r\n");
      out.write("            消息通知\r\n");
      out.write("        </a>&nbsp;&nbsp;|\r\n");
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
      out.write("            个人主页\r\n");
      out.write("        </a>\r\n");
      out.write("        <a href=\"/ProjectList\">\r\n");
      out.write("            <svg t=\"1625190968167\" class=\"icon\" viewBox=\"0 0 1170 1024\" version=\"1.1\" xmlns=\"http://www.w3.org/2000/svg\" p-id=\"1625\" width=\"200\" height=\"200\"><path d=\"M856.77225 379.946705l153.688309 67.004897a22.349806 22.349806 0 0 1 0 41.048847l-225.724138 98.392573 225.724138 98.437094a22.349806 22.349806 0 0 1 0 41.093369l-461.866313 201.415384a91.714344 91.714344 0 0 1-73.193389 0L13.534544 725.923485a22.349806 22.349806 0 0 1 0-41.093369l225.724138-98.392573-225.724138-98.392573a22.349806 22.349806 0 0 1 0-41.093368l153.599265-67.004897 112.505897 49.062721L191.442563 467.476025l320.554988 139.797592 320.554989-139.797592-88.286186-38.466599 112.505896-49.062721zM351.720057 635.455743l-160.277494 69.898797 320.59951 139.797592 320.554988-139.797592-160.277494-69.898797-123.6808 53.96009a91.714344 91.714344 0 0 1-73.193389 0l-123.725321-53.96009zM547.614772 7.123444l463.201959 201.994165a22.260763 22.260763 0 0 1 0 40.826239L547.570251 451.893491a89.043052 89.043052 0 0 1-71.145399 0L13.222893 249.98837a22.260763 22.260763 0 0 1 0-40.82624l463.201959-201.994164a89.043052 89.043052 0 0 1 71.145399 0zM511.997551 84.5909L191.442563 224.388492l320.554988 139.797592 320.554989-139.797592-320.554989-139.797592z\" p-id=\"1626\" fill=\"#67c4d6\"></path></svg>\r\n");
      out.write("            我的项目\r\n");
      out.write("        </a>\r\n");
      out.write("        <a href=\"Member\">\r\n");
      out.write("            <svg t=\"1625191177784\" class=\"icon\" viewBox=\"0 0 1126 1024\" version=\"1.1\" xmlns=\"http://www.w3.org/2000/svg\" p-id=\"1818\" width=\"200\" height=\"200\"><path d=\"M662.575887 552.962355c127.743361 0 237.464413 18.841506 317.592012 56.01252C1072.583437 651.880261 1126.394368 719.92472 1126.394368 806.913085c0 88.729156-55.500522 149.093655-151.704841 181.554293-74.546827 25.190274-175.512722 35.532622-312.11364 35.532622h-5.273574c-133.887331-0.255999-232.958835-10.649547-306.379268-35.532622C254.974725 955.90434 199.679002 895.591042 199.679002 806.913085c0-86.988365 53.708531-155.032825 145.91927-197.88701 79.974-37.222214 189.439053-56.06372 316.977615-56.06372z m0 102.399488c-226.04687 0-360.497398 62.514887-360.497397 151.551242 0 39.116604 23.603082 64.870076 81.663591 84.581978 61.286094 20.735896 152.575237 30.105449 278.833806 30.105449h4.966375c123.749781-0.255999 213.707731-9.676752 274.379428-30.156649 58.367708-19.660702 82.07319-45.516572 82.07319-84.530778 0-88.985155-134.911325-151.551242-361.418993-151.551242zM386.199669 435.202944a51.199744 51.199744 0 0 1 0 102.399488C206.846966 537.602432 102.399488 586.549387 102.399488 652.545857c0 18.790306 6.655967 31.283044 22.988685 42.751787l1.535992 1.023994a51.199744 51.199744 0 1 1-57.343713 84.889176C24.729476 750.900565 0 706.817586 0 652.545857c0-75.161224 46.02857-133.93853 124.108179-170.495147 66.559667-31.180644 156.978415-46.847766 262.14269-46.847766zM665.596672 10.245069a250.878746 250.878746 0 1 1 0 501.757491 250.878746 250.878746 0 0 1 0-501.757491z m0 102.399488A148.479258 148.479258 0 1 0 665.596672 409.603072a148.479258 148.479258 0 0 0 0-296.958515zM389.118054 0.00512a51.199744 51.199744 0 0 1 1.433593 102.399488H389.118054a102.399488 102.399488 0 0 0-45.772571 194.04703l1.791991 0.870395a51.199744 51.199744 0 1 1-44.03178 92.466738A204.798976 204.798976 0 0 1 389.118054 0.00512z\" p-id=\"1819\" fill=\"#67c4d6\"></path></svg>\r\n");
      out.write("            我的团队\r\n");
      out.write("        </a>\r\n");
      out.write("        <a href=\"/MyTask\">\r\n");
      out.write("            <svg t=\"1625191252361\" class=\"icon\" viewBox=\"0 0 1024 1024\" version=\"1.1\" xmlns=\"http://www.w3.org/2000/svg\" p-id=\"2013\" width=\"200\" height=\"200\"><path d=\"M870.4 0a153.6 153.6 0 0 1 153.6 153.6v716.8a153.6 153.6 0 0 1-153.6 153.6H256a153.6 153.6 0 0 1-153.6-153.6v-102.4H51.2a51.2 51.2 0 0 1 0-102.4h51.2v-102.4H51.2a51.2 51.2 0 0 1 0-102.4h51.2V358.4H51.2a51.2 51.2 0 1 1 0-102.4h51.2V153.6a153.6 153.6 0 0 1 153.6-153.6h614.4z m0 102.4H256a51.2 51.2 0 0 0-50.8416 45.2096L204.8 153.6v102.4h51.2a51.2 51.2 0 1 1 0 102.4H204.8v102.4h51.2a51.2 51.2 0 0 1 0 102.4H204.8v102.4h51.2a51.2 51.2 0 0 1 0 102.4H204.8v102.4a51.2 51.2 0 0 0 45.2096 50.8416L256 921.6h614.4a51.2 51.2 0 0 0 50.8416-45.2096L921.6 870.4V153.6a51.2 51.2 0 0 0-45.2096-50.8416L870.4 102.4z m-66.56 153.6a51.2 51.2 0 0 1 51.2 51.2v409.6a51.2 51.2 0 0 1-102.4 0V307.2a51.2 51.2 0 0 1 51.2-51.2z\" p-id=\"2014\" fill=\"#67c4d6\"></path></svg>\r\n");
      out.write("            我的任务\r\n");
      out.write("        </a>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"leftBox\">\r\n");
      out.write("    <div class=\"leftBox1\">\r\n");
      out.write("        <a href=\"/newPro\">\r\n");
      out.write("            <svg t=\"1625193666713\" class=\"icon\" viewBox=\"0 0 1024 1024\" version=\"1.1\" xmlns=\"http://www.w3.org/2000/svg\" p-id=\"1440\" width=\"200\" height=\"200\"><path d=\"M512 0c282.763636 0 512 229.236364 512 512s-229.236364 512-512 512S0 794.763636 0 512 229.236364 0 512 0z m0 93.090909a418.909091 418.909091 0 1 0 0 837.818182 418.909091 418.909091 0 0 0 0-837.818182z m46.545455 139.636364v232.727272h232.727272v93.09091h-232.727272v232.727272h-93.09091v-232.727272H232.727273v-93.09091h232.727272V232.727273h93.09091z\" p-id=\"1441\" fill=\"#FFFFFF\"></path></svg>\r\n");
      out.write("            创建项目\r\n");
      out.write("        </a>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"leftBox1\">\r\n");
      out.write("        <a href=\"CreatTeam\">\r\n");
      out.write("            <svg t=\"1625193666713\" class=\"icon\" viewBox=\"0 0 1024 1024\" version=\"1.1\" xmlns=\"http://www.w3.org/2000/svg\" p-id=\"1440\" width=\"200\" height=\"200\"><path d=\"M512 0c282.763636 0 512 229.236364 512 512s-229.236364 512-512 512S0 794.763636 0 512 229.236364 0 512 0z m0 93.090909a418.909091 418.909091 0 1 0 0 837.818182 418.909091 418.909091 0 0 0 0-837.818182z m46.545455 139.636364v232.727272h232.727272v93.09091h-232.727272v232.727272h-93.09091v-232.727272H232.727273v-93.09091h232.727272V232.727273h93.09091z\" p-id=\"1441\" fill=\"#FFFFFF\"></path></svg>\r\n");
      out.write("            创建团队\r\n");
      out.write("        </a>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"leftBox1\">\r\n");
      out.write("        <a href=\"updateU?id=");
      out.print(id);
      out.write("\">\r\n");
      out.write("            <svg t=\"1625195130012\" class=\"icon\" viewBox=\"0 0 1024 1024\" version=\"1.1\" xmlns=\"http://www.w3.org/2000/svg\" p-id=\"6589\" width=\"200\" height=\"200\"><path d=\"M469.312 618.688V704a256 256 0 0 0-256 256H128a341.312 341.312 0 0 1 341.312-341.312z m0-42.688c-141.44 0-256-114.56-256-256s114.56-256 256-256 256 114.56 256 256-114.56 256-256 256z m0-85.312a170.624 170.624 0 1 0 0-341.376 170.624 170.624 0 1 0 0 341.376z m110.72 333.312a149.76 149.76 0 0 1 0-69.248l-42.304-24.448 42.688-73.92 42.304 24.448a149.12 149.12 0 0 1 59.968-34.624v-48.896H768v48.896c22.72 6.72 43.2 18.752 59.968 34.624l42.304-24.448 42.688 73.92-42.368 24.448a149.76 149.76 0 0 1 0 69.184l42.368 24.448-42.688 73.92-42.304-24.448a149.12 149.12 0 0 1-59.968 34.624v48.832h-85.312v-48.832a149.12 149.12 0 0 1-59.968-34.624l-42.304 24.448-42.688-73.92 42.304-24.384z m145.28 29.312a64 64 0 1 0 0-128 64 64 0 0 0 0 128z\" p-id=\"6590\" fill=\"#FFFFFF\"></path></svg>\r\n");
      out.write("            个人资料\r\n");
      out.write("        </a>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<input type=\"text\" style=\"display: none\" id=\"info\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${info}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("<div class=\"mainBox\">\r\n");
      out.write("    <div class=\"mainTitle\">\r\n");
      out.write("        &nbsp;&nbsp;&nbsp;项目总览\r\n");
      out.write("        <svg t=\"1625196429462\" class=\"icon\" viewBox=\"0 0 1024 1024\" version=\"1.1\" xmlns=\"http://www.w3.org/2000/svg\" p-id=\"7446\" width=\"200\" height=\"200\"><path d=\"M524.202667 487.381333a17.408 17.408 0 0 1-24.405334 0L226.261333 218.325333a17.408 17.408 0 0 0-24.448 0l-25.941333 25.514667a17.493333 17.493333 0 0 0 0 24.917333l323.925333 318.549334a17.408 17.408 0 0 0 24.405334 0L848.128 268.8a17.493333 17.493333 0 0 0 0-24.917333l-25.941333-25.514667a17.408 17.408 0 0 0-24.448 0l-273.493334 269.056z\" p-id=\"7447\" fill=\"#2c2c2c\"></path><path d=\"M524.202667 705.706667a17.408 17.408 0 0 1-24.405334 0l-273.536-269.013334a17.408 17.408 0 0 0-24.448 0l-25.941333 25.472a17.493333 17.493333 0 0 0 0 24.917334l323.925333 318.592a17.408 17.408 0 0 0 24.405334 0l323.925333-318.549334a17.493333 17.493333 0 0 0 0-24.96l-25.941333-25.472a17.408 17.408 0 0 0-24.448 0l-273.493334 269.013334z\" p-id=\"7448\" fill=\"#67c4d6\"></path></svg>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"mainTable\">\r\n");
      out.write("        <table cellspacing=\"10px\" >\r\n");
      out.write("            <tr>\r\n");
      out.write("                <th style=\"padding-right: 120px;\">项目名称</th>\r\n");
      out.write("                <th style=\"padding-right: 150px;\">项目描述</th>\r\n");
      out.write("                <th style=\"padding-right: 60px;\">负责人id</th>\r\n");
      out.write("                <th style=\"padding-right:30px ;\">完成进度</th>\r\n");
      out.write("            </tr>\r\n");
      out.write("            ");
 List<Project> projects = (ArrayList) request.getAttribute("projects");
                for (Project project : projects) {
      out.write("\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td style=\"font-size: 15px;font-weight: 400\">");
      out.print(project.getP_title());
      out.write("</td>\r\n");
      out.write("                <td style=\"font-size: 15px;font-weight: 400\">");
      out.print(project.getDesct());
      out.write("</td>\r\n");
      out.write("                ");

                    UserService userService = new UserService();
                    User leader;
                    int leader_id=project.getLeader_id();
//                    leader = userService.user(" user_id ", leader_id);
                
      out.write("\r\n");
      out.write("                <td style=\"font-size: 15px;font-weight: 400\">");
      out.print(leader_id);
      out.write("</td>\r\n");
      out.write("                ");

                    TaskService taskService=new TaskService();
                    int finishTask=taskService.finishedTask(project.getP_id());
                    int allTaskPro=taskService.allTaskPro(project.getP_id());
                
      out.write("\r\n");
      out.write("                <td style=\"font-size: 15px;font-weight: 400\">");
      out.print(finishTask);
      out.write('/');
      out.print(allTaskPro);
      out.write("</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            ");
}
      out.write("\r\n");
      out.write("        </table>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"rightBox\">\r\n");
      out.write("    <div class=\"rightTitle\">\r\n");
      out.write("        &nbsp;&nbsp;&nbsp;人员总览\r\n");
      out.write("        <svg t=\"1625196429462\" class=\"icon\" viewBox=\"0 0 1024 1024\" version=\"1.1\" xmlns=\"http://www.w3.org/2000/svg\" p-id=\"7446\" width=\"200\" height=\"200\"><path d=\"M524.202667 487.381333a17.408 17.408 0 0 1-24.405334 0L226.261333 218.325333a17.408 17.408 0 0 0-24.448 0l-25.941333 25.514667a17.493333 17.493333 0 0 0 0 24.917333l323.925333 318.549334a17.408 17.408 0 0 0 24.405334 0L848.128 268.8a17.493333 17.493333 0 0 0 0-24.917333l-25.941333-25.514667a17.408 17.408 0 0 0-24.448 0l-273.493334 269.056z\" p-id=\"7447\" fill=\"#2c2c2c\"></path><path d=\"M524.202667 705.706667a17.408 17.408 0 0 1-24.405334 0l-273.536-269.013334a17.408 17.408 0 0 0-24.448 0l-25.941333 25.472a17.493333 17.493333 0 0 0 0 24.917334l323.925333 318.592a17.408 17.408 0 0 0 24.405334 0l323.925333-318.549334a17.493333 17.493333 0 0 0 0-24.96l-25.941333-25.472a17.408 17.408 0 0 0-24.448 0l-273.493334 269.013334z\" p-id=\"7448\" fill=\"#67c4d6\"></path></svg>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"rightTable\">\r\n");
      out.write("        <table cellspacing=\"\" >\r\n");
      out.write("            <tr>\r\n");
      out.write("                <th style=\"padding-right:80px;\">用户名称</th>\r\n");
      out.write("                <th style=\"padding-right:15px ;\">状态</th>\r\n");
      out.write("            </tr>\r\n");
      out.write("            ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        </table>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</body></html>\r\n");
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
      // /userHome.jsp(135,12) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/userHome.jsp(135,12) '${Allusers}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${Allusers}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      // /userHome.jsp(135,12) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVarStatus("i");
      // /userHome.jsp(135,12) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("u");
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("                <tr>\r\n");
            out.write("                    <td style=\"font-size: 15px;font-weight: 400\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${u.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("                    <td style=\"font-size: 15px;font-weight: 400\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${u.i_status}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("                </tr>\r\n");
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
}
