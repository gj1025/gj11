package com.jlu.masli.gj11.repository;

import com.jlu.masli.gj11.entity.UserInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserInfoEntity,Integer> {
    
    // 多条件查询
    UserInfoEntity findByName(String name);
    // 自定义查询
    @Query("from UserInfoEntity u where u.name=:name")
    UserInfoEntity findSql(@Param("name") String name);
}
