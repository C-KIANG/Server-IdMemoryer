package com.voidck.Model;

import com.voidck.Entity.User;

import java.sql.*;

@SuppressWarnings("AlibabaAvoidReturnInFinally")
public class RegisterModel {

    private static String driverName="com.mysql.cj.jdbc.Driver";
    private static String userName="root";
    private static String userPwd="zcq123456";
    private static String dbName="IdMemoryer";
    private static String url1="jdbc:mysql://localhost:3306/"+dbName;
    private static String url2="?user="+userName+"&password="+userPwd;
    private static String url3="&useUnicode=true&characterEncoding=UTF-8";
    private static String url=url1+url2+url3;


    @SuppressWarnings("AlibabaAvoidReturnInFinally")
    public static boolean register(User user){
        String registerAccount = user.getLoginAccount();
        String registerPassword = user.getLoginPassword();
        Double registerPhone = user.getPhone();
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        int count = 0;
        try{
            //加载并注册驱动程序
            Class.forName(driverName);
            //创建连接对象
            con= DriverManager.getConnection(url);
            pstmt = con.prepareStatement("insert into userlist values (?,?,?)");
            pstmt.setString(1,registerAccount);
            pstmt.setString(2,registerPassword);
            pstmt.setDouble(3,registerPhone);
            count = pstmt.executeUpdate();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try{
                if (rs!=null){
                    rs.close();
                }
                if (pstmt!=null){
                    pstmt.close();
                }
                if (con!=null){
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
        if (count==1){
            //noinspection AlibabaAvoidReturnInFinally
            return true;
        }else{
            //noinspection AlibabaAvoidReturnInFinally
            return false;
        }
    }
}
