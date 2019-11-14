package com.aaa.creator2.mapper;

import com.aaa.creator2.entity.Users;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper_wx {
    //public User selUser(@Param("uphone") String uphone, @Param("upassword") String upassword);
    public int addUser(Users users);

    public int selUser(String openid);

    //查uid
    public Users selUserId(String openid);
}
