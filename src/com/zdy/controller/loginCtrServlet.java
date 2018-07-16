package com.zdy.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class loginCtrServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("utf-8");

        PrintWriter out = response.getWriter();
        //接收数据  用户名和密码
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        //测试接收到数据
        //System.out.println(username+" "+ password);

        //先简单验证
        if("zdy".equals(username) && "123".equals(password)){
            //跳转到下个页面servlet提供了两种 sendredirect 转向  forword 转发
            //sendredirect的url是这样的 /web应用名/servlet url
            response.sendRedirect("/UsrManager/MainFrame");

        } else {
            response.sendRedirect("/UsrManager/loginServlet");

        }


    }
}
