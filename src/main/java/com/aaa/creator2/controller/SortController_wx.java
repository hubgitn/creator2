package com.aaa.creator2.controller;

import com.aaa.creator2.entity.Sort;
import com.aaa.creator2.service.SortService_wx;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class SortController_wx {
    @Autowired
    private SortService_wx sortService_wx;
    @ResponseBody
    @RequestMapping("selSort")
    public Object selSort(){
        List<Sort> sorts = sortService_wx.selSort();
        System.out.println(sorts);
        return sorts;
    }
}
