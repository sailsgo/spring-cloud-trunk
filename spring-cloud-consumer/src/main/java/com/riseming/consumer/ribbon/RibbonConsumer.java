package com.riseming.consumer.ribbon;

import com.riseming.entity.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * <p> 类描述：
 * <p> 创建人: mingjianyong
 * <p> 创建时间: 2019/5/25 14:59
 * <p> 版权申明：Huobi All Rights Reserved
 */
@RestController
@RequestMapping("/user")
public class RibbonConsumer {
    @Autowired
    RestTemplate restTemplate;
    @RequestMapping("find")
    public User findUser() {
        User param = new User();
        param.setUserName("Ribbon Request");
        return restTemplate.getForEntity("http://user-provider/user/find?userName=F1212", User.class).getBody();
    }
}
