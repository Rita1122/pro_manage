<%@ page import="vo.User" %>
<%@ page import="vo.Task" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>任务修改</title>
<%--    <link rel="stylesheet" type="text/css" href="css/newProject.css"/>--%>
    <style >
        .mainBox{
            width: 70%;
            float: left;
            background-color: #FFFFFF;
            box-shadow: 10px 10px 5px #888888;
        }
        #user_id,#p_id,#t_id,#title,#desc,#s_t,#e_t{
            width: 251px;
            height: 32px;
            border: 1.5px solid  #003140;
            border-radius: 8px;
        }
        .rightBox{
            width: 10%;
            float: right;
        }
        .rightBox img{
            width: 160px;
            position:absolute;
            bottom:25px;
            right:20px
        }
        .btn_sub{
            width: 80px;
            height: 40px;
            background-color:  #003f52;
            border: 1px solid  #003f52;
            border-radius: 5px;
            padding-left: 10px ;
            color:white;
            font-family: 宋体;
        }
        .btn_sub:hover{
            filter: brightness(1.1);
        }
    </style>
</head>
<body>
<jsp:include page="navigator.jsp"></jsp:include>
<jsp:include page="left.jsp"></jsp:include>
<%
    User user = (User) request.getSession().getAttribute("curUser");
    int id = user.getUser_id();

    Task task = (Task)request.getSession().getAttribute("task");

%>
<div class="mainBox">
    <h2 style="text-align: center;">修改任务</h2>
    <form method="post" action="/UpdateTask">
        <table cellpadding="10px" align="center">
            <tr>
                <td class="td_left">您的id：<input name="user_id" id="user_id" type="text" value="<%=id%>" readonly ></td>
            </tr>
            <tr>
                <td class="td_left">项目id：<input name="p_id" id="p_id" type="text" value="<%=task.getP_id()%>" readonly></td>
            </tr>
            <tr>
                <td class="td_left">任务编号：<input name="t_id" id="t_id" type="text" value="<%=task.getT_id()%>" readonly></td>
            </tr>
            <tr>
                <td class="td_left">任务名称：<input name="title" id="title" type="text" value="<%=task.getT_title()%>"></td>
            </tr>
            <tr>
                <td class="td_left">任务描述：<input name="desc" id="desc" type="text" value="<%=task.getDesct()%>"></td>
            </tr>
            <tr>
                <td class="td_left">开始时间：<input name="s_t" id="s_t" type="datetime-local" value="<%=task.getS_t()%>"></td>
            </tr>
            <tr>
                <td class="td_left">结束时间：<input name="e_t" id="e_t" type="datetime-local" value="<%=task.getE_t()%>"></td>
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
    right:20px" src="img/南京.png" >
</body>
</html>
