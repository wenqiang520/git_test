package com.itheima.controller;

import com.itheima.domain.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/items")
public class ItmsController {
    @Autowired
private ItemsService service;

    @RequestMapping("/findDetail")
    public String  findDetail(Model model){
        Items items = service.findByid(1);
        model.addAttribute("item",items);

        return "itemDetail";


    }



}
