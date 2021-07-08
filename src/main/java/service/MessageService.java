package service;

import util.DBUtil;
import vo.Message;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MessageService {
    public MessageService(){}
    public void addMes(int id1,int id2,int type,String m_info,String name1,String name2,int id3,int m_status){
        String sql="INSERT INTO message(send_id,receive_id,type,m_info,m_time,in_name,bein_name,team_id,m_status) VALUES("+id1+","+id2+","+type+",'"+m_info+"',now(),'"+name1+"','"+name2+"',"+id3+","+m_status+")";
        DBUtil.update(sql);
    }
    public Message rs2m(ResultSet rs){
        Message m=new Message();
        try {
            int m_id=rs.getInt("m_id");
            int send_id=rs.getInt("send_id");
            int receive_id=rs.getInt("receive_id");
            int team_id=rs.getInt("team_id");
            int type=rs.getInt("type");
            int m_status=rs.getInt("m_status");
            String in_name=rs.getString("in_name");
            String bein_name=rs.getString("bein_name");
            String m_info=rs.getString("m_info");
            String m_time=rs.getString("m_time");
            m.setTeam_id(team_id);
            m.setM_time(m_time);
            m.setM_info(m_info);
            m.setReceive_id(receive_id);
            m.setType(type);
            m.setSend_id(send_id);
            m.setM_id(m_id);
            m.setIn_name(in_name);
            m.setBein_name(bein_name);
            m.setM_status(m_status);
        }catch (SQLException e){
            return null;
        }
        return m;
    }
    public List<Message> messages(int id){
        String sql="SELECT * FROM message WHERE receive_id="+id+"";
        ResultSet rs=DBUtil.select(sql);
        List<Message> messages=new ArrayList<>();
        try{
            while (rs.next()) {
                Message m=rs2m(rs);
                messages.add(m);
            }
        }catch (SQLException e){
            return null;
        }
        return messages;
    }
    public List<Message> noCheck(int user_id,int m_status){
        String sql="SELECT * FROM message WHERE receive_id="+user_id+" AND m_status="+m_status+"";
        ResultSet rs=DBUtil.select(sql);
        List<Message> messages=new ArrayList<>();
        try{
            while (rs.next()) {
                Message m=rs2m(rs);
                messages.add(m);
            }
        }catch (SQLException e){
            return null;
        }
        return messages;

    }
    public void modifyM(int m_id,int m_status){
        String sql="update message set m_status="+m_status+" where m_id="+m_id+"";
        DBUtil.update(sql);
    }
}
