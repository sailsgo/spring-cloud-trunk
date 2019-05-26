package com.riseming.userprovider.controller;

import com.riseming.entity.entity.User;
import com.riseming.userprovider.config.ServerConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p> 类描述：
 * <p> 创建人: mingjianyong
 * <p> 创建时间: 2019/5/25 14:23
 * <p> 版权申明：Huobi All Rights Reserved
 */
@RequestMapping("user")
@RestController
public class UserController {
    @Autowired
    private ServerConfig serverConfig;
    @RequestMapping("find")
    public User findUser(User user){
        if (user.getId() == null) {
            user.setId((int)(1+Math.random()*(100-1+1)));
            user.setServerInfo(serverConfig.getUrl());
            return user;
        } else{
            return new User(-1,"Anonymous",0,serverConfig.getUrl());
        }
    }
}
