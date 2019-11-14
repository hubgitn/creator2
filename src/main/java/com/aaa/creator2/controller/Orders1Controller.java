package com.aaa.creator2.controller;

import com.aaa.creator2.service.Orders1ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("Orders1")
public class Orders1Controller{
    @Autowired
    private Orders1ServiceImpl orders1ServiceImpl;
    @RequestMapping("findOrder1")
    @ResponseBody

    public int findAll(){
        Integer Orders1= orders1ServiceImpl.findOrders1();
        System.out.println(Orders1);
        return Orders1;
    }
}
