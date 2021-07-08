package servlet;

import vo.Message;
import vo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name="allMServlet",urlPatterns = "/allM")
public class allMServlet extends extendServlet{
    @Override
    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String user_id=req.getParameter("user_id");
        List<Message> messages=messageService.messages(Integer.parseInt(user_id));
        String info = "";
        if (messages.size() == 0) {
            req.setAttribute("info",info);
            req.getRequestDispatcher("message").forward(req, res);
        } else {
            info="历史消息栏：";
            req.setAttribute("messages", messages);
            req.setAttribute("info",info);
            req.getRequestDispatcher("allMessage.jsp").forward(req, res);
        }

    }
    }

