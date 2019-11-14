package com.aaa.creator2.service;

import com.aaa.creator2.entity.Sort;
import com.aaa.creator2.entity.Users;
import com.aaa.creator2.mapper.SortMapper_wx;
import com.aaa.creator2.mapper.UserMapper_wx;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl_wx implements UserService_wx  {
    @Resource
    private UserMapper_wx userMapper_wx;
//    @Override
//    public User selUser(String uphone, String upassword) {
//        return userMapper_wx.selUser(uphone,upassword);
//    }

    @Override
    public int addUser(Users users) {
        return userMapper_wx.addUser(users);
    }

    @Override
    public int selUser(String openid) {
        return userMapper_wx.selUser(openid);
    }


    @Override
    public Users selUserId(String openid) {
        return userMapper_wx.selUserId(openid);
    }

}
