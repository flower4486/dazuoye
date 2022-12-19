package com.itheima.web;

import com.alibaba.fastjson.JSON;
import com.itheima.pojo.Weapon;
import com.itheima.service.CharacterService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.BufferedReader;
import java.io.IOException;

@WebServlet("/DeleCharactorById")
public class DeleCharactorById extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BufferedReader br = request.getReader();
        String params = br.readLine();
        int[] ints = JSON.parseObject(params, int[].class);
        CharacterService characterService = new CharacterService();
        for (int anInt : ints) {
            characterService.deleteCharactors(anInt);
        }
        response.getWriter().write("success");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
