package com.jiawa.wiki.controllor;

import com.jiawa.wiki.domain.Test;
import com.jiawa.wiki.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TestController {
    @Value("${test.hello}")
    private  String testHello;
    @Resource
    private TestService testService;
    @RequestMapping("/hello")
    public  String hello(){
        return "hello word"+testHello;
    }
@PostMapping("/hello/post")
    public  String helloPost( String name){
        return "hello word"+name;
    }

    @RequestMapping("list")
    public List<Test> list(){
        return testService.list();
    }
}
