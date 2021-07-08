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

@WebServlet(urlPatterns = "AllProject")
public class AllProject extends HttpServlet {
    ProjectService projectService = new ProjectService();

    @Override
    public void init() throws ServletException {
        projectService = (ProjectService) getServletContext().getAttribute("projectService");
    }

    @Override
    public void service(HttpServletRequest req, HttpServletResponse rep) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        rep.setContentType("text/html;charset=utf-8");
        User user = (User) req.getSession().getAttribute("curUser");
        int id = user.getUser_id();
        req.getSession().setAttribute("id", id);

        List<Project> projects ;
        projects = projectService.AllProject();
        req.setAttribute("projects",projects);
        req.getRequestDispatcher("AllProject.jsp").forward(req,rep);
    }
}