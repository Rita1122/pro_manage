package vo;

public class Project {
    private int p_id;
    private String p_title;
    private String task;
    private String p_time;
    private int tnumber;
    private int tsum;
    private String desct;
    private int leader_id;
    private String s_t;
    private String e_t;




    public String getDesct() {
        return desct;
    }

    public void setDesct(String desct) {
        this.desct = desct;
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


    public int getLeader_id() {
        return leader_id;
    }

    public void setLeader_id(int leader_id) {
        this.leader_id = leader_id;
    }

    public int getP_id() {
        return p_id;
    }

    public void setP_id(int p_id) {
        this.p_id = p_id;
    }

    public String getP_title() {
        return p_title;
    }

    public void setP_title(String p_title) {
        this.p_title = p_title;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getP_time() {
        return p_time;
    }

    public void setP_time(String p_time) {
        this.p_time = p_time;
    }

    public int getTnumber() {
        return tnumber;
    }

    public void setTnumber(int tnumber) {
        this.tnumber = tnumber;
    }

    public int getTsum() {
        return tsum;
    }

    public void setTsum(int tsum) {
        this.tsum = tsum;
    }


}
