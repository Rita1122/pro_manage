 

 

**2019****级软件工程**

**web****组件开发课程设计**

 

**项目报告**

 

 

**指导教师：程志刚**

 

| 题目  | 团队任务管理系统 |        |      |         |      |            |      |      |
| ----- | ---------------- | ------ | ---- | ------- | ---- | ---------- | ---- | ---- |
| 成员1 | 姓名             | 潘佳莹 | 班级 | 软工193 | 学号 | 1191594006 | 得分 |      |
| 成员2 | 姓名             | 裘龚暖 | 班级 | 软工193 | 学号 | 1191594001 | 得分 |      |
| 成员3 | 姓名             | 叶巧玲 | 班级 | 软工193 | 学号 | 1190651136 | 得分 |      |

 

 

  **2021****年     7月**

目录

[第一章 项目需求... 3](#_Toc76599723)

[1.1概要说明... 3](#_Toc76599724)

[1.2功能描述... 3](#_Toc76599725)

[第二章 项目设计... 4](#_Toc76599726)

[2.1系统结构图... 4](#_Toc76599727)

[2.2核心流程图... 5](#_Toc76599728)

[2.3ER图及数据字典... 6](#_Toc76599729)

[第三章 项目开发过程... 9](#_Toc76599730)

[3.1项目结构说明... 9](#_Toc76599731)

[3.2项目配置... 10](#_Toc76599732)

[3.2.1 依赖配置... 12](#_Toc76599733)

[3.2.2 web配置... 13](#_Toc76599734)

[3.2.3用户请求分析... 14](#_Toc76599735)

[第四章 功能实现... 17](#_Toc76599736)

[4.1登陆注册... 17](#_Toc76599737)

[4.2用户主页... 17](#_Toc76599738)

[4.3创建团队... 18](#_Toc76599739)

[4.4创建项目... 19](#_Toc76599740)

[4.5我的团队... 20](#_Toc76599741)

[4.6邀请成员... 20](#_Toc76599742)

[4.7消息通知（查看/反馈）... 21](#_Toc76599743)

[4.8我的项目... 22](#_Toc76599744)

[4.9添加任务... 23](#_Toc76599745)

[4.10查看任务... 24](#_Toc76599746)

[4.11认领任务... 24](#_Toc76599747)

[4.12我的任务... 25](#_Toc76599748)

[4.13个人资料查看修改... 26](#_Toc76599749)

[4.14管理员主页... 27](#_Toc76599750)

[4.15管理员查询... 27](#_Toc76599751)

[第五章 总结与展望... 29](#_Toc76599752)

[1、总结... 29](#_Toc76599753)

[2、展望... 30](#_Toc76599754)

 

# 第一章 项目需求

## 1.1概要说明

背景：面向网络的团队协作开发模式已成为主流的企业团队协作的主流方式，尤其是在疫情背景下，员工只能进行线上交流，随着团队越来越多，任务越来越繁杂，致使团队组件与任务分配存在较大的阻碍。为了契合企业的项目开发需求，我们开发了基于web的“We Project”团队任务管理系统，为企业项目开发的团队组建和任务分配配备了较为完善的系统。

 

总体需求：实现团队协作和管理，项目开设、任务下达与完成统计，根据用户权限，对信息进行增删改查。

 

 

## 1.2功能描述

\1. 用户登录后即可看到当前所有项目和成员

\2. 用户可自行修改个人资料

\3. 用户可根据实际需求自行创建团队。

\4. 组长邀请其他用户加入，后台自动生成邀请通知发送给该用户

\5. 用户在消息通知处可查看邀请通知，选择同意即可加入该团队

\6. 用户可在历史记录处查看历史邀请

\7. 用户加入后可查看该团队成员，组长可删除成员

\8. 团队创建后组长才可以创建项目，发布任务

\9. 组员通过待认领任务列表，领取任务

\10. 用户在我的任务可查看自己领取的任务，完成任务后点击完成，更新项目进度

\11. 用户可在我的项目查看当前项目负责的所有任务

\12. 管理员登录后可看到项目和成员信息，可删除项目

\13. 管理员选择下拉列表内容进行搜索

 

 

 

 

# 第二章 项目设计

## 2.1系统结构图

![img](file:///C:/Users/ADMINI~1/AppData/Local/Temp/msohtmlclip1/01/clip_image002.jpg)

图2.1-1 系统结构图

 

1.团队任务管理系统主要分为：用户管理子系统、项目管理子系统、团队

管理子系统、任务管理子系统和消息管理子系统。

2.用户管理子系统包括用户注册和用户登录，管理员无法删除或者修改户的信息。

3.项目管理子系统：包括项目创建和项目信息修改，只有用户创建团队成为组长后才能创建项目。

4.团队管理子系统：包括团队创建、团队成员邀请和团队信息修改。只有组长创建团队以后才能邀请未入组的成员。

5.任务管理子系统：包括任务创建、任务信息修改和任务认领。

6.消息管理子系统：包括发送消息和回复消息。组长邀请成员时自动发送消息给成员，成员可从消息通知中查看邀请信息，并选择同意或者拒绝。

 

 

## 2.2核心流程图

![img](file:///C:/Users/ADMINI~1/AppData/Local/Temp/msohtmlclip1/01/clip_image004.jpg)

图2.2-1 核心流程图

 

 

\1. 用户登录和注册后识别用户身份

\2. 组长：创建团队 创建项目 添加、修改、删除任务

\3. 组员：加入团队 认领任务 完成任务 

\4. 管理员:查询 删除项目

 

 

 

 

 

 

## 2.3ER图及数据字典

![img](file:///C:/Users/ADMINI~1/AppData/Local/Temp/msohtmlclip1/01/clip_image006.jpg)

 

图2.3-1 er图

 

 

 

| **User****用户表** |                    |            |          |            |      |
| ------------------ | ------------------ | ---------- | -------- | ---------- | ---- |
| 数据项名称         | 数据项类型（长度） | 是否为主键 | 是否为空 | 数据项含义 | 说明 |
| user_id            | int(8)             | 是         | 否       | 用户编号   | 自增 |
| name               | varchar(20)        |            | 是       | 名称       |      |
| password           | varchar(225)       |            | 是       | 密码       |      |
| email              | varchar(255)       |            | 是       | 邮箱       |      |
| phone              | varchar(20)        |            | 是       | 电话       |      |
| team_id            | int(11)            |            | 是       | 团队编号   | 外键 |
| i_status           | varchar(255)       |            | 是       | 状态       |      |

 

 

 

| **Project****项目表** |                  |            |          |            |            |
| --------------------- | ---------------- | ---------- | -------- | ---------- | ---------- |
| 数据项名称            | 数据类型（长度） | 是否为主键 | 是否为空 | 数据项含义 | 数据项说明 |
| p_id                  | int(8)           | 主键       | 否       | 项目编号   | 自增       |
| p_title               | varchar(255)     |            | 是       | 项目名称   |            |
| s_t                   | varchar(20)      |            | 是       | 开始时间   |            |
| leader_id             | int(11)          |            | 是       | 组长编号   | 外键       |
| e_t                   | varchar(255)     |            | 是       | 结束时间   |            |
| desct                 | varchar(255)     |            | 是       | 描述       |            |

 

 

| **Team****团队表** |                  |            |          |            |            |
| ------------------ | ---------------- | ---------- | -------- | ---------- | ---------- |
| 数据项名称         | 数据类型（长度） | 是否为主键 | 是否为空 | 数据项含义 | 数据项说明 |
| team_id            | int(8)           | 主键       | 否       | 团队编号   | 自增       |
| team_name          | varchar(30)      |            | 是       | 团队名称   |            |
| p_id               | int(8)           |            | 是       | 项目编号   | 外键       |
| user_id            | int(8)           |            | 是       | 用户编号   | 外键       |

 

| **Message****消息表** |                    |            |          |            |            |
| --------------------- | ------------------ | ---------- | -------- | ---------- | ---------- |
| 数据项名称            | 数据项类型（长度） | 是否为主键 | 是否为空 | 数据项含义 | 数据项说明 |
| m_id                  | int(8)             | 主键       | 否       | 消息编号   | 自增       |
| send_id               | int(8)             |            | 否       | 发送人编号 | 外键       |
| receive_id            | int(8)             |            | 否       | 接受人编号 | 外键       |
| type                  | int(11)            |            | 否       | 类型       |            |
| m_info                | varchar(255)       |            | 否       | 消息信息   |            |
| m_time                | varchar(255)       |            | 否       | 发送时间   |            |
| in_name               | varchar(255)       |            | 否       | 发送人姓名 |            |
| bein_name             | varchar(255)       |            | 否       | 接收者姓名 |            |
| team_id               | int(11)            |            | 否       | 团队编号   | 外键       |
| m_status              | int(20)            |            | 否       | 消息状态   |            |

 

| **Task****任务表** |                    |            |          |            |            |
| ------------------ | ------------------ | ---------- | -------- | ---------- | ---------- |
| 数据项名称         | 数据项类型（长度） | 是否为主键 | 是否为空 | 数据项含义 | 数据项说明 |
| t_id               | int(8)             | 主键       | 否       | 任务编号   | 自增       |
| t_title            | varchar(255)       |            | 是       | 任务名称   |            |
| desct              | varchar(255)       |            | 是       | 描述       |            |
| p_id               | int(8)             |            | 是       | 项目编号   | 外键       |
| s_t                | varchar(255)       |            | 是       | 开始时间   |            |
| t_status           | int(11)            |            | 是       | 状态       |            |
| e_t                | varchar(255)       |            | 是       | 结束时间   |            |
| user_id            | int(11)            |            | 是       | 用户编号   | 外键       |
| leader_id          | int(11)            |            | 是       | 组长编号   | 外键       |

 

 

 

 

 

 

 

# 第三章 项目开发过程

## 3.1项目结构说明

├─src

│ └─main

│   ├─java

│   │ ├─listen：监听器用于监听web应用中某些对象、信息的创建、   销毁、增加，修改，删除等动作的发生，然后作出相应的响应处理。

│   │ ├─service：为vo中的每一个类创建方法。

│   │ ├─servlet：相应jsp中的request请求，调用vo、service中的类和相应方法，做出相对请求的响应。

│   │ │ ├─Admin

│    │ │ ├─Project

│   │ │ ├─Task

│   │ │ └─User

│   │ ├─util：创建连接数据库、关闭数据库的父类

│   │ └─vo：为项目创建类，包括user、team、project、task message

│   └─webapp：包含jsp、css以及img，jsp向servlet发送请求，servlet发回响应后，接受响应。

│     ├─css：前端样式。

│     └─img

└─target

  ├─classes

  │ ├─listen

  │ ├─service

  │ ├─servlet

  │ │ ├─Admin

  │ │ ├─Project

  │ │ ├─Task

  │ │ └─User

  │ ├─util

  │ └─vo

  ├─generated-sources

  │ └─annotations

  ├─maven-status

  │ └─maven-compiler-plugin

  │   └─compile

  │     └─default-compile

  └─tmp

​    └─jsp

​      └─org

​        └─apache

​          └─jsp

 

 

## 3.2项目配置

\1. 配置IDEA的maven设置：点击File-Settings菜单，搜maven，maven配置成自己的maven。

![img](file:///C:/Users/ADMINI~1/AppData/Local/Temp/msohtmlclip1/01/clip_image008.jpg)

\2.  在IDEA中创建maven项目：FileNewproject，选择maven

![img](file:///C:/Users/ADMINI~1/AppData/Local/Temp/msohtmlclip1/01/clip_image010.jpg)

\3. 项目信息完善，maven选择

![img](file:///C:/Users/ADMINI~1/AppData/Local/Temp/msohtmlclip1/01/clip_image012.jpg)

 

![img](file:///C:/Users/ADMINI~1/AppData/Local/Temp/msohtmlclip1/01/clip_image014.jpg)

\4.  项目信息确认

![img](file:///C:/Users/ADMINI~1/AppData/Local/Temp/msohtmlclip1/01/clip_image016.jpg)

\5.  添加依赖、jetty插件

![img](file:///C:/Users/ADMINI~1/AppData/Local/Temp/msohtmlclip1/01/clip_image018.jpg)

 

 

### 3.2.1 依赖配置

<!--  servlet升级到3.0+-->

 <dependency>

  <groupId>javax.servlet</groupId>

  <artifactId>javax.servlet-api</artifactId>

  <version>4.0.0</version>

  <scope>provided</scope>

 </dependency>

 <!--  jstl标签库-->

 <dependency>

  <groupId>javax.servlet.jsp.jstl</groupId>

  <artifactId>jstl</artifactId>

  <version>1.2</version>

 </dependency>

 <dependency>

  <groupId>org.glassfish.web</groupId>

  <artifactId>jstl-impl</artifactId>

  <version>1.2</version>

 </dependency>

 <!--mysql依赖-->

 <dependency> 

  <groupId>mysql</groupId>

  <artifactId>mysql-connector-java</artifactId>

  <version>5.1.49</version>

 </dependency>

 <dependency>

  <groupId>org.apache.commons</groupId>

  <artifactId>commons-lang3</artifactId>

  <version>3.7</version>

 </dependency>

 <dependency>

  <groupId>org.mindrot</groupId>

  <artifactId>jbcrypt</artifactId>

  <version>0.4</version>

 </dependency>

<!--处理常用的编码方法的工具类包 例如DES、SHA1、MD5、Base64等.-->

 <dependency>

  <groupId>commons-codec</groupId>

  <artifactId>commons-codec</artifactId>

  <version>1.10</version>

 </dependency>

<!--包含java web编程所需的基础类，如：httpsServletRequest-->

 <dependency>

  <groupId>javax.servlet</groupId>

  <artifactId>servlet-api</artifactId>

  <version>2.5</version>

 </dependency>

 <dependency>

  <groupId>javax.servlet.jsp</groupId>

  <artifactId>jsp-api</artifactId>

  <version>2.1</version>

 </dependency>

</dependencies>

 

 

### 3.2.2 web配置

name:指定servlet的name属性，等价与<Servlet-name>标签

urlPattrens:指定一组servlet的url的匹配模式，等价于<url-pattern>标签

![img](file:///C:/Users/ADMINI~1/AppData/Local/Temp/msohtmlclip1/01/clip_image020.jpg)

extendServlet、adminEx:作为父类，用于初始化servlet

LoginServlet:处理登录页面上传参数，判断能否登录，实现用户页面跳转

RegistServlet:处理注册页面上传数据，负责将用户信息上传至数据库

allServlet:根据用户权限判断跳转至用户页面还是管理员页面，同时将当前用户和项目信息传送到主页上展示

CreatTeamServlet:判断是否符合创建团队的条件，完成队伍创建

delServlet:组长删除组员

inviteServlet:点击邀请用户后，获取参数生成通知，发送给对应用户

MemberServlet:查看成员列表

messgeServlet:查看未处理通知

allMServlet:查看历史通知

updateUServlet:更新个人资料

AselServlet:管理员查询信息

delPro:管理员删除项目

Allprojct:展示所有项目

DeleteProject：根据用户权限删除项目

getProject：根据项目编号调取项目

NewProSerlvet:判断是否符合创建项目的条件，完成项目创建

ProjectList:查看自己团队的项目

updateProject:修改更新项目内容

NewTask:判断是否符合创建任务的条件，创建任务

DeleteTask:组长删除任务

Finish:标记任务完成度

getTask:根据任务id调取任务

MyTask:展示用户领取的任务

ProTask:查看该项目下的所有任务

RenLing:获取当前项目所有未认领任务

UpdateTask:修改更新任务

WeiRenLing:任务认领后相应信息的处理

 

 

### 3.2.3用户请求分析

 

| 用户操作       | 请求名     | url            | 请求类型 | 参数                                   | 功能描述               | 视图名                                      |
| -------------- | ---------- | -------------- | -------- | -------------------------------------- | ---------------------- | ------------------------------------------- |
| 登录页面       | 登录       | userlogin.jsp  | GET      | 无                                     | 打开登录页面           | userlogin.jsp                               |
| 点击登录按钮   | 登录       | /login         | POST     | 用户登录信息：用户名/密码等            | 根据表单数据处理登录   | 成功：all(Servlet)  失败  userlogin.jsp     |
| 注册           | 注册       | userRegist.jsp | GET      | 无                                     | 进入注册界面           | userRegist.jsp                              |
| 点击注册       | 注册       | /regist        | POST     | 无                                     | 完成注册               | 成功：userLogin.jdp  失败：userRegist.jsp   |
| 创建团队       | creatTeam  | /creatTeam     | GET      | user_id                                | 进入creatTeam          | 成功：creatTeam.jsp  失败：all(Servlet)     |
| 点击提交       | creatTeam  | /creatTeam     | POST     | user_id,team_id                        | 完成创建团队           | 成功：  all(Servlet)  失败：  creatTeam.jsp |
| 邀请成员       | invite     | /extend        | GET      | user_id                                | 进入addUser.jsp        | 成功：extend  失败：all                     |
| 点击邀请       | invite     | /invite        | GET      | lead_id  user_id                       | 完成邀请，生成邀请通知 | extend                                      |
| 创建项目       | newProjct  | /newPro        | GET      | 无                                     | 进入newPro             | 成功：newProject.jsp  失败：all             |
| 点击提交       | newProject | /newPro        | POST     | title、desc、datetime-local            | 完成项目创建           | all                                         |
| 添加任务       | newTask    | newTask.jsp    | GET      | 无                                     | 进入newTask.jsp        | newTask.jsp                                 |
| 点击提交       | newTask    | /newTask       | POST     | user_id\p_id\title\desc\datetime-local | 完成任务添加           | project.jsp                                 |
| 领取任务       | WeiRenLing | WeiRenLing     | GET      | 无                                     | 进入WeiRenLing.jsp     | WeiRenLing.jsp                              |
| 点击认领       | RenLing    | /RenLing       | GET      | 无                                     | 认领任务               | WeiRenLing.jsp                              |
| 点击个人资料   | updateU    | updateU        | GET      | user_id                                | 查看个人资料           | updateU.jsp                                 |
| 修改个人资料   | updateU    | updateU        | POST     | user_id\name\password\email\phone      | 修改个人资料           | /all                                        |
| 修改项目       | updatePro  | /getProject    | GET      | p_id                                   | 进入UpdateProject.jsp  | UpdateProject.jsp                           |
| 点击提交       | updatePro  | /UpdateProject | POST     | title\desc\datetime-local              | 修改项目               | /ProjectList                                |
| 修改任务       | updateTask | /getTask       | GET      | t_id                                   | 进入UpdateTask.jsp     | UpdateTask.jsp                              |
| 点击提交       | updateTask | /UpdateTask    | POST     | user_id\p_id\t_id\title\desc\s_t\e_t   | 修改任务               | MyTask                                      |
| 管理员删除     | delPro     | delPro         | GET      | p_id                                   | 删除项目               | all                                         |
| 管理员信息查询 | select     | asel           | POST     | 查询的类型、内容                       | 查询信息               | sel.jsp                                     |

 

 

 

# 第四章 功能实现

## 4.1登陆注册

注册：request获取数据，Servlet调用addUsers保存信息到数据库

登录：request获取数据，Servlet调用login从数据库调取相应的用户对比。

![img](file:///C:/Users/ADMINI~1/AppData/Local/Temp/msohtmlclip1/01/clip_image022.jpg)

![img](file:///C:/Users/ADMINI~1/AppData/Local/Temp/msohtmlclip1/01/clip_image024.jpg)

![img](file:///C:/Users/ADMINI~1/AppData/Local/Temp/msohtmlclip1/01/clip_image026.jpg)

![img](file:///C:/Users/ADMINI~1/AppData/Local/Temp/msohtmlclip1/01/clip_image028.jpg)

 

## 4.2用户主页

（显示所有项目和成员）

![img](file:///C:/Users/ADMINI~1/AppData/Local/Temp/msohtmlclip1/01/clip_image030.jpg)

![img](file:///C:/Users/ADMINI~1/AppData/Local/Temp/msohtmlclip1/01/clip_image032.jpg)

![img](file:///C:/Users/ADMINI~1/AppData/Local/Temp/msohtmlclip1/01/clip_image034.jpg)

## 4.3创建团队

![img](file:///C:/Users/ADMINI~1/AppData/Local/Temp/msohtmlclip1/01/clip_image036.jpg)

![img](file:///C:/Users/ADMINI~1/AppData/Local/Temp/msohtmlclip1/01/clip_image038.jpg)

![img](file:///C:/Users/ADMINI~1/AppData/Local/Temp/msohtmlclip1/01/clip_image040.jpg)

## 4.4创建项目

![img](file:///C:/Users/ADMINI~1/AppData/Local/Temp/msohtmlclip1/01/clip_image042.jpg)

![img](file:///C:/Users/ADMINI~1/AppData/Local/Temp/msohtmlclip1/01/clip_image044.jpg)

![img](file:///C:/Users/ADMINI~1/AppData/Local/Temp/msohtmlclip1/01/clip_image046.jpg)

## 4.5我的团队

**![img](file:///C:/Users/ADMINI~1/AppData/Local/Temp/msohtmlclip1/01/clip_image048.jpg)**

**![img](file:///C:/Users/ADMINI~1/AppData/Local/Temp/msohtmlclip1/01/clip_image050.jpg)**

**![img](file:///C:/Users/ADMINI~1/AppData/Local/Temp/msohtmlclip1/01/clip_image052.jpg)**

## 4.6邀请成员

**![img](file:///C:/Users/ADMINI~1/AppData/Local/Temp/msohtmlclip1/01/clip_image054.jpg)**

**![img](file:///C:/Users/ADMINI~1/AppData/Local/Temp/msohtmlclip1/01/clip_image056.jpg)**

**![img](file:///C:/Users/ADMINI~1/AppData/Local/Temp/msohtmlclip1/01/clip_image058.jpg)**

## 4.7消息通知（查看/反馈）

**![img](file:///C:/Users/ADMINI~1/AppData/Local/Temp/msohtmlclip1/01/clip_image060.jpg)**

**![img](file:///C:/Users/ADMINI~1/AppData/Local/Temp/msohtmlclip1/01/clip_image062.jpg)**

**![img](file:///C:/Users/ADMINI~1/AppData/Local/Temp/msohtmlclip1/01/clip_image064.jpg)**

## 4.8我的项目

**![img](file:///C:/Users/ADMINI~1/AppData/Local/Temp/msohtmlclip1/01/clip_image066.jpg)**

**![img](file:///C:/Users/ADMINI~1/AppData/Local/Temp/msohtmlclip1/01/clip_image068.jpg)**

**![img](file:///C:/Users/ADMINI~1/AppData/Local/Temp/msohtmlclip1/01/clip_image070.jpg)**

## 4.9添加任务

**![img](file:///C:/Users/ADMINI~1/AppData/Local/Temp/msohtmlclip1/01/clip_image072.jpg)**

**![img](file:///C:/Users/ADMINI~1/AppData/Local/Temp/msohtmlclip1/01/clip_image074.jpg)**

**![img](file:///C:/Users/ADMINI~1/AppData/Local/Temp/msohtmlclip1/01/clip_image076.jpg)**

![img](file:///C:/Users/ADMINI~1/AppData/Local/Temp/msohtmlclip1/01/clip_image078.jpg)

## 4.10查看任务

![img](file:///C:/Users/ADMINI~1/AppData/Local/Temp/msohtmlclip1/01/clip_image080.jpg)

![img](file:///C:/Users/ADMINI~1/AppData/Local/Temp/msohtmlclip1/01/clip_image082.jpg)

![img](file:///C:/Users/ADMINI~1/AppData/Local/Temp/msohtmlclip1/01/clip_image084.jpg)

## 4.11认领任务

![img](file:///C:/Users/ADMINI~1/AppData/Local/Temp/msohtmlclip1/01/clip_image086.jpg)

![img](file:///C:/Users/ADMINI~1/AppData/Local/Temp/msohtmlclip1/01/clip_image088.jpg)

![img](file:///C:/Users/ADMINI~1/AppData/Local/Temp/msohtmlclip1/01/clip_image090.jpg)

## 4.12我的任务

**![img](file:///C:/Users/ADMINI~1/AppData/Local/Temp/msohtmlclip1/01/clip_image092.jpg)**

**![img](file:///C:/Users/ADMINI~1/AppData/Local/Temp/msohtmlclip1/01/clip_image094.jpg)**

**![img](file:///C:/Users/ADMINI~1/AppData/Local/Temp/msohtmlclip1/01/clip_image096.jpg)**

**![img](file:///C:/Users/ADMINI~1/AppData/Local/Temp/msohtmlclip1/01/clip_image098.jpg)**

![img](file:///C:/Users/ADMINI~1/AppData/Local/Temp/msohtmlclip1/01/clip_image100.jpg)

![img](file:///C:/Users/ADMINI~1/AppData/Local/Temp/msohtmlclip1/01/clip_image102.jpg)

## 4.13个人资料查看修改

![img](file:///C:/Users/ADMINI~1/AppData/Local/Temp/msohtmlclip1/01/clip_image104.jpg)

![img](file:///C:/Users/ADMINI~1/AppData/Local/Temp/msohtmlclip1/01/clip_image106.jpg)

![img](file:///C:/Users/ADMINI~1/AppData/Local/Temp/msohtmlclip1/01/clip_image108.jpg)

## 4.14管理员主页

**![img](file:///C:/Users/ADMINI~1/AppData/Local/Temp/msohtmlclip1/01/clip_image110.jpg)**

**![img](file:///C:/Users/ADMINI~1/AppData/Local/Temp/msohtmlclip1/01/clip_image112.jpg)**

## 4.15管理员查询

（可根据用户、项目、团队信息查询）

**![img](file:///C:/Users/ADMINI~1/AppData/Local/Temp/msohtmlclip1/01/clip_image114.jpg)**

**![img](file:///C:/Users/ADMINI~1/AppData/Local/Temp/msohtmlclip1/01/clip_image116.jpg)**

**![img](file:///C:/Users/ADMINI~1/AppData/Local/Temp/msohtmlclip1/01/clip_image118.jpg)**

 

**
**

# 第五章 总结与展望

## 1、总结

## 2、展望

团队任务管理系统还存在一些不足，比如缺少组长和管理员对团队更多的管理权限，用户若想加入团队可以自己申请而不是只有组长邀请这一途径。此外，项目分析和团队分析我们做得还不是非常完善，目前只有项目进度分析，我们还可以加入项目难度分析、根据难度设置预计完成时间以及团队中各成的特点优势展示等。在答辩时，老师也指出删除项目是一项非常谨慎的操作，删除操作我们应该设置成伪删除，可以增加日志功能，可以让用户使用撤回删除、查看历史操作操作等功能。

如上问题和功能希望能在今后的课程设计中体现展示出来。

 