package org.example.dao;

import org.apache.ibatis.annotations.*;
import org.example.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserDao {

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
