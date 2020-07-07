package org.example.service;

import org.example.domain.User;

import java.util.List;

public interface UserService {

    /**
     * 查询所有用户
     * @return
     */
    public List<User> findAll();

    /**
     * 保存用户
     * @param user
     */
    public void saveUser(User user);

    /**
     * 更新用户
     * @param user
     */
    public void updateUser(User user);

    /**
     * 根据id删除用户
     * @param id
     */
    public void deleteUser(Integer id);

    /**
     * 根据id查找用户
     * @param id
     * @return
     */
    public User findById(Integer id);

}
