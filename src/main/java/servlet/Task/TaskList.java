package servlet.Task;

import service.ProjectService;
import service.TaskService;
import vo.Project;
import vo.Task;
import vo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "TaskList", urlPatterns = "TaskList")
public class TaskList extends HttpServlet {
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

        int id = user.getUser_id();
        req.getSession().setAttribute("id", id);
        int p_id  = (int) req.getSession().getAttribute("p_id");

        List<Task> tasks;
        tasks = taskService.TaskList(p_id);
        req.setAttribute("tasks", tasks);
        req.getRequestDispatcher("TaskList.jsp").forward(req, rep);

    }
}
