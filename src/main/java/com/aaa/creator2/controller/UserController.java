package com.aaa.creator2.controller;

import com.aaa.creator2.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("User")
public class UserController {
    @Autowired
    private UserServiceImpl userServiceImpl;
    @RequestMapping("findUid")
    @ResponseBody
    public int getUserId(String openid){
        openid="ovO1H49fwQd2RmmHxMyyjNEYJAMI";
        int uid = userServiceImpl.getUserId(openid);
        return uid;
    }
}
