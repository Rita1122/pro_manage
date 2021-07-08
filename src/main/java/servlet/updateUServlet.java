package servlet;

import vo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="updateUServlet",urlPatterns = "/updateU")
public class updateUServlet extends extendServlet{
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse rep) throws ServletException, IOException {
        User user=(User) req.getSession().getAttribute("curUser");
        User u=userService.user("user_id",user.getUser_id());
        req.setAttribute("u",u);
        req.getRequestDispatcher("updateU.jsp").forward(req,rep);
    }
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse rep) throws ServletException, IOException {
        String user_id=req.getParameter("user_id");
        String pwd=req.getParameter("password");
        String password = userService.md5(pwd);
        String email=req.getParameter("email");
        String phone=req.getParameter("phone");
        userService.modifyU(Integer.parseInt(user_id),password,email,phone);
        User u=userService.user("user_id",Integer.parseInt(user_id));
        req.setAttribute("u",u);
        req.getRequestDispatcher("/all").forward(req,rep);
    }
}
