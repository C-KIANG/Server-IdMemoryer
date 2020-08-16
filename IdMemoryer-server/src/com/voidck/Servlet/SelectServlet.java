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

@WebServlet(name = "SelectServlet")
public class SelectServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置request对象的字符编码方式
        request.setCharacterEncoding("UTF-8");
        String name = request.getParameter("name");
        Photo photo = new Photo();
        photo = PhotoModel.getSelectRs(name);

        //设置返回数据格式和编码,编码要写在定义前面,否则无效
        response.setContentType("text/json;charset=UTF-8");
        //设置response对象的字符编码方式
        response.setCharacterEncoding("UTF-8");


        //通过PrintWriter返回给客户端操作结果,输出流
        PrintWriter writer = response.getWriter();


        String responseMessage = null;


        if (photo!=null){
            responseMessage = new JSONToUser().ObjectToGson(photo);
            if (photo.getSelectResult()){
                System.out.println("id："+photo.getId().toString()+",学生:"+photo.getName()+",url:"+photo.getUrl()+",查询结果:"+photo.getSelectResult());
            }else {
                System.out.println("学生:"+photo.getName()+",查询结果:"+photo.getSelectResult());
            }

        }

        System.out.println("对象转为json " + responseMessage);

        writer.print(responseMessage);


    }
}
