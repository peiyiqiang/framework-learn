package org.example.ui;

import config.SpringConfiguration;
import org.example.service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {

        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        IAccountService as = (IAccountService) ac.getBean("accountService");
        IAccountService as2 = (IAccountService) ac.getBean("accountService");


        System.out.println(as == as2);
        as.saveAccount();


    }
}
