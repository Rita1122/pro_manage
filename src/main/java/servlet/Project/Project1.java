package servlet.Project;

import service.TaskService;
import vo.Task;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "Project")
public class Project1 extends HttpServlet {
    TaskService taskService =new TaskService();
    @Override
    public void init() throws ServletException {
        taskService = (TaskService) getServletContext().getAttribute("taskService");
    }
    @Override
    public void service(HttpServletRequest req, HttpServletResponse rep) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        rep.setContentType("text/html;charset=utf-8");
        int p_id=0;
        if(req.getParameter("p_id")!=null){
         p_id = Integer.parseInt(req.getParameter("p_id"));

        req.getSession().setAttribute("p_id",p_id);}
        else {
            req.getSession().getAttribute("p_id");
        }

        List<Task> tasks;
        tasks = taskService.TaskList(p_id);
        req.setAttribute("tasks", tasks);
        req.getRequestDispatcher("Project.jsp").forward(req, rep);

    }}
