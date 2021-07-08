package servlet;

import service.MessageService;
import service.UserService;
import vo.Team;
import vo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet(name="extendServlet" ,urlPatterns = "/extend")
public class extendServlet extends HttpServlet {
    UserService userService =new UserService();
    MessageService messageService=new MessageService();
    @Override
    public void init() throws ServletException {
        userService=(UserService) getServletContext().getAttribute("userService");
        messageService=(MessageService) getServletContext().getAttribute("messageService");
    }
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse rep) throws ServletException, IOException {
        User u=(User) req.getSession().getAttribute("curUser");
        int id=u.getUser_id();
        Team t=userService.team("user_id",Integer.toString(id),1);
        if(t.getTeam_name()==null&&t.getTeam_id()==0&&t.getUser_id()==0)
            rep.sendRedirect("all");
        else {
            List<User> userList = userService.t_users("team_id", 0);
            req.setAttribute("userList", userList);
            req.getRequestDispatcher("addUser.jsp").forward(req, rep);
        }
    }

}
