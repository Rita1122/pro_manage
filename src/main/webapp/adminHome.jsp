<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: yeqiaoling
  Date: 2021/7/3
  Time: 16:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>管理员</title>
<%--    <link rel="stylesheet" type="text/css" href="css/admin.css"/>--%>
    <style>
        body{
            background-color: #ebf0e7;
        }
        .titlebox{
            height: 45px;
            background-color: #FFFFFF;
            margin-bottom: 20px;
        }
        .usertitle{
            float: right;
            margin: 10px;
            font-size: 15px;
            width: 200px;
            color: #000000;
        }
        .usertitle a{
            color: black;
            text-decoration:none
        }
        .usertitle a svg{
            width: 15px;
            height: 15px;
        }
        .titlecenter{
            float: left;
            text-align:center ;
            width: 200px;
            font-size: 26px;
            font-weight: 400;
            margin:0;
            padding-top: 10px;
            padding-bottom:10px ;
            background-color: #002140;
            color: #FFFFFF;
            box-shadow: 2px 0 6px rgb(0 21 41 );
        }
        .titlecenter svg{
            width: 25px;
            height:25px;
        }
        .navbar {
            width: 70%;
            background-color: #FFFFFF;
        }
        .navbar a {
            float: left;
            width: auto;
            display: block;
            color: black;
            text-align: center;
            padding: 12px 20px;
            text-decoration: none;
        }
        .navbar a svg{
            width: 18px;
            height: 18px;
        }
        .navbar a:hover{
            border-bottom: 4px solid #67c4d6;
            color: #67c4d6;
        }
        .leftbox{
            float:left;
            width: 16%;
            height:500px;
            background-color: #002140;
            padding:20px ;
            box-sizing: border-box;
        }
        .leftbox select{
            width: 150px;
            height: 30px;
            color: #888888;
            line-height: 30px!important;
            font-size: 12px;
            border-radius: 15px;
            padding: 0 35px 0 17px;
            border: 2px solid #FFFFFF;
            background: 0 0;
            box-sizing: border-box;
        }
        .leftbox input{
            width: 50px;
            height: 30px;
            color: #888888;
            line-height: 30px!important;
            font-size: 12px;
            border-radius: 15px;
            padding: 0 35px 0 17px;
            border: 2px solid #FFFFFF;
            background: 0 0;
            box-sizing: border-box;
        }
        .search{
            margin-left: 100px;
        }
        #value{
            width: 160px;
            height: 30px;
            line-height: 30px!important;
            font-size: 12px;
            border-radius: 15px;
            padding: 0 35px 0 17px;
            border: 2px solid #FFFFFF;
            background: 0 0;
            box-sizing: border-box;
        }
        .leftbox a{
            color: white;
            font-size: 18px;
            font-weight: 100;
            text-decoration:none
        }
        .mainBox{
            width: 70%;
            float: left;
            background-color: #FFFFFF;
            box-shadow: 10px 10px 5px #888888;
        }
        .maintitle{
            height: 40px;
            font-size: 18px;
            border-bottom:0.5px solid #EBF0E7;
        }
        .maintitle svg{
            width: 18px;
            height: 18px;
        }
        .maintable{
            margin: 10px;
            padding: 5px;
            font-weight: 400;
            color: #747474;
        }
        .rightbox{
            float:right;
            width: 22%;
            background-color: white;
            padding:20px ;
            box-sizing: border-box;
        }
        .righttitle{
            height: 40px;
            font-size: 15px;
            border-bottom:0.5px solid #EBF0E7;
        }
        .righttitle svg{
            width: 15px;
            height: 15px;
        }
        .righttable{
            margin: 10px;
            padding: 5px;
            font-weight: 400;
            font-size: 15px;
            color: #747474;
        }
        .mainbox{
            float:left;
            width: 55%;
            background-color: white;
            padding:20px ;
            box-sizing: border-box;
            box-shadow: 10px 10px 5px #888888;
        }
        .maintitle{
            height: 40px;
            font-size: 18px;
            border-bottom:0.5px solid #EBF0E7;
        }
        .maintitle svg{
            width: 18px;
            height: 18px;
        }
        .maintable{
            margin: 10px;
            padding: 5px;
            font-weight: 400;
            color: #747474;
        }
        .rightbox{
            float:right;
            width: 26%;
            background-color: white;
            padding:20px ;
            box-sizing: border-box;
        }
        .righttitle{
            height: 40px;
            font-size: 15px;
            border-bottom:0.5px solid #EBF0E7;
        }
    </style>
</head>
<body>
<div class="titlebox">
    <div class="usertitle">
        欢迎管理员！&nbsp;&nbsp;|
        <a href="logout.jsp">
            <svg t="1625191369578" class="icon" viewBox="0 0 1024 1024" version="1.1" xmlns="http://www.w3.org/2000/svg" p-id="4900" width="200" height="200"><path d="M950.093 487.772l-179.775-173.078c-14.382-13.851-35.955-13.851-50.336 0-14.382 13.842-14.382 34.614 0 48.465l118.647 114.228h-345.168c-21.573 0-35.955 13.842-35.955 34.614s14.382 34.614 35.955 34.614h345.168l-118.639 114.228c-14.382 13.851-14.382 34.623 0 48.465 7.192 6.93 14.382 10.386 25.164 10.386 10.792 0 17.982-3.465 25.173-10.386l179.775-176.535s0-3.465 3.6-3.465c10.782-10.386 10.782-31.149-3.6-41.535z" p-id="4901" fill="#2c2c2c"></path><path d="M853.010 754.307c-21.573 0-35.955 13.851-35.955 34.614v69.237c0 20.763-14.382 34.614-35.955 34.614h-611.235c-21.573 0-35.955-13.851-35.955-34.614v-692.317c0-20.763 14.382-34.614 35.955-34.614h611.235c21.573 0 35.955 13.851 35.955 34.614v69.237c0 20.764 14.382 34.614 35.955 34.614s35.955-13.851 35.955-34.614v-69.237c0-58.842-46.736-103.842-107.865-103.842h-611.235c-61.119 0-107.865 45-107.865 103.842v692.317c0 58.842 46.747 103.842 107.865 103.842h611.235c61.128 0 107.865-45 107.865-103.842v-69.237c0-20.764-14.382-34.614-35.955-34.614z" p-id="4902" fill="#00aa00"></path></svg>
            退出
        </a>
    </div>
    <div class="titlecenter">
        <svg t="1625189270473" class="icon" viewBox="0 0 1024 1024" version="1.1" xmlns="http://www.w3.org/2000/svg" p-id="1335" width="200" height="200"><path d="M764.9 503.5H520.5V259.2c0-139.8 111.2-254.5 247.8-255.7 67.7-0.6 131.2 25.4 179 73.2 47.8 47.8 73.8 111.3 73.3 178.9-1.2 136.6-115.9 247.9-255.7 247.9z m-188-56.4h188c109 0 198.4-86.1 199.3-192 0.4-52.4-19.7-101.6-56.7-138.6-36.6-36.6-85.2-56.7-136.9-56.7h-1.8c-105.8 1-191.9 90.4-191.9 199.4v187.9z m-323.5 573.5c-66.8 0-129.5-26-176.8-73.3-47.8-47.8-73.8-111.4-73.2-179 1.2-136.6 115.9-247.8 255.7-247.8h244.4v244.3c0 139.9-111.2 254.6-247.9 255.7l-0.2-28.2 0.2 28.2c-0.8 0.1-1.5 0.1-2.2 0.1z m5.7-443.7c-109 0-198.4 86.1-199.3 191.9-0.5 52.4 19.7 101.6 56.7 138.6 36.6 36.6 85.2 56.7 136.9 56.7h1.6c105.9-0.9 192-90.3 192-199.4V576.9H259.1z m244.3-73.4H259.7c-65.3 0-127.7-24.2-175.7-68.2-48.8-44.7-77.3-105-80.3-169.8C0.5 196.3 24.9 130.8 72.6 80.9c23.1-24.2 50.3-43.2 80.8-56.6C185 10.4 218.7 3.4 253.5 3.4c66.8 0 129.6 26 176.8 73.2 47.2 47.2 73.2 110 73.2 176.8l-0.1 250.1zM253.5 59.8c-53.4 0-103.2 21.3-140.1 60-36.9 38.7-55.8 89.4-53.3 143 2.3 49.8 24.4 96.3 62.1 130.9 37.6 34.5 86.5 53.4 137.6 53.4h187.4V253.5c0-51.7-20.1-100.4-56.7-136.9-36.7-36.6-85.3-56.8-137-56.8z m517.1 960.8h-2.3c-136.6-1.2-247.8-115.9-247.8-255.7V520.5h244.3c139.9 0 254.6 111.2 255.7 247.9 0.5 67.6-25.5 131.2-73.3 178.9-47.2 47.3-109.9 73.3-176.6 73.3zM576.9 576.9v187.9c0 109 86.1 198.4 191.9 199.4h1.8c51.7 0 100.2-20.1 136.9-56.7 37-37 57.2-86.2 56.8-138.6-0.9-105.9-90.3-192-199.3-192H576.9z" p-id="1336" fill="#f4ea2a"></path></svg>
        We Project
    </div>
    <div class="navbar">
        <a href="all">
            <svg t="1625190501224" class="icon" viewBox="0 0 1024 1024" version="1.1" xmlns="http://www.w3.org/2000/svg" p-id="1436" width="200" height="200"><path d="M395.1616 563.2c22.8352 0 31.0784 2.3552 39.424 6.8608 8.3456 4.4544 14.8992 11.008 19.3536 19.3536 4.5056 8.3456 6.8608 16.5888 6.8608 39.424v202.4448c0 63.4368-7.168 89.088-20.48 114.176a139.5712 139.5712 0 0 1-58.112 58.0096l-10.1376 5.0176c-22.3744 10.1376-48.9984 15.5136-103.936 15.5136H192.6656c-63.4368 0-89.088-7.168-114.176-20.48a139.5712 139.5712 0 0 1-58.0096-58.112l-5.0176-10.1376c-9.3696-20.6848-14.6432-44.9536-15.4112-91.8016L0 755.9168c0-63.4368 7.168-89.088 20.48-114.176a139.5712 139.5712 0 0 1 58.112-58.0096l10.1376-5.0176c20.6848-9.3696 44.9536-14.6432 91.8016-15.4112L395.1616 563.2z m233.6768 0h202.4448c63.4368 0 89.088 7.168 114.176 20.48 24.9856 13.4144 44.6464 33.0752 58.0096 58.112l5.0176 10.1376c10.1376 22.3744 15.5136 48.9984 15.5136 103.936v75.4176c0 63.4368-7.168 89.088-20.48 114.176a139.5712 139.5712 0 0 1-58.112 58.0096l-10.1376 5.0176c-22.3744 10.1376-48.9984 15.5136-103.936 15.5136h-75.4176c-63.4368 0-89.088-7.168-114.176-20.48a139.5712 139.5712 0 0 1-58.0096-58.112l-5.0176-10.1376c-9.3696-20.6848-14.6432-44.9536-15.4112-91.8016L563.2 628.8384c0-22.8352 2.3552-31.0784 6.8608-39.424a46.5408 46.5408 0 0 1 19.3536-19.3536c8.3456-4.5056 16.5888-6.8608 39.424-6.8608zM358.4 665.6H183.3984l-16.896 0.4608c-22.2208 0.9216-31.0272 3.328-39.6288 7.936a37.2224 37.2224 0 0 0-16.0768 16.0768c-5.12 9.5744-7.5776 19.3536-8.192 47.5136L102.4 755.9168v75.3664c0 42.7008 2.304 54.4256 8.3968 65.8432 3.84 7.168 8.9088 12.2368 16.0768 16.0768 9.5744 5.12 19.3536 7.5776 47.5136 8.192l18.3296 0.2048h75.3664c42.7008 0 54.4256-2.304 65.8432-8.3968a37.2224 37.2224 0 0 0 16.0768-16.0768c5.12-9.5744 7.5776-19.3536 8.192-47.5136L358.4 831.2832V665.6z m482.2016 0H665.6v175.0016l0.4608 16.896c0.9216 22.2208 3.328 31.0272 7.936 39.6288 3.84 7.168 8.9088 12.2368 16.0768 16.0768 9.5744 5.12 19.3536 7.5776 47.5136 8.192l18.3296 0.2048h75.3664c42.7008 0 54.4256-2.304 65.8432-8.3968a37.2224 37.2224 0 0 0 16.0768-16.0768c5.12-9.5744 7.5776-19.3536 8.192-47.5136l0.2048-18.3296v-75.3664c0-42.7008-2.304-54.4256-8.3968-65.8432a37.2224 37.2224 0 0 0-16.0768-16.0768c-10.496-5.632-21.2992-8.0384-56.5248-8.3456zM180.5312 0.1536L268.0832 0c63.4368 0 89.088 7.168 114.176 20.48 24.9856 13.4144 44.6464 33.0752 58.0096 58.112l5.0176 10.1376c10.1376 22.3744 15.5136 48.9984 15.5136 103.936v202.496c0 22.8352-2.3552 31.0784-6.8608 39.424a46.5408 46.5408 0 0 1-19.3536 19.3536c-8.3456 4.5056-16.5888 6.8608-39.424 6.8608H192.7168c-63.4368 0-89.088-7.168-114.176-20.48A139.5712 139.5712 0 0 1 20.5824 382.1568l-5.0176-10.1376C6.144 351.3856 0.8704 327.168 0.1024 280.2688L0 192.7168c0-63.4368 7.168-89.088 20.48-114.176A139.5712 139.5712 0 0 1 78.6432 20.5824l10.1376-5.0176C109.4144 6.144 133.632 0.8704 180.5312 0.1024z m563.2 0L831.2832 0c63.4368 0 89.088 7.168 114.176 20.48 24.9856 13.4144 44.6464 33.0752 58.0096 58.112l5.0176 10.1376c10.1376 22.3744 15.5136 48.9984 15.5136 103.936v75.4176c0 63.4368-7.168 89.088-20.48 114.176a139.5712 139.5712 0 0 1-58.112 58.0096l-10.1376 5.0176c-22.3744 10.1376-48.9984 15.5136-103.936 15.5136h-202.496c-22.8352 0-31.0784-2.3552-39.424-6.8608a46.5408 46.5408 0 0 1-19.3536-19.3536c-4.5056-8.3456-6.8608-16.5888-6.8608-39.424V192.7168c0-63.4368 7.168-89.088 20.48-114.176A139.5712 139.5712 0 0 1 641.8432 20.5824l10.1376-5.0176c20.6848-9.3696 44.9536-14.6432 91.8016-15.4112zM277.4016 102.4L192.7168 102.4c-42.7008 0-54.4256 2.304-65.8432 8.3968a37.2224 37.2224 0 0 0-16.0768 16.0768c-5.12 9.5744-7.5776 19.3536-8.192 47.5136L102.4 192.7168v75.3664c0 42.7008 2.304 54.4256 8.3968 65.8432 3.84 7.168 8.9088 12.2368 16.0768 16.0768 9.5744 5.12 19.3536 7.5776 47.5136 8.192L192.7168 358.4H358.4V192.7168c0-36.1472-1.6384-50.1248-5.888-60.416l-2.56-5.4272a37.2224 37.2224 0 0 0-16.0256-16.0768l-5.376-2.56c-9.4208-3.7888-21.8112-5.5296-51.1488-5.7856z m563.2 0L755.9168 102.4c-42.7008 0-54.4256 2.304-65.8432 8.3968a37.2224 37.2224 0 0 0-16.0768 16.0768c-5.632 10.496-8.0384 21.2992-8.3456 56.5248L665.6 358.4h165.6832c36.1472 0 50.1248-1.6384 60.416-5.888l5.4272-2.56a37.2224 37.2224 0 0 0 16.0768-16.0256c5.12-9.5744 7.5776-19.3536 8.192-47.5136L921.6 268.0832V192.7168c0-42.7008-2.304-54.4256-8.3968-65.8432a37.2224 37.2224 0 0 0-16.0768-16.0768l-5.376-2.56c-9.4208-3.7888-21.8112-5.5296-51.1488-5.7856z" p-id="1437" fill="#67c4d6"></path></svg>
            管理员主页
        </a>
    </div>
</div>
<div class="leftbox">
    <form action="asel" method="post">
        <select name="sel">
            <option value="">请选择查询</option>
            <option value="user_id">用户id</option>
            <option value="name">用户姓名</option>
            <option value="team_id">团队id</option>
            <option value="team_name">团队名</option>
            <option value="p_id">项目id</option>
            <option value="p_title">项目名</option>
        </select><br><br>
        <input name="value" id="value" placeholder="请输入查询信息"><br><br>
        <div class="search">
            <input style="color: #FFFFFF;" type="submit" value="搜索">
        </div>
    </form>
</div>
<div class="mainBox">
    <div class="maintitle">
        &nbsp;&nbsp;&nbsp;项目总览
        <svg t="1625196429462" class="icon" viewBox="0 0 1024 1024" version="1.1" xmlns="http://www.w3.org/2000/svg" p-id="7446" width="200" height="200"><path d="M524.202667 487.381333a17.408 17.408 0 0 1-24.405334 0L226.261333 218.325333a17.408 17.408 0 0 0-24.448 0l-25.941333 25.514667a17.493333 17.493333 0 0 0 0 24.917333l323.925333 318.549334a17.408 17.408 0 0 0 24.405334 0L848.128 268.8a17.493333 17.493333 0 0 0 0-24.917333l-25.941333-25.514667a17.408 17.408 0 0 0-24.448 0l-273.493334 269.056z" p-id="7447" fill="#2c2c2c"></path><path d="M524.202667 705.706667a17.408 17.408 0 0 1-24.405334 0l-273.536-269.013334a17.408 17.408 0 0 0-24.448 0l-25.941333 25.472a17.493333 17.493333 0 0 0 0 24.917334l323.925333 318.592a17.408 17.408 0 0 0 24.405334 0l323.925333-318.549334a17.493333 17.493333 0 0 0 0-24.96l-25.941333-25.472a17.408 17.408 0 0 0-24.448 0l-273.493334 269.013334z" p-id="7448" fill="#67c4d6"></path></svg>
    </div>
    <div class="maintable">
        <table cellspacing="" >
            <tr>
                <th style="padding-left: 30px; padding-right: 60px;">项目id</th>
                <th style="padding-right: 30px;">项目名称</th>
                <th style="padding-right:150px ;">项目描述</th>
                <th style="padding-right:30px ;">负责人id</th>
            </tr>
            <c:forEach items="${projects}" varStatus="i" var="p">
                <tr>
                    <td style="padding-left: 30px;">${p.p_id}</td>
                    <td>${p.p_title}</td>
                    <td>${p.desct}</td>
                    <td>${p.leader_id}</td>
                    <td><a style="text-decoration: none" href="delPro?p_id=${p.p_id}">删除</a> </td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>
<div class="rightbox">
    <div class="righttitle">
        &nbsp;&nbsp;&nbsp;人员总览
        <svg t="1625196429462" class="icon" viewBox="0 0 1024 1024" version="1.1" xmlns="http://www.w3.org/2000/svg" p-id="7446" width="200" height="200"><path d="M524.202667 487.381333a17.408 17.408 0 0 1-24.405334 0L226.261333 218.325333a17.408 17.408 0 0 0-24.448 0l-25.941333 25.514667a17.493333 17.493333 0 0 0 0 24.917333l323.925333 318.549334a17.408 17.408 0 0 0 24.405334 0L848.128 268.8a17.493333 17.493333 0 0 0 0-24.917333l-25.941333-25.514667a17.408 17.408 0 0 0-24.448 0l-273.493334 269.056z" p-id="7447" fill="#2c2c2c"></path><path d="M524.202667 705.706667a17.408 17.408 0 0 1-24.405334 0l-273.536-269.013334a17.408 17.408 0 0 0-24.448 0l-25.941333 25.472a17.493333 17.493333 0 0 0 0 24.917334l323.925333 318.592a17.408 17.408 0 0 0 24.405334 0l323.925333-318.549334a17.493333 17.493333 0 0 0 0-24.96l-25.941333-25.472a17.408 17.408 0 0 0-24.448 0l-273.493334 269.013334z" p-id="7448" fill="#67c4d6"></path></svg>
    </div>
    <div class="righttable">
        <table cellspacing="" style="border-spacing: 4px" >
            <tr>
                <th style="padding-right:15px;">用户id</th>
                <th style="padding-right:15px ;">用户名</th>
                <th style="padding-right:20px ;">状态</th>
                <th>团队id</th>
            </tr>
            <c:forEach items="${Allusers}" varStatus="i" var="u">
                <tr><td>${u.user_id}</td>
                    <td>${u.name}</td>
                    <td>${u.i_status}</td>
                <td>${u.team_id}</td></tr>
            </c:forEach>
        </table>
    </div>
</div>
</body>
</html>
