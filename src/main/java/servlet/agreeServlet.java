package servlet;

import vo.Team;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="agreeServlet",urlPatterns = "/agree")
public class agreeServlet extends extendServlet{
    @Override
    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String receive_id=req.getParameter("id");
        String ty=req.getParameter("ty");//
        String send_id=req.getParameter("id2");
        String m_id=req.getParameter("m_id");
        Team t=userService.team("user_id",send_id,1);
        int team_id = t.getTeam_id();
        if(Integer.parseInt(ty)==1){
            userService.modify("i_status","已加入",receive_id,1);
            userService.modify("team_id",Integer.toString(team_id),receive_id,2);
        }else{
            userService.modify("i_status","可邀请",receive_id,1);
        }
        messageService.modifyM(Integer.parseInt(m_id),1);
        req.getRequestDispatcher("message").forward(req,res);
    }

}
