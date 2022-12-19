package com.itheima.mapper;


import com.itheima.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
//    查询所有用户
    public List<User> selectAlluser();
//    增加一个新用户
    void addUser(User user);

    //修改某个用户的基本信息
    void updateUser(User user);
    //管理员删除某个用户
    void deleteUserById(int uId);
    //登录是否成功，返回ID
    Integer IfLogin(@Param("username")String username,@Param("password") String password);
}
