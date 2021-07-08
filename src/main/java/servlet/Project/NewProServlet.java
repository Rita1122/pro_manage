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

@WebServlet(name = "NewProServlet", urlPatterns = "newPro")

public class NewProServlet extends HttpServlet {

    ProjectService projectService = new ProjectService();
    UserService userService=new UserService();

    @Override
    public void init() throws ServletException {
        projectService = (ProjectService) getServletContext().getAttribute("projectService");
    }
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse rep) throws ServletException, IOException {
        User u= (User) req.getSession().getAttribute("curUser");
        int id = u.getUser_id();
        User user = userService.user("user_id",id);
        String i_status=user.getI_status();
        if(i_status.contains("组长")){
            rep.sendRedirect("newProject.jsp");
        }
        else{
            String info="非组长无法创建项目";
            req.setAttribute("info",info);
            req.getRequestDispatcher("all").forward(req,rep);
        }
    }
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse rep) throws ServletException, IOException {
        User user = (User) req.getSession().getAttribute("curUser");
        int id = user.getUser_id();
        String title = req.getParameter("title");
        String desc = req.getParameter("desc");
        String s_t = req.getParameter("s_t");
        String e_t = req.getParameter("e_t");

        
        projectService.newPro(id, title, desc, s_t, e_t);
        req.getRequestDispatcher("all").forward(req, rep);

    }
}
