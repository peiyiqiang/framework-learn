package org.example.controller;

import org.example.domain.User;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/findAll")
    public String findAll(Model model) {
        System.out.println("控制层：查询所有");
        List<User> users = userService.findAll();
        model.addAttribute("users", users);
        return "list";
    }

    @RequestMapping("/save")
    public String saveUser(User user) {
        System.out.println("控制层：保存");
        userService.saveUser(user);
        return "success";
    }

    @RequestMapping("/update")
    public String updateUser(User user) {
        System.out.println("控制层：更新");
        userService.updateUser(user);
        return "success";
    }

    @RequestMapping("/delete")
    public String deleteUser(Integer id) {
        System.out.println("控制层：删除");
        userService.deleteUser(id);
        return "success";
    }

    @RequestMapping("/find")
    public String findById(Integer id, Model model) {
        System.out.println("控制层：根据id查询");
        User user = userService.findById(id);
        model.addAttribute("user", user);
        return "user";
    }

}
