package com.itheima.web;

import com.alibaba.fastjson.JSON;
import com.itheima.service.CharacterService;
import com.itheima.service.UserServise;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

@WebServlet("/DeleUserById")
public class DeleUserById extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BufferedReader br = request.getReader();
        String params = br.readLine();
        int[] ints = JSON.parseObject(params, int[].class);
        UserServise userServise = new UserServise();
        for (int anInt : ints) {
           userServise.deleteUserById(anInt);
        }
        response.getWriter().write("success");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
