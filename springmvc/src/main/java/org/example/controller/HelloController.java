package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String sayHello() {
        System.out.println("Hello SpringMVC");
        return "success";
    }
}
