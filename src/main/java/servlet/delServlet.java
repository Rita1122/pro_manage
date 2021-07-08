package servlet;

import vo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="delServlet",urlPatterns = "/delU")
public class delServlet extends extendServlet {
    @Override
    public void service(HttpServletRequest req, HttpServletResponse rep) throws ServletException, IOException {
        String del_id = req.getParameter("del_id");
        userService.leaderDel(Integer.parseInt(del_id));
        req.getRequestDispatcher("Member").forward(req,rep);
    }
}
