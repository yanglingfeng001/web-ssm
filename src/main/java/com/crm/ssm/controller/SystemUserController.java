package com.crm.ssm.controller;

import com.crm.ssm.pojo.User;
import com.crm.ssm.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Controller
@RequestMapping("/user")
public class SystemUserController {
    @Resource
    private UserService userServicel;
    @RequestMapping("/registpage")
    public String registpage() {
        return "regist";
    }
    @RequestMapping(value = "/loginJudge",method = RequestMethod.POST)
    public @ResponseBody boolean loginJudge(@RequestParam String username,@RequestParam String password) {
        User user=new User();
        user.setPassword(password);
        user.setUsername(username);
        int state=this.userServicel.login(user);
        System.out.println(state);
        if(state==1)
            return true;
        else
            return false;
    }

    @RequestMapping(value="/registJudge",method = RequestMethod.POST)
    public @ResponseBody boolean registJudge(@RequestParam String username,@RequestParam String password) {
        User user=new User();
        user.setPassword(password);
        user.setUsername(username);
        int state=this.userServicel.regist(user);
        System.out.println(state);
        if(state==1)
            return true;
        else
            return false;
    }

}
