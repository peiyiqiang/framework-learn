package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//声明该类是SpringBoot引导类
@SpringBootApplication
public class SpringbootMybatisApplication {

    //程序入口
    public static void main(String[] args) {
        //运行SpringBoot引导类
        SpringApplication.run(SpringbootMybatisApplication.class, args);
    }

}