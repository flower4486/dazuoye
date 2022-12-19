package com.itheima.web;

import com.alibaba.fastjson.JSON;
import com.itheima.pojo.Accessories;
import com.itheima.pojo.Charactor;
import com.itheima.pojo.User;
import com.itheima.pojo.Weapon;
import com.itheima.service.AccessoriesService;
import com.itheima.service.CharacterService;
import com.itheima.service.UserServise;
import com.itheima.service.WeaponService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/GetUsersList")
public class GetUsersList extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uId = request.getParameter("uId");
        String type = request.getParameter("type");
       // System.out.println(uId.getClass());
        int integer = new Integer(uId);

        System.out.println(integer);
        String resultjson="";
        if (type.equals("weapons")){
            WeaponService weaponService = new WeaponService();
            List<Weapon> weapons = weaponService.selectUserWeapon(integer);
            resultjson = JSON.toJSONString(weapons);
        }else if(type.equals("charactors")){
            CharacterService characterService = new CharacterService();
            List<Charactor> charactors = characterService.selectUSerscharactor(integer);
            resultjson = JSON.toJSONString(charactors);
        }else if (type.equals("accessories")){
            AccessoriesService accessoriesService = new AccessoriesService();
            List<Accessories> accessories = accessoriesService.selectUsersAccessories(integer);
            resultjson = JSON.toJSONString(accessories);
           // System.out.println(resultjson);
        }
        response.setContentType("text/json;charset=utf-8");
        response.getWriter().write(resultjson);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
