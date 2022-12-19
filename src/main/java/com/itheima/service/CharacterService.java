package com.itheima.service;

import com.itheima.mapper.AccessoriesMapper;
import com.itheima.mapper.CharactorMapper;
import com.itheima.mapper.UserMapper;
import com.itheima.pojo.Charactor;
import com.itheima.pojo.User;
import com.itheima.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class CharacterService {
    //查看所有角色
    public List<Charactor> selectAllcharactor(){
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        CharactorMapper charactorMapper = sqlSession.getMapper(CharactorMapper.class);
        List<Charactor> charactors = charactorMapper.selectAllcharactor();
        sqlSession.close();
        return charactors;
    }

    public void addCharactor(Charactor charactor){
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();

        SqlSession sqlSession = sqlSessionFactory.openSession();

        CharactorMapper charactorMapper = sqlSession.getMapper(CharactorMapper.class);

        charactorMapper.addCharactor(charactor);
        sqlSession.commit();
        sqlSession.close();
        return;
    }
    //管理员删除某个角色
    public void deleteCharactors(int cId){
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();

        SqlSession sqlSession = sqlSessionFactory.openSession();

        CharactorMapper charactorMapper = sqlSession.getMapper(CharactorMapper.class);
        charactorMapper.deleteCharactorById(cId);
        sqlSession.commit();
        sqlSession.close();
        return;
    }
    //用户查看自己的角色
    public List<Charactor> selectUSerscharactor(int uId){
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        CharactorMapper charactorMapper = sqlSession.getMapper(CharactorMapper.class);
        List<Charactor> charactors = charactorMapper.selectUerscharactor(uId);
        sqlSession.close();
        return charactors;
    }
    //用户购买一个新角色
    public void userGetaccessories(int uId,int cId){
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();

        SqlSession sqlSession = sqlSessionFactory.openSession();

        CharactorMapper charactorMapper = sqlSession.getMapper(CharactorMapper.class);

        charactorMapper.userGetcharactor(cId,uId);
        sqlSession.commit();

        sqlSession.close();

    }
}
