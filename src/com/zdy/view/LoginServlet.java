package com.zdy.view;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        this.doGet(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("utf-8");

        PrintWriter out = response.getWriter();

        //返回一个界面
        out.println("<h1>用户登陆</h1>");

        //如果不添加action的对象，也不会报错

        out.println("<form action ='/UsrManager/loginCtrServlet' method ='post'>");
        out.println("用户名：<input type='text' name='username'/></br>");
        out.println("密码：<input type='password' name='password'/></br>");
        out.println("<input type='submit' value='登陆'/></br>");

        out.println("</form>");


    }
}
