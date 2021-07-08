package servlet.Admin;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="delPro",urlPatterns = "/delPro")
public class delPro extends adminEx{
    @Override
    public void service(HttpServletRequest req, HttpServletResponse rep) throws ServletException, IOException {
        String p_id=req.getParameter("p_id");
        adminService.delPro(Integer.parseInt(p_id));
        rep.sendRedirect("all");
    }

    }
