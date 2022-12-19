package com.itheima.mapper;

import com.itheima.pojo.Accessories;
import com.itheima.pojo.Charactor;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CharactorMapper {
    //查询角色表中所有角色
    List<Charactor>  selectAllcharactor();

    //查询某个用户所拥有的饰品信息
    List<Charactor> selectUerscharactor(int uId);

    //增加一个新角色

    void addCharactor(Charactor charactor);


    //作为管理员修改一个角色的基础信息

    void updateCharactor(Charactor charactor);

    //作为管理员，删除某个角色

    void deleteCharactorById(int cId);

    //用户获得一个新角色

    void userGetcharactor(@Param("cId") int cId,@Param("uId") int uId);
}
