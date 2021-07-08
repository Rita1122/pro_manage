package servlet.User;

import service.UserService;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(name = "RegistServlet",urlPatterns = "regist")
public class RegistServlet extends HttpServlet {
    UserService userService =new UserService();
    @Override
    public void init() throws ServletException {
        userService=(UserService) getServletContext().getAttribute("userService");
    }
    @Override
    public void service(ServletRequest req, ServletResponse rep) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        rep.setContentType("text/html;charset=utf-8");
        String name=req.getParameter("name");
        String pwd= req.getParameter("password");
        String password = userService.md5(pwd);
        String email=req.getParameter("email");
        String phone=req.getParameter("phone");
        Boolean aBoolean=userService.userExist(name);
        if(!aBoolean){
            req.setAttribute("info1","用户名已存在");
            req.getRequestDispatcher("userRegist.jsp").forward(req,rep);
        }else{
            userService.addUsers(name,password,email,phone,0,"可邀请");
            req.getRequestDispatcher("userLogin.jsp").forward(req,rep);}
    }
}
