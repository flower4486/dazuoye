package com.itheima.mapper;

import com.itheima.pojo.Accessories;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AccessoriesMapper {

//    查询所有饰品的信息
    List<Accessories> selectAllaccessories();

    //查询某个用户所拥有的饰品信息
    List<Accessories> selectUersaccessories(int uId);

//    向饰品基本表中增加一个饰品

   void addAccessories(Accessories accessories);

   //作为管理员修改某个饰品的某个信息
    int updateAccessories(Accessories accessories);

    //作为管理员，删除某个饰品
    void deleteAccessoriesById(int aId);

    //用户获得一个新饰品
    void userGetaccessories(@Param("aId") int aId, @Param("uId") int uId);
}
