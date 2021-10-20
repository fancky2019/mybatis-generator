package com.example.mybatisgenerator.dao.online;

import com.example.mybatisgenerator.model.entity.online.Clue;

public interface ClueMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Clue record);

    int insertSelective(Clue record);

    Clue selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Clue record);

    int updateByPrimaryKey(Clue record);
}