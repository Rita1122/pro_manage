package vo;

public class Message {
    private int m_id;
    private int send_id;
    private int receive_id;
    private String in_name;
    private String bein_name;
    private int type;
    private String m_info;
    private String m_time;
    private int team_id;
    private int m_status;

    public int getM_status() {
        return m_status;
    }

    public void setM_status(int m_status) {
        this.m_status = m_status;
    }

    public int getTeam_id() {
        return team_id;
    }

    public void setTeam_id(int team_id) {
        this.team_id = team_id;
    }

    public String getIn_name() {
        return in_name;
    }

    public void setIn_name(String in_name) {
        this.in_name = in_name;
    }

    public String getBein_name() {
        return bein_name;
    }

    public void setBein_name(String bein_name) {
        this.bein_name = bein_name;
    }



    public String getM_time() {
        return m_time;
    }

    public void setM_time(String m_time) {
        this.m_time = m_time;
    }

    public int getM_id() {
        return m_id;
    }

    public void setM_id(int m_id) {
        this.m_id = m_id;
    }

    public int getSend_id() {
        return send_id;
    }

    public void setSend_id(int send_id) {
        this.send_id = send_id;
    }

    public int getReceive_id() {
        return receive_id;
    }

    public void setReceive_id(int receive_id) {
        this.receive_id = receive_id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getM_info() {
        return m_info;
    }

    public void setM_info(String m_info) {
        this.m_info = m_info;
    }



}
