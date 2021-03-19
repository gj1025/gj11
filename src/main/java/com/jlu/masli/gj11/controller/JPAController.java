package com.jlu.masli.gj11.controller;

import com.jlu.masli.gj11.entity.UserInfoEntity;
import com.jlu.masli.gj11.jpa.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class JPAController {

    @Resource
    private UserService userService;

    @RequestMapping("/jpa")
    @ResponseBody
    public String jpa() {
        UserInfoEntity user = new UserInfoEntity();
        user.setName("你好");
        //user.setAge(22);
        userService.addUser(user);
        UserInfoEntity user1 = new UserInfoEntity();
        user1.setName("cicada");
        //user1.setAge(23);
        return "jpa";
    }


    @RequestMapping("/jpa/sel")
    @ResponseBody
    public String jpasel() {
        System.out.println(userService.findByName("a"));
        /*UserInfoEntity user = new UserInfoEntity();
        user.setName("知了一笑");
        //user.setAge(22);
        userService.addUser(user);
        UserInfoEntity user1 = new UserInfoEntity();
        user1.setName("cicada");
        //user1.setAge(23);*/
        return "jpa";
    }

}
