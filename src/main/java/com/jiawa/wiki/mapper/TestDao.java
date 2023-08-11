package com.jiawa.wiki.mapper;

import com.jiawa.wiki.domain.Test;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestDao {
    int deleteByPrimaryKey(Long id);

    int insert(Test record);

    int insertSelective(Test record);

    Test selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Test record);

    int updateByPrimaryKey(Test record);
}