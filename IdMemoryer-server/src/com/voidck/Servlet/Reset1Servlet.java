package com.voidck.Servlet;

import com.voidck.Entity.User;
import com.voidck.Model.ResetPwd1Model;
import com.voidck.Util.JSONToUser;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Reset1Servlet")
public class Reset1Servlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");        //设置request对象的字符编码方式
        String registerAccount = request.getParameter("registerAccount");     //获得请求属性
        String registerPhone = request.getParameter("registerPhone");
        Double Phone = Double.parseDouble(registerPhone);
        User user = new User();//设置一个User实体类
        user.setLoginAccount(registerAccount);
        user.setPhone(Phone);
//        boolean result = LoginModel.login(user);        //在LoginModel方法里进行JDBC连接及数据库操作
//        System.out.println("登录账号："+loginAccount+",登陆密码："+loginPassword+",登录结果"+result);
//        response.setCharacterEncoding("UTF-8");     //设置response对象的字符编码方式



        //通过PrintWriter返回给客户端操作结果,输出流
        PrintWriter writer = response.getWriter();
        //设置返回数据格式和编码
        response.setContentType("application/json;charset=utf-8");

        User rs_user = new User();
        rs_user = ResetPwd1Model.forget1(user);



        String responseMessage = null;

        if (rs_user!=null){
            responseMessage = new JSONToUser().ObjectToGson(rs_user);
            System.out.println("验证账号："+registerAccount+",验证手机号："+registerPhone+",验证结果:"+rs_user.getLoginResult());
        }

        System.out.println("对象转为json " + responseMessage);

        writer.print(responseMessage);


    }
}
