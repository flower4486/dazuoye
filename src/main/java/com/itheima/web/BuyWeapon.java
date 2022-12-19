package com.itheima.web;

import com.itheima.service.AccessoriesService;
import com.itheima.service.CharacterService;
import com.itheima.service.WeaponService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/BuyWeapon")
public class BuyWeapon extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uId = request.getParameter("uId");
        String wId = request.getParameter("wId");
        //System.out.println(uId);
        //System.out.p
        int uIdint = new Integer(uId);
        int wIdint = new Integer(wId);
        WeaponService weaponService = new WeaponService();
        weaponService.userGetWeapon(uIdint,wIdint);
        response.getWriter().write("success");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
