<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: yeqiaoling
  Date: 2021/6/30
  Time: 15:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>创建团队</title>
    <link rel="stylesheet" type="text/css" href="css/newProject.css"/>
</head>
<body>
<jsp:include page="navigator.jsp"></jsp:include>
<jsp:include page="left.jsp"></jsp:include>
<div class="mainBox">
    <h2 style="text-align: center;">创建团队</h2>
    <form action="CreatTeam" method="post">
        <table cellpadding="10px" align="center">
            <tr><td>${info}</td></tr>
            <tr>
                <td class="td_left">组长id:${sessionScope.curUser.user_id}</td>
            </tr>
            <tr>
                <td class="td_left">团队名称：</td>
                <td class="td_mid"><input type="text" name="team_name" id="title" placeholder="请输入团队名称" required></td>
            </tr>
                <td colspan="2" align="center" >
                    <input type="submit" class="btn_sub" value="提交">&nbsp;&nbsp;
                    <input type="reset" class="btn_sub" value="重置">
                </td>
            </tr>
        </table>
    </form>
</div>
<img style="width: 220px;
    position:absolute;
    bottom: 15px;
    right:20px" src="img/深圳.png" >
</body>
</html>
