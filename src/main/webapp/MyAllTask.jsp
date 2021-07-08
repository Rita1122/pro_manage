<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/7/1
  Time: 21:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>我的所有的任务</title>
</head>
<body>
<jsp:include page="navigator.jsp"></jsp:include>
<jsp:include page="left.jsp"></jsp:include>
<table>任务列表
    <tr>
        <td>任务编号</td>
        <td>任务名称</td>
        <td>完成状态</td>
        <td></td>
    </tr>
    <c:forEach items="${tasks}" varStatus="i" var="task">
    <tr>
        <td>${task.t_id}</td>
        <td>${task.t_title}</td>
        <td></td>
        </c:forEach>
    </tr>
</table>
</body>
</html>
