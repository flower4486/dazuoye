package com.itheima.web;

import com.alibaba.fastjson.JSON;
import com.itheima.pojo.Charactor;
import com.itheima.pojo.User;
import com.itheima.service.CharacterService;
import com.itheima.service.UserServise;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

@WebServlet("/AddUser")
public class AddUser extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user1 = request.getParameter("user");
        String s = new String(user1.getBytes("ISO-8859-1"), "utf-8");
        User user = JSON.parseObject(s, User.class);
        //System.out.println(user.getGender());
        UserServise userServise = new UserServise();
        userServise.addUser(user);
        response.getWriter().write("success");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
