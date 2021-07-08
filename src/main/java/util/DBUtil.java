package util;

import java.sql.*;

public class DBUtil {
    private static String url = "";
    private static String username = "";
    private static String driver = "";
    private static String password = "";
    private static Connection con = null;

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static boolean openConnection(String url, String userName, String pwd) {
        try {
            if (con != null && con.isClosed()) {
                con.close();
            }
            con = DriverManager.getConnection(url, userName, pwd);
            return true;
        } catch (SQLException e) {
            con = null;
            return false;
        }
    }

    public static boolean closeConnection() {
        try {
            if (con != null && !con.isClosed()) {
                con.close();
                con = null;
            }
        } catch (SQLException e) {
            con = null;
        }
        return true;
    }

    public static ResultSet select(String sql) {
        if (con == null) {
            return null;
        }
        try {
            Statement st = con.createStatement();
            return st.executeQuery(sql);
        } catch (SQLException e) {
            return null;
        }
    }

    public static Integer update(String sql) {
        if (con == null) {
            return null;
        }
        try {
            Statement st = con.createStatement();
            return st.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }

    public static Connection getConnection() {
        try {
            //建立连接
            con = DriverManager.getConnection(url, username, password);

        } catch (Exception e) {
            System.out.println("数据库链接失败！");
            e.printStackTrace();
        }
        return con;
    }
}
