package com.example.mybatisgenerator.dao.online;

import com.example.mybatisgenerator.model.entity.online.TagType;

public interface TagTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TagType record);

    int insertSelective(TagType record);

    TagType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TagType record);

    int updateByPrimaryKey(TagType record);
}