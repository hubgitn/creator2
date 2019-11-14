package com.aaa.creator2.service;

import com.aaa.creator2.entity.Users;

public interface UserService_wx {
//    User su = new User();
//    public User selUser(String uphone, String upassword);
    public int addUser(Users users);
    public int selUser(String openid);

  // 查uid
     public Users selUserId(String openid);
}
