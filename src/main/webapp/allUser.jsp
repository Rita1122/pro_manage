<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: yeqiaoling
  Date: 2021/7/1
  Time: 22:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>成员列表</title>
</head>
<body>
<jsp:include page="navigator.jsp"></jsp:include>
<jsp:include page="left.jsp"></jsp:include>
<table>
    <tr><td><a href="all">返回主页</a> </td></tr>
    <tr><th>用户名</th><th>状态</th></tr>
    <c:forEach items="${users}" varStatus="i" var="u">
        <tr><td>${u.name}</td>
        <td>${u.i_status}</td></tr>
    </c:forEach>
</table>
</body>
</html>
