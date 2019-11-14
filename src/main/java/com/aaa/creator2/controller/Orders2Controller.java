package com.aaa.creator2.controller;

import com.aaa.creator2.service.Orders2ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("Orders2")
public class Orders2Controller{
    @Autowired
    private Orders2ServiceImpl orders2ServiceImpl;
    @RequestMapping("findOrder2")
    @ResponseBody
    public int findAll(){
        Integer Orders2= orders2ServiceImpl.findOrders2();
        System.out.println(Orders2);
        return Orders2;
    }
}
