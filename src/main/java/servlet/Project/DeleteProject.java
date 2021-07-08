package servlet.Project;

import service.ProjectService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
@WebServlet(urlPatterns = "DeleteProject")
public class DeleteProject extends HttpServlet {
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
        projectService.DeleteProject(p_id);

        req.getRequestDispatcher("/ProjectList").forward(req,rep);
    }
}
