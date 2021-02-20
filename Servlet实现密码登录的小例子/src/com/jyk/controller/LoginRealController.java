package com.jyk.controller;

import com.jyk.bean.User;
import com.jyk.service.serviceImpl.LoginServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginRealController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html");
        LoginServiceImpl impl = new LoginServiceImpl();
        String name = request.getParameter("name");
        String passwd = request.getParameter("password");
        User user = null;
        try {
            user = impl.login(name, passwd);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        if (user == null){
            response.getWriter().write("登录账号或密码错误");
        }else {
            response.getWriter().write("登录成功");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
