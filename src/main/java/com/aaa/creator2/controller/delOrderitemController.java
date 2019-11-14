package com.aaa.creator2.controller;

import com.aaa.creator2.entity.Orderitem;
import com.aaa.creator2.service.delOrderitemService_wx;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class delOrderitemController {
    @Autowired
    private delOrderitemService_wx delOrderitemService_wx;
    @ResponseBody
    @RequestMapping("delOrder")
    public int delOrder(Integer omid ){
        System.out.println(omid);
        return delOrderitemService_wx.delOrder(omid);
    }
}
