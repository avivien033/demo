package com.jiawa.wiki.mapper;

import com.jiawa.wiki.domain.Test;
import com.jiawa.wiki.domain.TestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestMapper {
    public List<Test> list();
}