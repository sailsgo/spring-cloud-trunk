package com.riseming;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * <p> 类描述：
 * <p> 创建人: mingjianyong
 * <p> 创建时间: 2019/5/25 11:30
 * <p> 版权申明：Huobi All Rights Reserved
 */
@EnableDiscoveryClient
@SpringBootApplication
public class NacosApplication {
    public static void main(String[] args){
        SpringApplication.run(NacosApplication.class,args);
    }
}
