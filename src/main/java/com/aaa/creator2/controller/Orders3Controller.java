package com.aaa.creator2.controller;

import com.aaa.creator2.service.Orders3ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("Orders3")
public class Orders3Controller{
    @Autowired
    private Orders3ServiceImpl orders3ServiceImpl;
    @RequestMapping("findOrder3")
    @ResponseBody

    public int findAll(){
        Integer Orders3= orders3ServiceImpl.findOrders3();
        System.out.println(Orders3);
        return Orders3;
    }
}
