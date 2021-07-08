<%@ page import="vo.User" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>所有的</title>
</head>
<body>
<jsp:include page="navigator.jsp"></jsp:include>
<jsp:include page="left.jsp"></jsp:include>
<table>
    <tr>
        <td>项目名称</td>
        <td>项目描述</td>
    </tr>
    <c:forEach items="${projects}" varStatus="i" var="pro">
    <tr>
        <td>${pro.p_title}</td>
        <td>${pro.desct}</td>
        </c:forEach>
    </tr>
</table>
</body>
</html>
