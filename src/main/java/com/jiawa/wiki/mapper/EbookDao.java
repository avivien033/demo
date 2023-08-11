package com.jiawa.wiki.mapper;

import com.jiawa.wiki.domain.Ebook;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EbookDao {
    int deleteByPrimaryKey(Long id);

    int insert(Ebook record);

    int insertSelective(Ebook record);

    Ebook selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Ebook record);

    int updateByPrimaryKey(Ebook record);
}