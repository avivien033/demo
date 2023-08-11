package com.jiawa.wiki.service.imlp;

import com.jiawa.wiki.domain.Demo;
import com.jiawa.wiki.mapper.DemoMapper;
import com.jiawa.wiki.service.DemoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DemoServiceImpl implements DemoService {
   @Resource
    private DemoMapper demoMapper;
    @Override
    public List<Demo> list() {
        return demoMapper.selectByExample(null);
    }
}
