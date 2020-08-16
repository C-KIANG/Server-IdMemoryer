package com.voidck.Servlet;

import com.voidck.Entity.User;
import com.voidck.Model.LoginModel;
import com.voidck.Util.JSONToUser;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //doPost方法一般调用doGet方法
        doGet(request,response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");        //设置request对象的字符编码方式
        String loginAccount = request.getParameter("loginAccount");     //获得请求属性
        String loginPassword = request.getParameter("loginPassword");
        User user = new User(loginAccount,loginPassword);       //设置一个User实体类


        //通过PrintWriter返回给客户端操作结果,输出流
        PrintWriter writer = response.getWriter();
        //设置返回数据格式和编码
        response.setContentType("application/json;charset=utf-8");

        User rs_user = new User();
        rs_user = LoginModel.login(user);



        String responseMessage = null;

        if (rs_user!=null){
            responseMessage = new JSONToUser().ObjectToGson(rs_user);
            System.out.println("登录账号："+loginAccount+",登陆密码："+loginPassword+",登录结果:"+rs_user.getLoginResult());
        }

        System.out.println("对象转为json " + responseMessage);

        writer.print(responseMessage);
    }
}

