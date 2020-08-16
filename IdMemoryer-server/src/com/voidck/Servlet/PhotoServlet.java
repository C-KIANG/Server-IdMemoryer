package com.voidck.Servlet;

import com.voidck.Entity.Photo;
import com.voidck.Model.PhotoModel;
import com.voidck.Util.JSONToUser;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Pierce
 */
@WebServlet(name = "PhotoServlet")
public class PhotoServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置request对象的字符编码方式
        request.setCharacterEncoding("UTF-8");
        String id = request.getParameter("id");
        Photo photo = new Photo();
        photo = PhotoModel.getPhotoRs(id);


        //设置返回数据格式和编码,编码要写在定义前面,否则无效
        response.setContentType("text/json;charset=UTF-8");
        //设置response对象的字符编码方式
        response.setCharacterEncoding("UTF-8");


        //通过PrintWriter返回给客户端操作结果,输出流
        PrintWriter writer = response.getWriter();


        String responseMessage = null;

        if (photo!=null){
            responseMessage = new JSONToUser().ObjectToGson(photo);
            System.out.println("id："+photo.getId().toString()+",学生:"+photo.getName()+",url:"+photo.getUrl());
        }

        System.out.println("对象转为json " + responseMessage);

        writer.print(responseMessage);


    }
}
