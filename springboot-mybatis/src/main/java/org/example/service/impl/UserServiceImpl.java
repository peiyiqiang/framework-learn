package org.example.service.impl;

import org.example.dao.UserDao;
import org.example.domain.User;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findAll() {
        System.out.println("业务层：查询所有");
        return userDao.findAll();
    }

    @Override
    public void saveUser(User user) {
        System.out.println("业务层：保存");
        userDao.saveUser(user);
    }

    @Override
    public void updateUser(User user) {
        System.out.println("业务层：更新");
        userDao.updateUser(user);
    }

    @Override
    public void deleteUser(Integer id) {
        System.out.println("业务层：删除");
        userDao.deleteUser(id);
    }

    @Override
    public User findById(Integer id) {
        System.out.println("业务层：根据id查询");
        return userDao.findById(id);
    }
}
