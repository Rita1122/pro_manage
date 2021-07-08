package service;

import util.DBUtil;
import vo.Project;
import vo.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AdminService {
    public void delPro(int p_id){
        String sql="delete project.*,task.* FROM project LEFT JOIN task on project.p_id=task.p_id WHERE project.p_id="+p_id+"";
        DBUtil.update(sql);
    }
    public List<Project> selPro(String key,String value,int ty){
        ProjectService projectService=new ProjectService();
        String sql="";
        if(ty==0)
            sql="select * from project where "+key+"='"+value+"'";//按项目名字查询项目--0
        else sql="select * from project where "+key+"="+value+"";//按项目编号查询--1
        ResultSet rs = DBUtil.select(sql);
        try {
            return projectService.read(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public List<User> selUsers(String key,String value,int ty){
        String sql="";
        if(ty==0)
            sql="SELECT user.* FROM team  JOIN user on team.team_id=user.team_id WHERE "+key+"='"+value+"'";//按名字查询--0
        else if(ty==1) sql="select * from user where "+key+"="+value+"";//按编号查询--1
        else if(ty==2) sql="select * from user where "+key+"='"+value+"'";//按姓名查询--2
        List<User> users=new ArrayList<>();
        ResultSet rs = DBUtil.select(sql);
        try {
            while (rs.next()){
                User u=UserService.rs2(rs);
                users.add(u);
            }
        }catch (SQLException e){
            return null;
        }
        return users;
    }

}
