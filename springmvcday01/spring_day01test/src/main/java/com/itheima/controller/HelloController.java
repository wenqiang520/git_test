package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/user")
public class HelloController {


    @RequestMapping(path = "/hello")
    public String sayController(){
        System.out.println("helloSpringMVC");
        return "success";
    }

    @RequestMapping(value = "/requestMapping")
    public String requestMapping(){
        System.out.println("requestMapping的测试");
        return "success";
    }
}
