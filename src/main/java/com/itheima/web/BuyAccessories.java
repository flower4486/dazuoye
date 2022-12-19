package com.itheima.web;

import com.alibaba.fastjson.JSON;
import com.itheima.pojo.Accessories;
import com.itheima.pojo.Charactor;
import com.itheima.pojo.Weapon;
import com.itheima.service.AccessoriesService;
import com.itheima.service.CharacterService;
import com.itheima.service.WeaponService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/BuyAccessories")
public class BuyAccessories extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uId = request.getParameter("uId");
        String aId = request.getParameter("aId");
        //System.out.println(uId);
        //System.out.p
        int uIdint = new Integer(uId);
        int aIdint = new Integer(aId);
        AccessoriesService accessoriesService = new AccessoriesService();
        accessoriesService.userGetaccessories(uIdint,aIdint);
        response.getWriter().write("success");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
