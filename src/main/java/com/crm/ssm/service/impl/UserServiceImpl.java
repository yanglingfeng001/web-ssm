package com.crm.ssm.service.impl;

import com.crm.ssm.mapper.UserMapper;
import com.crm.ssm.pojo.User;
import com.crm.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;

    @Override
    public int login(User user) {
        int state=this.userMapper.login(user);
        return state;
    }

    @Override
    public int regist(User user) {
    int state=this.userMapper.regist(user);
    return state;
    }

}
