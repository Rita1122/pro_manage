package servlet.Task;

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
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "newTask", urlPatterns = "newTask")
public class NewTask extends HttpServlet {
    TaskService taskService = new TaskService();

    @Override
    public void init() throws ServletException {
        taskService = (TaskService) getServletContext().getAttribute("taskService");
    }

    @Override
    public void service(HttpServletRequest req, HttpServletResponse rep) throws ServletException, IOException {
        User user = (User) req.getSession().getAttribute("curUser");
        int id = Integer.parseInt(req.getParameter("user_id"));
        int p_id = Integer.parseInt(req.getParameter("p_id"));
        String title = req.getParameter("title");
        String desc = req.getParameter("desc");
        String s_t = req.getParameter("s_t");
        String e_t = req.getParameter("e_t");


        taskService.newTask(id, title, desc, s_t, e_t, p_id);
        List<Task> tasks = new ArrayList<>();
        tasks = taskService.TaskList(p_id);
        req.setAttribute("tasks", tasks);
        req.getRequestDispatcher("Project.jsp").forward(req, rep);


    }
}

