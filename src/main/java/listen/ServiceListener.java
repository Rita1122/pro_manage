package listen;


import service.*;
import vo.Project;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ServiceListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        UserService userService=new UserService();
        servletContextEvent.getServletContext().setAttribute("userService",userService);
        System.out.println("userService对象创建成功");
        ProjectService projectService=new ProjectService();
        servletContextEvent.getServletContext().setAttribute("projectService",projectService);
        System.out.println("proService对象创建成功");
        TaskService taskService=new TaskService();
        servletContextEvent.getServletContext().setAttribute("taskService",taskService);
        System.out.println("taskService对象创建成功");

        MessageService messageService=new MessageService();
        servletContextEvent.getServletContext().setAttribute("messageService",messageService);
        AdminService adminService=new AdminService();
        servletContextEvent.getServletContext().setAttribute("adminService",adminService);

    }
}
