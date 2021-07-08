<%@ page import="vo.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>任务创建</title>
    <link rel="stylesheet" type="text/css" href="css/newTask.css"/>
</head>
<body>
<jsp:include page="navigator.jsp"></jsp:include>
<jsp:include page="left2.jsp"></jsp:include>
<%
    User user = (User) request.getSession().getAttribute("curUser");
    int id = user.getUser_id();
    int p_id = (int)request.getSession().getAttribute("p_id");
%>

<div class="mainBox">
    <h2 style="text-align: center;">添加任务</h2>
    <form method="post" action="/newTask">
        <table cellpadding="10px" align="center">
            <tr>
                <td class="td_left">组长id：<%=id%><input name="user_id" type="text" value="<%=id%>" hidden></td>
            </tr>
            <tr>
                <td class="td_left">项目id：<%=p_id%><input name="p_id" type="text" value="<%=p_id%>" hidden></td>
            </tr>
            <tr>
                <td class="td_left">任务名称：</td>
                <td class="td_mid"><input type="text" name="title" id="title" placeholder="请输入任务名称" required></td>
            </tr>
            <tr>
                <td class="td_left">任务描述：</td>
                <td class="td_mid"><textarea name="desc" id="desc" placeholder="请输入任务描述"></textarea></td>
            </tr>
            <tr>
                <td class="td_left">开始时间：</td>
                <td class="td_mid"><input type="datetime-local" name="s_t" id="s_t" placeholder="请选择开始时间" required></td>
            </tr>
            <tr>
                <td class="td_left">结束时间：</td>
                <td class="td_mid"><input type="datetime-local" name="e_t" id="e_t" placeholder="请选择结束时间" required></td>
            </tr>
            <tr>
                <td colspan="2" align="center" >
                    <input type="submit" class="btn_sub" value="提交">&nbsp;&nbsp;
                    <input type="reset" class="btn_sub" value="重置">
                </td>
            </tr>
        </table>
    </form>
</div>
<img style="width: 280px;
    position:absolute;
    bottom: 0px;
    right:20px" src="img/天津.png" >
</body>
</html>
