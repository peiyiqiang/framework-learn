package org.example.dao;

import org.apache.ibatis.annotations.*;
import org.example.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {

    /**
     * 查询所有用户
     * @return
     */
    @Select("select * from user")
    public List<User> findAll();

    /**
     * 保存用户
     * @param user
     */
    @Insert("insert into user (username, birthday, sex) values (#{username}, #{birthday}, #{sex})")
    public void saveUser(User user);

    /**
     * 更新用户
     * @param user
     */
    @Update("update user set username = #{username}, birthday = #{birthday}, sex = #{sex} where id = #{id};")
    public void updateUser(User user);

    /**
     * 根据id删除用户
     * @param id
     */
    @Delete("delete from user where id = #{id}")
    public void deleteUser(Integer id);

    /**
     * 根据id查找用户
     * @param id
     * @return
     */
    @Select("select * from user where id = #{uid}")
    public User findById(Integer id);

}
