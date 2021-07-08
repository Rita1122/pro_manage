package servlet.Task;

import service.TaskService;

import vo.Task;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "getTask")
public class getTask extends HttpServlet {
    TaskService taskService = new TaskService();

    @Override
    public void init() throws ServletException {
        taskService = (TaskService) getServletContext().getAttribute("taskService");
    }

    @Override
    public void service(HttpServletRequest req, HttpServletResponse rep) throws ServletException, IOException {
        {
            req.setCharacterEncoding("utf-8");
            rep.setContentType("text/html;charset=utf-8");
            int t_id = Integer.parseInt(req.getParameter("t_id"));
            req.getSession().setAttribute("t_id", t_id);
            Task task = new Task();

           task =  taskService.getTask(t_id);
           req.getSession().setAttribute("task",task);
            req.getRequestDispatcher("UpdateTask.jsp").forward(req, rep);
        }

    }

}
