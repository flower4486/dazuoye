package com.itheima.service;

import com.itheima.mapper.AccessoriesMapper;
import com.itheima.mapper.CharactorMapper;
import com.itheima.pojo.Accessories;
import com.itheima.pojo.Weapon;
import com.itheima.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class AccessoriesService {
//    Servic方法调用我们写好的mapper中的接口中的函数，返回我们想要的结果，方便复用
    public List<Accessories> selectAllAccessories(){

        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();

        SqlSession sqlSession = sqlSessionFactory.openSession();

        AccessoriesMapper accessoriesMapper = sqlSession.getMapper(AccessoriesMapper.class);

        List<Accessories> accessories = accessoriesMapper.selectAllaccessories();

        sqlSession.close();

        return accessories;
    }
    //管理员增加一个新物品
    public void addAccessories(Accessories accessories) {
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();

        SqlSession sqlSession = sqlSessionFactory.openSession();

        AccessoriesMapper accessoriesMapper = sqlSession.getMapper(AccessoriesMapper.class);
        accessoriesMapper.addAccessories(accessories);
        sqlSession.commit();
        sqlSession.close();
        return;
    }
    //管理员删除一个饰品的信息
    public void deleteAccessories(int aId){
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();

        SqlSession sqlSession = sqlSessionFactory.openSession();

        AccessoriesMapper accessoriesMapper = sqlSession.getMapper(AccessoriesMapper.class);
        accessoriesMapper.deleteAccessoriesById(aId);
        sqlSession.commit();
        sqlSession.close();
        return;
    }
    //用户查询自己的饰品
    public List<Accessories> selectUsersAccessories(int uId){
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();

        SqlSession sqlSession = sqlSessionFactory.openSession();

        AccessoriesMapper accessoriesMapper = sqlSession.getMapper(AccessoriesMapper.class);

        List<Accessories> accessories = accessoriesMapper.selectUersaccessories(uId);

        sqlSession.close();

        return accessories;
    }
//用户购买一个新饰品
    public void userGetaccessories(int uId,int aId){
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();

        SqlSession sqlSession = sqlSessionFactory.openSession();

        AccessoriesMapper accessoriesMapper = sqlSession.getMapper(AccessoriesMapper.class);

        accessoriesMapper.userGetaccessories(aId,uId);
        sqlSession.commit();

        sqlSession.close();

    }

    }
