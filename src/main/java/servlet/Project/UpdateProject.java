package servlet.Project;

import service.ProjectService;
import service.UserService;
import util.DBUtil;
import vo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

@WebServlet( urlPatterns = "UpdateProject")

public class UpdateProject extends HttpServlet {

    ProjectService projectService = new ProjectService();

    @Override
    public void init() throws ServletException {
        projectService = (ProjectService) getServletContext().getAttribute("projectService");
    }

    @Override
    public void service(HttpServletRequest req, HttpServletResponse rep) throws ServletException, IOException {
        User user = (User) req.getSession().getAttribute("curUser");
        int id = user.getUser_id();
        int p_id = (int) req.getSession().getAttribute("p_id");
        String title = req.getParameter("title");
        String desc = req.getParameter("desc");
        String s_t = req.getParameter("s_t");
        String e_t = req.getParameter("e_t");


        projectService.UpdatePro(p_id, title, desc, s_t, e_t);
        req.getRequestDispatcher("/ProjectList").forward(req,rep);

    }
}
