package org.example.test;

import org.example.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

    @Test
    public void testSpring() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserService userService = (UserService)ac.getBean("userService");

        userService.findAll();

    }
}
