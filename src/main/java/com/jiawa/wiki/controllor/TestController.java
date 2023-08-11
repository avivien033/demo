package com.jiawa.wiki.controllor;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/hello")
    public  String hello(){
        return "hello word";
    }
@PostMapping("/hello/post")
    public  String helloPost( String name){
        return "hello word"+name;
    }
}
