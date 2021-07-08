package servlet.Admin;

import vo.Project;
import vo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.apache.commons.lang3.StringUtils.isNumeric;

@WebServlet(name="AselServlet",urlPatterns = "/asel")
public class AselServlet extends adminEx{
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse rep) throws ServletException, IOException {
        String sel = req.getParameter("sel");
        String value = req.getParameter("value");
        List<User> users = new ArrayList<>();
        List<Project> projects = new ArrayList<>();
        String info = "";
        if (sel.equals("")) info = "请选择查询";
        else if (sel.contains("team_id")) {
                if (!isNumeric(value)) {
                    info = "输入内容不合理";
                } else {
                    users = adminService.selUsers(sel, value, 1);
                    if (users.size() == 0) info = "查询结果为空";
                    else info = "查询结果如下";
                    req.setAttribute("users", users);
                }
            } else if (sel.contains("team_name")) {
                users = adminService.selUsers(sel, value, 0);
                if (users.size() == 0) info = "查询结果为空";
                else info = "查询结果如下";
                req.setAttribute("users", users);
            }
            else if (sel.contains("p_id")) {
                if (!isNumeric(value)) {
                    info = "输入内容不合理";
                } else {
                    projects = adminService.selPro(sel, value, 1);
                    if (projects.size() == 0) info = "查询结果为空";
                    else info = "查询结果如下";
                    req.setAttribute("projects", projects);
                }
            }
            else if (sel.contains("p_title")) {
                projects = adminService.selPro(sel, value, 0);
                if (projects.size() == 0) info = "查询结果为空";
                else info = "查询结果如下";
                req.setAttribute("projects", projects);
            }
            else if (sel.contains("user_id")) {
                if (!isNumeric(value)) {
                    info = "输入内容不合理";
                } else {
                    users = adminService.selUsers(sel, value, 1);
                    if (users.size() == 0) info = "查询结果为空";
                    else info = "查询结果如下";
                    req.setAttribute("users", users);
                }
            }
            else if (sel.contains("name")) {
                users = adminService.selUsers(sel, value, 2);
                if (users.size() == 0) info = "查询结果为空";
                else info = "查询结果如下";
                req.setAttribute("users", users);
            }

            req.setAttribute("info", info);
            req.getRequestDispatcher("sel.jsp").forward(req, rep);

    }
}
