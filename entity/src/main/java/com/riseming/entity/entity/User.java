package com.riseming.entity.entity;

import java.io.Serializable;

/**
 * <p> 类描述：
 * <p> 创建人: mingjianyong
 * <p> 创建时间: 2019/5/25 14:25
 * <p> 版权申明：Huobi All Rights Reserved
 */
public class User implements Serializable {

    private static final long serialVersionUID = -1019429280716502870L;
    private Integer id;
    private String userName;
    private Integer age;
    private String serverInfo;
    public User() {

    }
    public User(Integer id,String userName,Integer age,String serverInfo) {
        this.id = id;
        this.userName = userName;
        this.age = age;
        this.serverInfo = serverInfo;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getServerInfo() {
        return serverInfo;
    }

    public void setServerInfo(String serverInfo) {
        this.serverInfo = serverInfo;
    }
}
