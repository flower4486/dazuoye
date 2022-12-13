package com.itheima.mapper;

import com.itheima.pojo.Charactor;

import java.util.List;

public interface CharactorMapper {
    List<Charactor>  selectAllcharactor();

    Charactor selectById(String cid);
}
