package com.itheima.web;

import com.alibaba.fastjson.JSON;
import com.itheima.pojo.Weapon;
import com.itheima.service.WeaponService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.BufferedReader;
import java.io.IOException;

@WebServlet("/addWeapon")
public class addWeaponServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BufferedReader br = request.getReader();
        String params = br.readLine();
        Weapon weapon = JSON.parseObject(params, Weapon.class);
        WeaponService weaponService = new WeaponService();
        weaponService.addWeapon(weapon);
        response.getWriter().write("success");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
