package com.itheima.mapper;

import com.itheima.pojo.Weapon;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WeaponMapper {
    List<Weapon> selectAllweapon();

    //查询某个用户所拥有的武器
    List<Weapon> selectUersweapon(int uId);

//在武器表中增加一个新武器
   void addWeapon(Weapon weapon);


   //以管理员身份修改武器的基本信息

    void updateWeapon(Weapon weapon);

    //管理员删除某个武器
    void deleteWeaponById(int wId);

    //用户获得新武器

    void userGetweapon(@Param("wId") int wId, @Param("uId") int uId);
}
