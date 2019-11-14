package com.aaa.creator2.service;

import com.aaa.creator2.mapper.UserMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class UserServiceImpl implements  UserService{
    @Resource
    private UserMapper userMapper;
    @Override
    public int getUserId(String openid) {
        return userMapper.getUserId(openid);
    }
}
