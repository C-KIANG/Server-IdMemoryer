/*
 * @Author: your name
 * @Date: 2019-11-20 00:13:21
 * @LastEditTime: 2019-11-20 09:20:50
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \WebDemo\src\com\voidck\Servlet\RegisterServlet.java
 */
package com.voidck.Servlet;

import com.voidck.Entity.User;
import com.voidck.Model.RegisterModel;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "RegisterServlet")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String registerAccount = request.getParameter("registerAccount");
        String registerPassword = request.getParameter("registerPassword");
        String registerPhone = request.getParameter("registerPhone");
        Double phone = Double.parseDouble(registerPhone);
        User user = new User();
        user.setLoginAccount(registerAccount);
        user.setLoginPassword(registerPassword);
        user.setPhone(phone);
        boolean rs = RegisterModel.register(user);
        System.out.println("注册账号:"+registerAccount+",注册密码:"+registerPassword+",手机号:"+registerPhone+",注册结果:"+rs);
        
        response.setCharacterEncoding("UTF-8");     //设置response对象的字符编码方式

        PrintWriter writer = response.getWriter();
        writer.print(rs);
    }
}
