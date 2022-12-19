package com.itheima.service;


import com.itheima.mapper.CharactorMapper;
import com.itheima.mapper.UserMapper;
import com.itheima.pojo.Accessories;
import com.itheima.pojo.Charactor;
import com.itheima.pojo.User;
import com.itheima.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class UserServise {
    public List<User> selectAlluser(){
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = userMapper.selectAlluser();
        sqlSession.close();
        return users;
    }
    //增加一个用户的函数
    public void addUser(User user) {
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();

        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.addUser(user);
        sqlSession.commit();
        sqlSession.close();
        return;
    }

    //删除一个用户的函数
    public void deleteUserById(int uId){
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();

        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
       userMapper.deleteUserById(uId);
        sqlSession.commit();
        sqlSession.close();
        return;
    }
    public Integer IfLogin(String username,String password){
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();

        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        Integer ifLogin = userMapper.IfLogin(username, password);
        sqlSession.close();
        return ifLogin;
    }
}
