<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:include page="navigator.jsp"></jsp:include>
<jsp:include page="left.jsp"></jsp:include>
<table>任务列表
    <tr>
        <td>任务编号</td>
        <td>任务名称</td>
    </tr>
    <c:forEach items="${tasks}" varStatus="i" var="task">
    <tr>
        <td>${task.t_id}</td>
        <td>${task.t_title}</td>
        </c:forEach>
    </tr>
</table>
</body>
</html>
