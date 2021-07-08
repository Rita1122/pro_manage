package servlet;

import vo.Message;
import vo.Team;
import vo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import static java.lang.System.out;

@WebServlet(name="messageServlet" ,urlPatterns = "/message")
public class messageServlet extends extendServlet{
    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        res.setContentType("text/html;charset=utf-8");
        User u = (User) req.getSession().getAttribute("curUser");
        int id = u.getUser_id();
        List<Message> messages = messageService.noCheck(id,0);
        String info = "";
        if (messages.size() == 0) {
            info = "消息为空";
        } else {
            info="消息栏：";
            req.setAttribute("messages", messages);
        }
        req.setAttribute("info",info);
        req.getRequestDispatcher("message.jsp").forward(req, res);
    }


}
