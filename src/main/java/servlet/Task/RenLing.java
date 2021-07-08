package servlet.Task;

import service.TaskService;
import service.UserService;
import vo.Task;
import vo.User;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sound.midi.SoundbankResource;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ren", urlPatterns = "RenLing")
public class RenLing extends HttpServlet {
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
        int user_id = user.getUser_id();
        int p_id = (int) req.getSession().getAttribute("p_id");
        int t_id = Integer.parseInt(req.getParameter("id"));

        System.out.println("您的编号为：" + user_id + "项目编号为：" + p_id +
                "任务编号为：" + t_id);

        taskService.SetUser_id(user_id, t_id);
        List<Task> tasks =taskService.WeiRenList(p_id);
        req.setAttribute("tasks", tasks);

        req.getRequestDispatcher("WeiRenLing.jsp").forward(req,rep);
    }

}
