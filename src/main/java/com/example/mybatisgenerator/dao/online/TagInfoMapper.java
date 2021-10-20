package com.example.mybatisgenerator.dao.online;

import com.example.mybatisgenerator.model.entity.online.TagInfo;

public interface TagInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TagInfo record);

    int insertSelective(TagInfo record);

    TagInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TagInfo record);

    int updateByPrimaryKey(TagInfo record);
}