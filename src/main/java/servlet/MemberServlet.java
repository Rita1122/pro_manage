package servlet;

import vo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name="MemberServlet",urlPatterns = "/Member")
public class MemberServlet extends extendServlet{
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse rep) throws ServletException, IOException {
        User user = (User) req.getSession().getAttribute("curUser");
        int id = user.getUser_id();
        User u = (User) userService.user("user_id",id);
        String i_status=u.getI_status();
        int team_id=u.getTeam_id();
        String info="";
        if(team_id==0||i_status.equals("可邀请")||i_status.equals("已邀请")) {
            info="尚未参与任何团队";
            req.setAttribute("info",info);
            req.getRequestDispatcher("teamMember.jsp").forward(req, rep);
        }
        else {
            info="我的成员";
            List<User>  users=userService.t_users("team_id", team_id);
            req.setAttribute("info",info);
            if(i_status.equals("已加入"))
            {
                req.setAttribute("users", users);
                req.setAttribute("info",info);
                req.getRequestDispatcher("teamMember.jsp").forward(req, rep);
            }
            else if(i_status.equals("组长")){
                req.setAttribute("users", users);
                req.getRequestDispatcher("leader.jsp").forward(req, rep);
            }
        }
    }
}
