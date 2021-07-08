package service;

import org.apache.commons.codec.binary.Base64;
import org.mindrot.jbcrypt.BCrypt;
import util.DBUtil;
import vo.Team;
import vo.User;

import java.security.MessageDigest;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserService extends BaseService{
    public void addUsers(String name,String password,String email,String phone,int team_id,String i_status){
        String sql = "INSERT INTO user(name,password,email,phone,team_id,i_status)VALUES('" + name + "','" + password + "','" + email + "','" + phone +"',"+team_id+",'"+i_status+"')";
        DBUtil.update(sql);
    }
    public User login(String name, String password){
        String sql="SELECT * FROM user WHERE name='"+name.trim()+"' AND password='"+password.trim()+"';";
        ResultSet rs= DBUtil.select(sql);
        User u=new User();
        try {
            while(rs.next()){
               u=rs2(rs);
               return u;
            }
        }
        catch (SQLException e) {
            return null;
        }
        return null;
    }
    public boolean userExist(String name){
        String sql="SELECT * FROM user WHERE name='"+name.trim()+"';";
        ResultSet rs=DBUtil.select(sql);
        try {
            if(rs.next()){
                return false;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return true;
    }
    public static User rs2(ResultSet rs){
        User u=new User();
        try{
            int id=rs.getInt("user_id");
            String name1=rs.getString("name");
            String email=rs.getString("email");
            String phone=rs.getString("phone");
            String password=rs.getString("password");
            String i_status=rs.getString("i_status");
            int team_id=rs.getInt("team_id");
            u.setPassword("");
            u.setUser_id(id);
            u.setName(name1);
            u.setPassword(password);
            u.setEmail(email);
            u.setPhone(phone);
            u.setTeam_id(team_id);
            u.setI_status(i_status);
            return u;
        }catch (Exception e){
            return null;
        }
    }
    public Integer addTeams(String name,int p_id,int user_id){
        String sql="INSERT INTO team(team_name,p_id,user_id)VALUES('"+name+"',"+p_id+","+user_id+")";
        int i=DBUtil.update(sql);
        return i;
    }
    public List<User> allUsers(){
        String sql="select * from user WHERE i_status !='管理员'";
        ResultSet rs=DBUtil.select(sql);
        List<User> users=new ArrayList<>();
        try {
            while (rs.next()){
                User u=rs2(rs);
                users.add(u);
            }
        }catch (SQLException e){
            return null;
        }
        return users;
    }
    public List<User> t_users(String name,int id){
        String sql="SELECT * FROM user WHERE "+name+"="+id+"";
        ResultSet rs=DBUtil.select(sql);
        List<User> users=new ArrayList<>();
        try{
            while (rs.next()){
                User u=rs2(rs);
                users.add(u);
            }
        }catch (SQLException E){
            return null;
        }
        return users;
    }
    public User user(String name,int id){
        String sql="SELECT * FROM user WHERE "+name+" = "+id+"";
        ResultSet rs=DBUtil.select(sql);
        User u;
        try{
            while (rs.next()){
                u=rs2(rs);
                return u;
            }
        }catch (SQLException E){
            return null;
        }
        return null;
    }
    public Team team(String name, String id, int ty){
        String sql="";
        if(ty==1) sql="SELECT * FROM team WHERE "+name+"="+id+"";
        else sql="SELECT * FROM team WHERE "+name+"='"+id+"'";
        ResultSet rs=DBUtil.select(sql);
        Team t=new Team();
        try{
            while (rs.next()){
                int team_id=rs.getInt("team_id");
                String team_name=rs.getString("team_name");
                int p_id=rs.getInt("p_id");
                int user_id=rs.getInt("user_id");
                t.setTeam_id(team_id);
                t.setTeam_name(team_name);
                t.setP_id(p_id);
                t.setUser_id(user_id);
            }
        }catch (SQLException E){
            return null;
        }
        return t;
    }
    public void modify(String key,String status,String id,int ty){
        String sql="";
        if(ty==1)  sql="UPDATE user SET "+key+"='"+status+"' WHERE user_id="+id+"";
        else sql="UPDATE user SET "+key+"="+status+" WHERE user_id="+id+"";
        DBUtil.update(sql);
    }
    public void modifyU(int user_id,String password,String email,String phone){
        String sql="update user set password='"+password+"',email='"+email+"',phone='"+phone+"'where user_id="+user_id+" ";
        DBUtil.update(sql);
    }
    public void leaderDel(int user_id){
        String sql="update user LEFT JOIN task ON user.user_id=task.user_id set i_status='可邀请' ,team_id=0 , t_status=0 where user.user_id="+user_id+"";
        DBUtil.update(sql);
    }

    /**
     * 密码加密处理（MD5）
     * @param src 原密码
     * @return 加密后的内容
     */
    public String md5(String src){
        try{//采用MD5处理
            MessageDigest md =
                    MessageDigest.getInstance("MD5");
            byte[] output = md.digest(
                    src.getBytes());
            //加密处理
            //将加密结果output利用Base64转成字符串输出
            String ret = Base64.encodeBase64String(output);
            return ret;
        }catch(Exception e){
            return "";
        }
    }
    public   Boolean  check(String xieru,String re){
        if(xieru.equals(re)){
            return true;
        }
        return false;
    }

    public int SearchLeadr(int team_id){
        int leader_id=0;
        String sql = "select user_id from team where team_id =  "+team_id;
        ResultSet rs=DBUtil.select(sql);
        try {
            if(rs.next()){
                leader_id = rs.getInt("user_id");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return leader_id;
    }
}

