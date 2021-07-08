package servlet.Project;

import service.ProjectService;
import service.UserService;
import vo.Project;
import vo.User;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "prolist", urlPatterns = "ProjectList")
public class ProjectList extends HttpServlet {
    ProjectService projectService = new ProjectService();
    UserService userService = new UserService();

    @Override
    public void init() throws ServletException {
        projectService = (ProjectService) getServletContext().getAttribute("projectService");
    }

    @Override
    public void service(HttpServletRequest req, HttpServletResponse rep) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        rep.setContentType("text/html;charset=utf-8");
        User curuser = (User) req.getSession().getAttribute("curUser");
        int user_id = curuser.getUser_id();
        User user = userService.user("user_id",user_id);
        int team_id = user.getTeam_id();
        req.getSession().setAttribute("id", user_id);
        int leader_id = userService.SearchLeadr(team_id);
        List<Project> projects;
        projects = projectService.IdProList(leader_id);
        req.setAttribute("projects", projects);
        if (user_id == leader_id) {
            req.getRequestDispatcher("MyProject.jsp").forward(req, rep);
        } else {
            req.getRequestDispatcher("UserProject.jsp").forward(req, rep);

        }
    }
}