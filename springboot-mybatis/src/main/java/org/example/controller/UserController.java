package org.example.controller;

import org.example.domain.User;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/findAll")
    public List<User> findAll() {
        System.out.println("控制层：查询所有");
        return userService.findAll();
    }

    @RequestMapping("/save")
    public String saveUser(User user) {
        System.out.println("控制层：保存");
        userService.saveUser(user);
        return "保存成功";
    }

    @RequestMapping("/update")
    public String updateUser(User user) {
        System.out.println("控制层：更新");
        userService.updateUser(user);
        return "更新成功";
    }

    @RequestMapping("/delete")
    public String deleteUser(Integer id) {
        System.out.println("控制层：删除");
        userService.deleteUser(id);
        return "删除成功";
    }

    @RequestMapping("/find")
    public User findById(Integer id) {
        System.out.println("控制层：根据id查询");
        return userService.findById(id);
    }

}
