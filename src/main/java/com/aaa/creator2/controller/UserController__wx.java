package com.aaa.creator2.controller;

import com.aaa.creator2.entity.Users;
import com.aaa.creator2.service.UserService_wx;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController__wx {
    @Autowired
    private UserService_wx userService_wx;
//    @RequestMapping("selUser")
//    @ResponseBody
//    public Object selUser(String uphone,String upassword){
//        User user = userService_wx.selUser(uphone,upassword);
//        return user;
//    }
    @RequestMapping("addUser")
    @ResponseBody
    public Object addUser(Users users){
        int us = userService_wx.selUser(users.getOpenid());
        if(us>0){
            System.out.println("openid重复");
            return  us;
        }else{
            int a = userService_wx.addUser(users);
            return a;
        }

    }






    @RequestMapping("selUserId")
    @ResponseBody
    public Users selUserId(String openid){
        Users uid = userService_wx.selUserId(openid);
        System.out.println("++++++++++++"+uid);
        return uid;
    }
}
