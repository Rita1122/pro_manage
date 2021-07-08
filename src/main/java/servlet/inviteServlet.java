package servlet;
import vo.Message;
import vo.Team;
import vo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name="inviteServlet",urlPatterns = "/invite")
public class inviteServlet extends extendServlet{
    public void doGet(HttpServletRequest req, HttpServletResponse rep) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        rep.setContentType("text/html;charset=utf-8");
        String in_id=req.getParameter("leader_id");
        String bein_id=req.getParameter("user_id");
        User u = userService.user("user_id", Integer.parseInt(in_id));
        User bu = userService.user("user_id", Integer.parseInt(bein_id));
        Team t=userService.team("user_id",in_id,1);
        int id=t.getTeam_id();
        String team_name = t.getTeam_name();
        String in_name = u.getName();
        String bein_name = bu.getName();
        String content = bein_name + "您好，我是" + team_name + "的负责人,现诚挚地邀请您加入我们的团队，非常期待与您合作！";
        messageService.addMes(Integer.parseInt(in_id), Integer.parseInt(bein_id), 1, content, in_name, bein_name,id,0);
        userService.modify("i_status", "已邀请", bein_id,1);
        rep.sendRedirect("extend");
    }


}
