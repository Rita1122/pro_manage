package servlet;

import service.ProjectService;
import service.TaskService;
import service.UserService;
import vo.Project;
import vo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name="allServlet",urlPatterns = "/all")
public class allServlet extends extendServlet{
    UserService userService = new UserService();
    ProjectService projectService = new ProjectService();
    @Override
    public void service(HttpServletRequest req, HttpServletResponse rep) throws ServletException, IOException {
        User u=(User)req.getSession().getAttribute("curUser");
        String i_status=u.getI_status();
        List<Project> projects;
        projects = projectService.AllProject();
        req.setAttribute("projects",projects);
        List<User> users=userService.allUsers();
        req.setAttribute("Allusers",users);
        if(i_status.contains("管理员"))
            req.getRequestDispatcher("adminHome.jsp").forward(req, rep);
        else {
            req.setAttribute("info",req.getAttribute("info"));
            req.getRequestDispatcher("userHome.jsp").forward(req, rep);}
    }
}
