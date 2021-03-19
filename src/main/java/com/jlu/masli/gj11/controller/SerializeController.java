package com.jlu.masli.gj11.controller;

import com.jlu.masli.gj11.entity.UserInfoEntity;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
public class SerializeController {

    @Resource
    private RedisTemplate redisTemplate;

    @RequestMapping("/setUser")
    public String setUser() {
        UserInfoEntity user = new UserInfoEntity();
        user.setName("cicada");
        List<String> list = new ArrayList<>();
        list.add("小学");
        list.add("初中");
        list.add("高中");
        list.add("大学");
        redisTemplate.opsForValue().set("userInfo", user);
        return "success";
    }

    @RequestMapping("/getUser")
    public UserInfoEntity getUser() {
        return (UserInfoEntity) redisTemplate.opsForValue().get("userInfo");
    }
}
