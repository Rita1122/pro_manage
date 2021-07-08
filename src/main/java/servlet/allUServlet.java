package servlet;

import vo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name="allUServlet",urlPatterns = "/allU")
public class allUServlet extends extendServlet{
    @Override
    public void service(HttpServletRequest req, HttpServletResponse rep) throws ServletException, IOException {
        List<User> users=userService.allUsers();
        req.setAttribute("users",users);
        req.getRequestDispatcher("allUser.jsp").forward(req,rep);
    }
}
