package com.itheima.controller;

import com.itheima.domain.Account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.function.DoubleToIntFunction;

@Controller
@RequestMapping("/param")
public class Param {
    @RequestMapping("/testParam")
    public  String testParam(@RequestParam("uname") String name, String password){
        System.out.println("执行了");
        System.out.println("用户名："+name+" 密码 "+password);
        return "success";
    }
    @RequestMapping("/saveAccount")
    public String saveAccount(Account account){
        System.out.println(account);
        return "success";
    }


    @RequestMapping("/testServlet")
    public String testServlet(HttpServletRequest request, HttpServletResponse response){
        System.out.println(request);
        HttpSession session = request.getSession();
        ServletContext context = session.getServletContext();
        System.out.println(context);
        System.out.println("原生Servlet正在输出");
        return "success";
    }

}
