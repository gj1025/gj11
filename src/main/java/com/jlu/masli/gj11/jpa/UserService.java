package com.jlu.masli.gj11.jpa;

import com.jlu.masli.gj11.entity.UserInfoEntity;
import com.jlu.masli.gj11.repository.UserRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {

    @Resource
    private UserRepository userRepository;

    // 保存
    public void addUser(UserInfoEntity user) {
        userRepository.saveAndFlush(user);
    }

    // 多条件查询
    public UserInfoEntity findByName(String name) {
        return userRepository.findByName(name);
    }

    // 自定义SQL查询
    public UserInfoEntity findSql(String name) {
        return userRepository.findSql(name);
    }

    // 根据ID修改
    public void update(UserInfoEntity user) {
        userRepository.save(user);
    }

    //根据id删除一条数据
    public void deleteStudentById(Integer id) {
        userRepository.deleteById(id);
    }

}
