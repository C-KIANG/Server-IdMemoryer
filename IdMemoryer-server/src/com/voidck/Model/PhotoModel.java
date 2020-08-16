package com.voidck.Model;

import com.voidck.Entity.Photo;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhotoModel {

    //JDBC连接模板
    private static String driverName="com.mysql.cj.jdbc.Driver";
    private static String userName="root";
    private static String userPwd="zcq123456";
    private static String dbName="IdMemoryer";
    private static String url1="jdbc:mysql://localhost:3306/"+dbName;
    private static String url2="?user="+userName+"&password="+userPwd;
    private static String url3="&useUnicode=true&characterEncoding=UTF-8";
    private static String url=url1+url2+url3;

    public static Photo getPhotoRs(String id){
        Connection con = null;
        PreparedStatement pstmt = null;     //定义PreparedStatement对象
        ResultSet rs = null;        //定义一个结果集
        Photo photo= new Photo();
        try {
            Class.forName(driverName);     //加载并注册驱动程序
            con= DriverManager.getConnection(url);      //创建连接对象
            pstmt = con.prepareStatement("SELECT * FROM photolist WHERE id=?");
            pstmt.setString(1,id);    //设置第一个参数值
            rs = pstmt.executeQuery();
            if (rs.next()){
                photo.setId(rs.getInt(1));
                photo.setName(rs.getString(2));
                photo.setUrl(rs.getString(3));
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
        }
        return photo;
    }

    public static Photo getSelectRs(String name){
        Connection con = null;
        PreparedStatement pstmt = null;     //定义PreparedStatement对象
        ResultSet rs = null;        //定义一个结果集
        Photo photo= new Photo();
        try {
            Class.forName(driverName);     //加载并注册驱动程序
            con= DriverManager.getConnection(url);      //创建连接对象
            pstmt = con.prepareStatement("SELECT * FROM photolist WHERE NAME =?");
            pstmt.setString(1,name);    //设置第一个参数值
            rs = pstmt.executeQuery();
            if (rs.next()){
                photo.setId(rs.getInt(1));
                photo.setName(rs.getString(2));
                photo.setUrl(rs.getString(3));
                photo.setSelectResult(true);
            }
            else {
                photo.setName(name);
                photo.setSelectResult(false);
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
        }
        return photo;
    }

    public static  ArrayList<Map<String, Object>> getAllPhotoRs(){
        Connection con = null;
        PreparedStatement pstmt = null;     //定义PreparedStatement对象
        ResultSet rs = null;        //定义一个结果集
        ArrayList<Map<String, Object>> list = new ArrayList<Map<String,Object>>();
        try {
            Class.forName(driverName);     //加载并注册驱动程序
            con= DriverManager.getConnection(url);      //创建连接对象
            pstmt = con.prepareStatement("SELECT * FROM photolist");
            rs = pstmt.executeQuery();
            ResultSetMetaData md = rs.getMetaData(); //获得结果集结构信息,元数据
            int columnCount = md.getColumnCount();   //获得列数
            while (rs.next()){
                Map<String,Object> rowData = new HashMap<String,Object>();
                for (int i = 1; i <= columnCount; i++) {
                    rowData.put(md.getColumnName(i), rs.getObject(i));
                }
                list.add(rowData);

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
        }
        return list;
    }

    public static Photo addRs(Photo photo){
        Connection con = null;
        PreparedStatement pstmt = null;     //定义PreparedStatement对象
        ResultSet rs = null;        //定义一个结果集
        int count = 0;
        try {
            Class.forName(driverName);     //加载并注册驱动程序
            con= DriverManager.getConnection(url);      //创建连接对象
            pstmt = con.prepareStatement("INSERT INTO photolist(name,url) VALUES (?,?)");
            pstmt.setString(1,photo.getName());    //设置第一个参数值
            pstmt.setString(2,photo.getUrl());    //设置第一个参数值

            count = pstmt.executeUpdate();
            if (count == 1){
                photo.setSelectResult(true);
            }
            else {
                photo.setSelectResult(false);
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
        }
        return photo;
    }

    public static Photo updateRs(Photo photo){
        Connection con = null;
        PreparedStatement pstmt = null;     //定义PreparedStatement对象
        ResultSet rs = null;        //定义一个结果集
        int count = 0;
        try {
            Class.forName(driverName);     //加载并注册驱动程序
            con= DriverManager.getConnection(url);      //创建连接对象
            pstmt = con.prepareStatement("UPDATE photolist SET name=?,url=? WHERE id=?");
            pstmt.setString(1,photo.getName());    //设置第一个参数值
            pstmt.setString(2,photo.getUrl());
            pstmt.setInt(3,photo.getId());

            count = pstmt.executeUpdate();
            if (count == 1){
                photo.setSelectResult(true);
            }
            else {
                photo.setSelectResult(false);
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
        }
        return photo;
    }

    public static Photo deleteRs(Photo photo){
        Connection con = null;
        PreparedStatement pstmt = null;     //定义PreparedStatement对象
        ResultSet rs = null;        //定义一个结果集
        int count = 0;
        try {
            Class.forName(driverName);     //加载并注册驱动程序
            con= DriverManager.getConnection(url);      //创建连接对象
            pstmt = con.prepareStatement("DELETE FROM photolist WHERE id=?");
            pstmt.setInt(1,photo.getId());

            count = pstmt.executeUpdate();
            if (count == 1){
                photo.setSelectResult(true);
            }
            else {
                photo.setSelectResult(false);
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
        }
        return photo;
    }

}
