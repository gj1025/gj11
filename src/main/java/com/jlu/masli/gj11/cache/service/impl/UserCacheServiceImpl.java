package com.jlu.masli.gj11.cache.service.impl;

import com.jlu.masli.gj11.cache.service.UserCacheService;
import com.jlu.masli.gj11.entity.UserInfoEntity;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class UserCacheServiceImpl implements UserCacheService {

    // 使用自定义的key生成策略
    // 缓存结果key：addUser::KeyGenerator:addUser
    @CachePut(value = "addUser",keyGenerator="oneKeyGenerator")
    @Override
    public UserInfoEntity addUser(UserInfoEntity user) {
        return user ;
    }

    // 缓存结果key：updateUser::2
    @CachePut(value = "updateUser",key = "#result.id")
    @Override
    public UserInfoEntity updateUser(Integer id) {
        UserInfoEntity user = new UserInfoEntity() ;
        user.setId(id);
        user.setName("smile");
        return user;
    }

    // 缓存结果key: selectUser::3
    @Cacheable(cacheNames = "selectUser",key = "#id")
    @Override
    public UserInfoEntity selectUser(Integer id) {
        UserInfoEntity user = new UserInfoEntity() ;
        user.setId(id);
        user.setName("cicadaSmile");
        return user;
    }

    // 删除指定key: selectUser::3
    @CacheEvict(value = "selectUser",key = "#id",beforeInvocation = true)
    @Override
    public void deleteUser(Integer id) {

    }
}

