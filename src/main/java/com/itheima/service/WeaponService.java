package com.itheima.service;

import com.itheima.mapper.AccessoriesMapper;
import com.itheima.mapper.WeaponMapper;
import com.itheima.pojo.Weapon;
import com.itheima.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class WeaponService {
    public List<Weapon> selectAllWeapon(){
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();

        SqlSession sqlSession = sqlSessionFactory.openSession();

        WeaponMapper weaponMapper = sqlSession.getMapper(WeaponMapper.class);

        List<Weapon> weapons = weaponMapper.selectAllweapon();
        sqlSession.close();
    return weapons;
    }

    public void addWeapon(Weapon weapon){
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();

        SqlSession sqlSession = sqlSessionFactory.openSession();

        WeaponMapper weaponMapper = sqlSession.getMapper(WeaponMapper.class);

        weaponMapper.addWeapon(weapon);

        sqlSession.commit();

        sqlSession.close();
        return;
    }
    public List<Weapon> selectUserWeapon(int uId){
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();

        SqlSession sqlSession = sqlSessionFactory.openSession();

        WeaponMapper weaponMapper = sqlSession.getMapper(WeaponMapper.class);

        List<Weapon> weapons = weaponMapper.selectUersweapon(uId);
        sqlSession.close();
        return weapons;
    }
    //用户购买一个新武器
    public void userGetWeapon(int uId,int wId){
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();

        SqlSession sqlSession = sqlSessionFactory.openSession();

        WeaponMapper weaponMapper = sqlSession.getMapper(WeaponMapper.class);
        weaponMapper.userGetweapon(wId,uId);
        sqlSession.commit();
        sqlSession.close();

    }
}
