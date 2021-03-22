package com.jlu.masli.gj11.cache;

import com.jlu.masli.gj11.cache.service.UserCacheService;
import com.jlu.masli.gj11.entity.UserInfoEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class CacheTestController {

    @Resource
    private UserCacheService userCacheServiceService ;
    // 分别测试：增、改、查、删,四个方法
    @RequestMapping("/add")
    @ResponseBody
    public void testAdd (){
        UserInfoEntity user = new UserInfoEntity() ;
        user.setId(1);
        user.setName("cicada");
        userCacheServiceService.addUser(user) ;
    }
    @RequestMapping("/up")
    @ResponseBody
    public void testUpdate (){
        userCacheServiceService.updateUser(2) ;
    }
    @RequestMapping("/sel")
    @ResponseBody
    public void testSelect (){
        userCacheServiceService.selectUser(3) ;
    }
    @RequestMapping("/del")
    @ResponseBody
    public void testDelete (){
        userCacheServiceService.deleteUser(3) ;
    }
}
