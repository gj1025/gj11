package com.jlu.masli.gj11.controller;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

@RestController
public class RedisController {

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @RequestMapping("/setGet")
    public String setGet() {
        stringRedisTemplate.opsForValue().set("cicada", "smile");
        return stringRedisTemplate.opsForValue().get("cicada");
    }

    @Resource
    private RedisTemplate redisTemplate;

    /**
     * 设置 Key 的有效期 10 秒
     */
    @RequestMapping("/setKeyTime")
    public String setKeyTime() {
        redisTemplate.opsForValue().set("timeKey", "timeValue", 10, TimeUnit.SECONDS);
        return "success";
    }

    @RequestMapping("/getTimeKey")
    public String getTimeKey() {
        // 这里 Key 过期后，返回的是字符串 'null'
        return String.valueOf(redisTemplate.opsForValue().get("timeKey"));
    }
}

