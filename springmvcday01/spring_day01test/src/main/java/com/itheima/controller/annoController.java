package com.itheima.controller;

import com.itheima.domain.Account;

import com.sun.scenario.effect.Blend;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import sun.text.normalizer.NormalizerBase;

import javax.jws.WebParam;
import javax.servlet.http.HttpServletRequest;


@Controller
@RequestMapping(path = "/anno")
@SessionAttributes(value = {"msg"})
public class annoController {
//请求体的获取
    @RequestMapping("/testRequestBody")
    public String testRequestBody(@RequestBody String body){
        System.out.println(body);
        return "success";
    }



    //测试PathVariable
    @RequestMapping("/testPathVariable/{sid}")
    public String testPathVariable(@PathVariable(name="sid")String id){
        System.out.println(id);
        return "success";
    }

//测试请求头
    @RequestMapping("/testRequestHeader")
    public String testRequestHeader(@RequestHeader(value = "Accept") String header){
        System.out.println("请求头:"+header);
        return "success";
    }

    //测试CookValue；
    @RequestMapping("/testCookValue")
    public String testCookValue(@CookieValue(value = "JSESSIONID") String cookvalue){
        System.out.println("JSESSIONID:"+cookvalue);
        return "success";
    }

    //测试testModelAttrlbute
    @RequestMapping("/testModelAttrlbute")
    public String testModelAttrlbute(Account account){
        System.out.println("testModelAttrlbute执行了");
        System.out.println(account);
        return "success";
    }
@ModelAttribute
    public Account showUser(String uname){
    Account account= new Account();
    account.setUname(uname);
    account.setPassword("123");
    account.setMoney(8.88);

    System.out.println("showUser执行了");
return account;
    }



    //测试testSessionAttrlbutes；
    @RequestMapping(value="/testSessionAttributes")
    public String testSessionAttributes(Model model){
        System.out.println("testSessionAttributes...");
        // 底层会存储到request域对象中
        model.addAttribute("msg","美美");
        return "success";
    }


    //测试getSessionAttrlbutes；
    @RequestMapping(value="/getSessionAttributes")
    public String getSessionAttributes(ModelMap modelMap){
        System.out.println("getSessionAttributes...");
        String msg = (String) modelMap.get("msg");
        System.out.println(msg);
        return "success";
    }



    /**
     * 清除
     * @param status
     * @return
     */
    @RequestMapping(value="/delSessionAttributes")
    public String delSessionAttributes(SessionStatus status){
        System.out.println("getSessionAttributes...");
        status.setComplete();
        return "success";
    }
}

