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

@WebServlet(name = "Finish",urlPatterns = "/Finish")
public class Finish extends HttpServlet {
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
        int t_id = Integer.parseInt(req.getParameter("t_id"));


        taskService.FinishTask(id, t_id);
        req.getRequestDispatcher("/MyTask").forward(req, rep);
    }
}
