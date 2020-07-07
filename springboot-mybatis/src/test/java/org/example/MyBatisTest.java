package org.example;

import org.example.dao.UserDao;
import org.example.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootMybatisApplication.class)  //引导类
public class MyBatisTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void test() {
        List<User> users = userDao.findAll();
        System.out.println(users);

    }
}