package servlet.Task;

import service.TaskService;
import vo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;

@WebServlet(name = "update",urlPatterns = "UpdateTask")
public class UpdateTask extends HttpServlet {
    TaskService taskService = new TaskService();

    @Override
    public void init() throws ServletException {
        taskService = (TaskService) getServletContext().getAttribute("taskService");
    }

    @Override
    public void service(HttpServletRequest req, HttpServletResponse rep) throws ServletException, IOException {
        User user = (User) req.getSession().getAttribute("curUser");
        int user_id = Integer.parseInt(req.getParameter("user_id"));

        int t_id= Integer.parseInt(req.getParameter("t_id"));


        String title = req.getParameter("title");
        String desc = req.getParameter("desc");
        String s_t = req.getParameter("s_t");
        String e_t = req.getParameter("e_t");


        taskService.UpdateTask(user_id,t_id, title, desc, s_t, e_t);
        req.getRequestDispatcher("/MyTask").forward(req, rep);

    }
}
