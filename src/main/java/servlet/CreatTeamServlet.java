package servlet;

import vo.Team;
import vo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="CreatTeamServlet",urlPatterns = "/CreatTeam")
public class CreatTeamServlet extends extendServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse rep) throws ServletException, IOException {
        User u=(User) req.getSession().getAttribute("curUser");
        int user_id=u.getUser_id();
        User user =  userService.user("user_id",user_id);
        String i_status=user.getI_status();
        if(i_status.contains("邀请")){
            rep.sendRedirect("CreatTeam.jsp");
        }
        else{
            String info="无法创建第二支队伍";
            req.setAttribute("info",info);
            req.getRequestDispatcher("all").forward(req,rep);
        }
    }
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse rep) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        rep.setContentType("text/html;charset=utf-8");
        String team_name=req.getParameter("team_name");
        User u=(User) req.getSession().getAttribute("curUser");
        int user_id=u.getUser_id();
        int i=userService.addTeams(team_name,0,user_id);
        Team t=userService.team("user_id",Integer.toString(user_id),1);
        int team_id = t.getTeam_id();
        userService.modify("team_id",Integer.toString(team_id),Integer.toString(user_id),2);
        userService.modify("i_status","组长",Integer.toString(user_id),1);
        if(i==0){
            req.setAttribute("info","创建失败");
            req.getRequestDispatcher("CreatTeam.jsp").forward(req,rep);
        }
        else{
            req.getSession().setAttribute("team",t);
            req.getRequestDispatcher("all").forward(req,rep);
        }
    }
}
