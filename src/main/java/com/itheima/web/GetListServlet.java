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

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/GetListServlet")
public class GetListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    //request.getParameter("sel");
        //System.out.println(request.getParameter("type"));
        //System.out.println(request.getParameter("type").equals("weapons"));
        String type = request.getParameter("type");
        String resultjson="";
        if (type.equals("weapons")){
            WeaponService weaponService = new WeaponService();
            List<Weapon> weapons = weaponService.selectAllWeapon();
            resultjson = JSON.toJSONString(weapons);
        }else if(type.equals("charactors")){
            CharacterService characterService = new CharacterService();
            List<Charactor> charactors = characterService.selectAllcharactor();
            resultjson = JSON.toJSONString(charactors);
        }else if (type.equals("accessories")){
            AccessoriesService accessoriesService = new AccessoriesService();
            List<Accessories> accessories = accessoriesService.selectAllAccessories();
            resultjson = JSON.toJSONString(accessories);
        }else if (type.equals("users")){
            UserServise userServise = new UserServise();
            List<User> users = userServise.selectAlluser();
            resultjson  = JSON.toJSONString(users);
        }
        response.setContentType("text/json;charset=utf-8");
        response.getWriter().write(resultjson);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
