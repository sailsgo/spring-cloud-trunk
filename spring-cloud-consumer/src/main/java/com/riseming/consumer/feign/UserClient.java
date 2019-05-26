package com.riseming.consumer.feign;

import com.riseming.entity.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
//指定Feign要消费的服务
@FeignClient("user-provider")
public interface UserClient {
    //消费的服务地址
    @RequestMapping(value="/user/find")
    User find(@RequestParam(value = "userName") String userName);
}
