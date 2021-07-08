package vo;

public class Task {
    private int t_id;
    private String t_title;
    private String desct;
    private int p_id;
    private String s_t;
    private String e_t;
    private int user_id;
    private int t_status;
    private int leader_id;

    public int getLeader_id() {
        return leader_id;
    }

    public void setLeader_id(int leader_id) {
        this.leader_id = leader_id;
    }

    public int getT_id() {
        return t_id;
    }

    public void setT_id(int t_id) {
        this.t_id = t_id;
    }

    public String getT_title() {
        return t_title;
    }

    public void setT_title(String t_title) {
        this.t_title = t_title;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getDesct() {
        return desct;
    }

    public void setDesct(String desct) {
        this.desct = desct;
    }

    public int getP_id() {
        return p_id;
    }

    public void setP_id(int p_id) {
        this.p_id = p_id;
    }

    public String getS_t() {
        return s_t;
    }

    public void setS_t(String s_t) {
        this.s_t = s_t;
    }

    public String getE_t() {
        return e_t;
    }

    public void setE_t(String e_t) {
        this.e_t = e_t;
    }

    public int getT_status() {
        return t_status;
    }

    public void setT_status(int t_status) {
        this.t_status = t_status;
    }



}
