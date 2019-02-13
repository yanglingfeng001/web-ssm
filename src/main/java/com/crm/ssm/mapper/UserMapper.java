package com.crm.ssm.mapper;

import com.crm.ssm.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    int login(User user);//根据用户名和密码验证登陆是否成功

    int regist(User user);//根据用户名和密码验证是否注册成功

}
