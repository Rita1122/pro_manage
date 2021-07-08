package servlet.Task;

import service.TaskService;
import vo.Task;
import vo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "MyTask")
public class MyTask extends HttpServlet {
    TaskService taskService = new TaskService();

    @Override
    public void init() throws ServletException {
        taskService = (TaskService) getServletContext().getAttribute("taskService");
    }

    @Override
    public void service(HttpServletRequest req, HttpServletResponse rep) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        rep.setContentType("text/html;charset=utf-8");
        User user = (User) req.getSession().getAttribute("curUser");

        List<Task> tasks;
        tasks = taskService.MyTask(user.getUser_id());
        req.getSession().setAttribute("tasks", tasks);
        req.getRequestDispatcher("MyTask.jsp").forward(req, rep);


    }
}
