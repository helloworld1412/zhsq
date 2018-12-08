package com.monster.zhaqsq.controller;

import com.monster.zhaqsq.bean.Msg;
import com.monster.zhaqsq.bean.UserBasic;
import com.monster.zhaqsq.service.UserBasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collections;
import java.util.List;

@Controller
public class UserBasicController {

    @Autowired
    UserBasicService userbasicService;

    @RequestMapping("/users")
    @ResponseBody
    public List<UserBasic> getUserPersonalInfo(){
        List<UserBasic> userpersonalinfo = userbasicService.getinfo();
        return userpersonalinfo;
    }

    @ResponseBody
    @RequestMapping(value = "/users/{uid}",method = RequestMethod.PUT)
    public Msg saveUser(UserBasic userbasic){
        userbasicService.updateInfo(userbasic);
        return Msg.success();
    }
}
