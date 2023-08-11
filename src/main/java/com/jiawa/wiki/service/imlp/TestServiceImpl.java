package com.jiawa.wiki.service.imlp;

import com.jiawa.wiki.domain.Test;
import com.jiawa.wiki.mapper.TestMapper;
import com.jiawa.wiki.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class TestServiceImpl implements TestService {
   @Resource
    private TestMapper testMapper;
    @Override
    public List<Test> list() {
        return testMapper.list();
    }
}
