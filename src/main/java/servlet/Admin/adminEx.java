package servlet.Admin;

import service.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(name="adminEx",urlPatterns = "/ad")
public class adminEx extends HttpServlet {
    UserService userService =new UserService();
    MessageService messageService=new MessageService();
    ProjectService projectService=new ProjectService();
    TaskService taskService=new TaskService();
    AdminService adminService=new AdminService();
    @Override
    public void init() throws ServletException {
        userService=(UserService) getServletContext().getAttribute("userService");
        messageService=(MessageService) getServletContext().getAttribute("messageService");
        projectService=(ProjectService) getServletContext().getAttribute("projectService");
        taskService=(TaskService) getServletContext().getAttribute("taskService");
        adminService=(AdminService) getServletContext().getAttribute("adminService");
    }
}
