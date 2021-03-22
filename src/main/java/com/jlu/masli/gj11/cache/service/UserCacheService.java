package com.jlu.masli.gj11.cache.service;

import com.jlu.masli.gj11.entity.UserInfoEntity;

public interface UserCacheService {
    // 增、改、查、删
    UserInfoEntity addUser(UserInfoEntity user);

    UserInfoEntity updateUser(Integer id);

    UserInfoEntity selectUser(Integer id);

    void deleteUser(Integer id);
}
