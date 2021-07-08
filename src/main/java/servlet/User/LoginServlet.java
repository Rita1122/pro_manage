package servlet.User;

import service.ProjectService;
import service.UserService;
import vo.Project;
import vo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "LoginServlet", urlPatterns = "login")
public class LoginServlet extends HttpServlet {
    UserService userService = new UserService();
    ProjectService projectService = new ProjectService();

    @Override
    public void init() throws ServletException {
        userService = (UserService) getServletContext().getAttribute("userService");
        projectService = (ProjectService) getServletContext().getAttribute("projectService");
    }

    @Override
    public void service(HttpServletRequest req, HttpServletResponse rep) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        rep.setContentType("text/html;charset=utf-8");
        String name = req.getParameter("name");
        String pwd = req.getParameter("password");
        String password=userService.md5(pwd);
        String info = "";
        if (name == null || password == null || name.equals("") || password.equals("")) {
            req.setAttribute("info", "用户信息不能为空");
            req.getRequestDispatcher("userLogin.jsp").forward(req, rep);
        } else {
            User user = userService.login(name, password);
            if (user==null) {
                req.setAttribute("info", "用户密码错误");
                req.getRequestDispatcher("userLogin.jsp").forward(req, rep);
            } else {
                req.getSession().setAttribute("curUser", user);
                req.setAttribute("name", name);
                req.getRequestDispatcher("all").forward(req, rep);
            }
        }
    }
}
