package service;

import util.DBUtil;

public class BaseService {
    public BaseService(){
    String url = "jdbc:mysql://localhost:3306/jsp-project?useSSL=true";
    String userName = "root";
    String pwd = "123456";
    DBUtil.openConnection(url, userName, pwd);}
}
