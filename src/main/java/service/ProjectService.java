package service;

import util.DBUtil;
import vo.Project;
import vo.Task;

import javax.servlet.annotation.WebServlet;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProjectService extends BaseService {
    public static Project rS3(ResultSet rs){
        Project project = new Project();
        try{
            int p_id = rs.getInt("p_id");
            String p_title = rs.getString("p_title");
            String desct=rs.getString("desct");
            int leader_id = rs.getInt("leader_id");

            String s_t = rs.getString("s_t");
            String e_t = rs.getString("e_t");


            project.setP_id(p_id);
            project.setDesct(desct);
            project.setP_title(p_title);
            project.setLeader_id(leader_id);
            project.setS_t(s_t);
            project.setE_t(e_t);
//            int p_id=rs.getInt("p_id");
//            String p_title=rs.getString("p_title");
//            String desct=rs.getString("desct");
//            int leader_id=rs.getInt("leader_id");
//            String s_t=rs.getString("s_t");
//            String e_t=rs.getString("e_t");

            return project;
        }catch (Exception e){
            return null;
        }
    }


    public  List<Project> read(ResultSet rs) throws SQLException {
        List<Project> projects = new ArrayList<>();
        while (rs.next()) {
           Project project =rS3(rs);
            projects.add(project);
        }
        return projects;
    }

    public static Project readPro(ResultSet rs) throws SQLException {
        Project project = new Project();
        if(rs.next()) {
            int p_id = rs.getInt("p_id");
            String p_title = rs.getString("p_title");
            String desct=rs.getString("desct");
            int leader_id = rs.getInt("leader_id");
            String s_t = rs.getString("s_t");
            String e_t = rs.getString("e_t");

            project.setP_id(p_id);
            project.setDesct(desct);
            project.setP_title(p_title);
            project.setLeader_id(leader_id);
            project.setS_t(s_t);
            project.setE_t(e_t);
        }
        return project;
    }

    public void newPro(int id, String title,
                       String desc, String s_t, String e_t) {
        String sql = "INSERT INTO project(leader_id,p_title,desct,s_t,e_t) values(" + id + ",'" + title
                + "','" + desc + "','" + s_t + "','" + e_t + "')";
        DBUtil.update(sql);
    }

    public List<Project> IdProList(int id) {
        String sql = "select * from project where leader_id =" + id;
        ResultSet rs = DBUtil.select(sql);
        try {
            return read(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public List<Project>  AllProject(){
        String sql = "select * from project ";
        ResultSet rs = DBUtil.select(sql);
        try {
            return read(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void  DeleteProject(int p_id){
        String sql = "delete from project where p_id= "+p_id;
        DBUtil.update(sql);
        System.out.println("删除了第"+p_id+"个项目");
    }

    public Project  getProject(int p_id){
        String sql = "select *  from project where p_id="+p_id;
        ResultSet rs = DBUtil.select(sql);
        try {
            return ProjectService.readPro(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public void UpdatePro(int id, String title,
                       String desc, String s_t, String e_t) {
        String sql = "update project set p_title = '"+title+"', desct = '"+ desc+"',s_t ='"+s_t+"',e_t = '"+e_t+"' where p_id = "+id;
        DBUtil.update(sql);
        System.out.println("更新成功");
    }

}
