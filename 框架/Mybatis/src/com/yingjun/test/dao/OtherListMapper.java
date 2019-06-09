package com.yingjun.test.dao;

import com.yingjun.test.model.OtherList;

public interface OtherListMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OtherList record);

    int insertSelective(OtherList record);

    OtherList selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OtherList record);

    int updateByPrimaryKey(OtherList record);
}