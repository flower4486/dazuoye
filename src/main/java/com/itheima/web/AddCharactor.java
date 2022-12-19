package com.itheima.web;

import com.alibaba.fastjson.JSON;
import com.itheima.pojo.Accessories;
import com.itheima.pojo.Charactor;
import com.itheima.service.AccessoriesService;
import com.itheima.service.CharacterService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.BufferedReader;
import java.io.IOException;

@WebServlet("/AddCharactor")
public class AddCharactor extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BufferedReader br = request.getReader();
        String params = br.readLine();
        Charactor charactor = JSON.parseObject(params, Charactor.class);

        CharacterService characterService = new CharacterService();

        characterService.addCharactor(charactor);
        response.getWriter().write("success");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
