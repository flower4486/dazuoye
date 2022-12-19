package com.itheima.web;

import com.itheima.service.AccessoriesService;
import com.itheima.service.CharacterService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/BuyCharactor")
public class BuyCharactor extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uId = request.getParameter("uId");
        String cId = request.getParameter("cId");
        System.out.println(uId);
        System.out.println(cId);
        int uIdint = new Integer(uId);
        int cIdint = new Integer(cId);
        CharacterService characterService = new CharacterService();
        characterService.userGetaccessories(uIdint,cIdint);
        response.getWriter().write("success");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
