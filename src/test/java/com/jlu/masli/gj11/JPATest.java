package com.jlu.masli.gj11;

import com.jlu.masli.gj11.entity.UserInfoEntity;
import com.jlu.masli.gj11.jpa.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Gj11Application.class)
public class JPATest {

    @Resource
    private UserService userService;

    @Test
    public void addUser() {
        UserInfoEntity user = new UserInfoEntity();
        user.setName("知了一笑");
        //user.setAge(22);
        userService.addUser(user);
        UserInfoEntity user1 = new UserInfoEntity();
        user1.setName("cicada");
        //user1.setAge(23);
        userService.addUser(user1);
    }

    /* @Test
     public void findByAge (){
         Integer age = 22 ;
         // User{id=3, name='知了一笑', age=22}
         System.out.println(userService.findByAge(age));
     }
 */
    @Test
    public void findByName() {
        System.out.println(userService.findByName("cicada"));
    }

    @Test
    public void findSql() {
        // User{id=4, name='cicada', age=23}
        System.out.println(userService.findSql("cicada"));
    }

    @Test
    public void update() {
        UserInfoEntity user = new UserInfoEntity();
        // 如果这个主键不存在，会以主键自增的方式新增入库
        user.setId(3);
        user.setName("哈哈一笑");
        // user.setAge(25);
        userService.update(user);
    }

    @Test
    public void deleteStudentById() {
        userService.deleteStudentById(5);
    }

}
