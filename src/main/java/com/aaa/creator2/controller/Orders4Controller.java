package com.aaa.creator2.controller;

import com.aaa.creator2.service.Orders4ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("Orders4")
public class Orders4Controller{
    @Autowired
    private Orders4ServiceImpl orders4ServiceImpl;
    @RequestMapping("findOrder4")
    @ResponseBody

    public int findAll(){
        Integer Orders4= orders4ServiceImpl.findOrders4();
        System.out.println(Orders4);
        return Orders4;
    }
}
