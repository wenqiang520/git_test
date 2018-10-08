package com.itheima.controller;

import com.itheima.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.WebParam;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping(path = "/user")
public class Usercontroller {
    /**
     * 返回String
     * @param model
     * @return
     */
    @RequestMapping("/testString")
    public String testString(Model model){
        System.out.println("testString方法执行了...");
        // 模拟从数据库中查询出User对象
        User user = new User();
        user.setUsername("美美");
        user.setPassword("123");
        user.setAge(30);
        // model对象
        model.addAttribute("user",user);
        return "success";
    }

    @RequestMapping("/testVoid")
    public void testVoid(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("testVoid方法执行了...");
        // 编写请求转发的程序
       // request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request,response);


  /* response.setContentType("application/json;charset=UTF-8");
        //重定向
         response.sendRedirect(request.getContextPath()+"/index.jsp");*/

        // 设置中文乱码
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        // 直接会进行响应
           response.getWriter().print("你好");

        return;
    }


    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView(){
        ModelAndView mv = new ModelAndView();
        User user = new User();
        user.setUsername("美美");
        user.setPassword("123");
        user.setAge(30);
        mv.addObject("user",user);
      mv.setViewName("success");
      return mv;
    }

    @RequestMapping("/testForwardOrRedirect")
    public String testForwardOrRedirect(){
        System.out.println("testForwardOrRedirect测试");
        //return "forward:/WEB-INF/pages/success.jsp";
return "redirect:/index.jsp";
    }

    @RequestMapping("/testAjax")
    @ResponseBody
    public User testAjax(@RequestBody User user){
        System.out.println("testAjax执行了");
        System.out.println(user);
        user.setUsername("zhangsan");
        user.setAge(20);
        return user;
    }
}
