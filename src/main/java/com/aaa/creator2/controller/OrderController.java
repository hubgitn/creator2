package com.aaa.creator2.controller;
import com.aaa.creator2.entity.Order;
import com.aaa.creator2.service.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
@RequestMapping("Order")
public class OrderController{
    @Autowired
    private OrderServiceImpl orderServiceImpl;
    @RequestMapping("findAll")
    @ResponseBody
    public List<Order> getOrderById(Integer uid){
        List<Order> orders=orderServiceImpl.getOrderById(uid);
        System.out.println(orders);
        return orders;
    }


}
