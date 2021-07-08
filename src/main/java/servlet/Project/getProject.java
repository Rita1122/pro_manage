package servlet.Project;

import service.ProjectService;
import vo.Project;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "getProject")
public class getProject extends HttpServlet {
    ProjectService projectService = new ProjectService();

    @Override
    public void init() throws ServletException {
        projectService = (ProjectService) getServletContext().getAttribute("projectService");
    }

    @Override
    public void service(HttpServletRequest req, HttpServletResponse rep) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        rep.setContentType("text/html;charset=utf-8");
        int p_id = Integer.parseInt(req.getParameter("p_id"));
        req.getSession().setAttribute("p_id",p_id);
        Project project = new Project();
        project = projectService.getProject(p_id);

        req.setAttribute("project", project);
        req.getRequestDispatcher("UpdateProject.jsp").forward(req, rep);
    }
}
