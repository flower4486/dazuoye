package com.itheima.web;

import com.alibaba.fastjson.JSON;
import com.itheima.pojo.Accessories;
import com.itheima.pojo.Charactor;
import com.itheima.pojo.Weapon;
import com.itheima.service.AccessoriesService;
import com.itheima.service.CharacterService;
import com.itheima.service.UserServise;
import com.itheima.service.WeaponService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/IfLogin")
public class IfLogin extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
       // System.out.println(username);
        //System.out.println(password);
        String resultjson="";
        UserServise userServise = new UserServise();
        Integer integer = userServise.IfLogin(username, password);
        //System.out.println(integer);
        if (integer == null){
           response.getWriter().write("failed");
        }else {
            String s = JSON.toJSONString(integer);
            response.setContentType("text/json;charset=utf-8");
            response.getWriter().write(s);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
