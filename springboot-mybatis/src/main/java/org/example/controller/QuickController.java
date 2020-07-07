package org.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Controller
public class QuickController {

    @RequestMapping("/hello")
    public String hello() {
        System.out.println("hello springboot!!!");
        return "hello springboot!!!";
    }
}