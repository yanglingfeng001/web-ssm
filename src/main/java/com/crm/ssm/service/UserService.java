package com.crm.ssm.service;

import com.crm.ssm.pojo.User;

public interface UserService {
    int login(User user);//根据用户名和密码验证登陆是否成功

    int regist(User user);//根据用户名和密码验证是否注册成功
}
