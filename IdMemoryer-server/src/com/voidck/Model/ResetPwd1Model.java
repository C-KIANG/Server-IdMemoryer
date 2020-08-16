package com.voidck.Model;


import com.voidck.Entity.User;

import java.sql.*;

public class ResetPwd1Model {

    //JDBC连接模板
    private static String driverName="com.mysql.cj.jdbc.Driver";
    private static String userName="root";
    private static String userPwd="zcq123456";
    private static String dbName="IdMemoryer";
    private static String url1="jdbc:mysql://localhost:3306/"+dbName;
    private static String url2="?user="+userName+"&password="+userPwd;
    private static String url3="&useUnicode=true&characterEncoding=UTF-8";
    private static String url=url1+url2+url3;



    public static User forget1(User user){
        String registerAccount = user.getLoginAccount();   //从user取得数据
        Double registerPhone = user.getPhone();
        Connection con = null;  //定义连接对象
        PreparedStatement pstmt = null;     //定义PreparedStatement对象
        ResultSet rs = null;        //定义一个结果集
        User rs_user = new User();
//        int count = 0;
        try{
            Class.forName(driverName);       //加载并注册驱动程序
            con= DriverManager.getConnection(url);      //创建连接对象
            pstmt = con.prepareStatement("select * from userlist where account=? and phone=?");    //使用PreparedStatement对象执行SQL语句  count(*)聚集函数:统计元组个数
            pstmt.setString(1,registerAccount);    //设置第一个参数值
            pstmt.setDouble(2,registerPhone);   //设置第二个参数值
            rs = pstmt.executeQuery();      //获得select查询返回的结果集
            if (rs.next()){     //next()移动指针到下一行,第一调用移动到第一行
//                count = rs.getInt(1);       //返回int类型字段1的字段值

                rs_user.setLoginAccount(rs.getString(1));
             //   rs_user.setLoginPassword(rs.getString(2));
                rs_user.setPhone(rs.getDouble(3));
                rs_user.setLoginResult(true);
            }
            else {
                rs_user.setLoginAccount(registerAccount);
                rs_user.setPhone(registerPhone);
                rs_user.setLoginResult(false);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try{
                //释放资源 反序释放
                if (rs!=null){
                    rs.close();     //关闭查询结果集对象
                }
                if (pstmt!=null){
                    pstmt.close();  //关闭操作对象
                }
                if (con!=null){
                    con.close();    //关闭数据库连接对象
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
//            if (count==1){      //如果查询到元组返回true
//                return true;
//            }else{
//                return false;
//            }
        }
        return rs_user;
    }


}