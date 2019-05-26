package com.riseming.consumer.feign;

import com.riseming.entity.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p> 类描述：
 * <p> 创建人: mingjianyong
 * <p> 创建时间: 2019/5/25 16:48
 * <p> 版权申明：Huobi All Rights Reserved
 */
@RestController
public class FeignCosumer {
    @Autowired
    UserClient userClient;
    @RequestMapping("/feginFindUser")
    public User find() {
        System.out.println("feginFindUser");
        return userClient.find("Feign Request");
    }
}
