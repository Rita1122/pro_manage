package service;

import util.DBUtil;
import vo.Project;
import vo.Task;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TaskService extends BaseService {

    public static List<Task> read(ResultSet rs) throws SQLException {
        List<Task> tasks = new ArrayList<>();
        while (rs.next()) {
            int p_id = rs.getInt("p_id");
            String t_title = rs.getString("t_title");
            String desct = rs.getString("desct");
            int t_id = rs.getInt("t_id");
            int t_status = rs.getInt("t_status");
            String s_t = rs.getString("s_t");
            String e_t = rs.getString("e_t");
            int user_id = rs.getInt("user_id");
            int leader_id = rs.getInt("leader_id");

            Task task = new Task();
            task.setT_id(t_id);
            task.setT_status(t_status);
            task.setT_title(t_title);
            task.setS_t(s_t);
            task.setE_t(e_t);
            task.setUser_id(user_id);
            task.setLeader_id(leader_id);
            task.setDesct(desct);
            task.setP_id(p_id);

            tasks.add(task);
        }
        return tasks;
    }
    public static Task readTask(ResultSet rs) throws SQLException {
        if(rs.next()) {
            int p_id = rs.getInt("p_id");
            String t_title = rs.getString("t_title");
            String desct = rs.getString("desct");
            int t_id = rs.getInt("t_id");
            int t_status = rs.getInt("t_status");
            String s_t = rs.getString("s_t");
            String e_t = rs.getString("e_t");
            int user_id = rs.getInt("user_id");
            int leader_id = rs.getInt("leader_id");

            Task task = new Task();
            task.setT_id(t_id);
            task.setT_status(t_status);
            task.setT_title(t_title);
            task.setS_t(s_t);
            task.setE_t(e_t);
            task.setUser_id(user_id);
            task.setLeader_id(leader_id);
            task.setDesct(desct);
            task.setP_id(p_id);

            return task;
        }
       return  null;
    }

    public void newTask(int leader_id, String title,
                        String desc, String s_t, String e_t, int p_id) {
        String sql = "INSERT INTO task(leader_id,t_title,desct,s_t,e_t,p_id) values(" + leader_id + ",'" + title
                + "','" + desc + "','"+ s_t + "','" + e_t + "'," + p_id + ")";
        DBUtil.update(sql);
    }

    public List<Task> TaskList(int p_id) {
        String sql = "select * from  task where p_id=" + p_id;
        ResultSet rs = DBUtil.select(sql);
        try {
            return TaskService.read(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void SetUser_id(int user_id, int t_id) {
        String sql = "update task set user_id = " + user_id + " where t_id = " + t_id;
        DBUtil.update(sql);
    }

    public   List<Task> WeiRenList(int p_id) {
        String sql = "select * from task where user_id = 0 and p_id="+p_id;
        ResultSet rs = DBUtil.select(sql);
        try {
            return TaskService.read(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

    }
    public List<Task>  MyTask(int id){
        String sql = "select * from task where user_id = "+id;
        ResultSet rs = DBUtil.select(sql);
        try {
            return TaskService.read(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

    }
    public List<Task>  AllTask(){
        String sql = "select * from task ";
        ResultSet rs = DBUtil.select(sql);
        try {
            return TaskService.read(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Task>  ProTask(int p_id,int user_id ){
        String sql = "select * from task where p_id= "+p_id+" and user_id = "+user_id;
        ResultSet rs = DBUtil.select(sql);
        try {
            return TaskService.read(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public  void  DeleteTask(int leader_id,int t_id){
        String sql="delete from task where leader_id = "+leader_id +" and t_id = "+t_id;
        DBUtil.update(sql);
    }
    public  void  FinishTask(int user_id,int t_id){
        String sql="update task set t_status = "+1+" where user_id = "+user_id+" and t_id = "+t_id;
        DBUtil.update(sql);
    }
    public Task  getTask(int t_id ){
        String sql = "select * from task where t_id= "+t_id;
        ResultSet rs = DBUtil.select(sql);
        try {
            return TaskService.readTask(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public  void  UpdateTask(int leader_id,int t_id,String title,String
                             desct ,String s_t ,String e_t){
        String sql = "update task set t_title = '"+title+"', desct = '"+ desct+"',s_t ='"+s_t+"',e_t = '"+e_t+"' where t_id = "+t_id +" and leader_id = "+leader_id;
        DBUtil.update(sql);
        System.out.println("更新成功");
    }
    public int finishedTask(int p_id){
        String sql="select * from task where p_id='"+p_id+"' and t_status='1';";
        ResultSet rs = DBUtil.select(sql);
        List<Task> finishedTask=new ArrayList<>();
        try {
            finishedTask=TaskService.read(rs);
            int finshTasknum=finishedTask.size();
            return finshTasknum;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
    public int allTaskPro(int p_id){
        String sql="select * from task where p_id='"+p_id+"';";
        ResultSet rs=DBUtil.select(sql);
        List<Task> allTaskPro=new ArrayList<>();
        try{
            allTaskPro=TaskService.read(rs);
            int allTaskProNum=allTaskPro.size();
            return allTaskProNum;
        }catch (SQLException e){
            e.printStackTrace();
        }
        return 0;
    }
}
