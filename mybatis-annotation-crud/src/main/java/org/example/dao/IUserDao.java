package org.example.dao;

import org.apache.ibatis.annotations.*;
import org.example.domain.User;

import java.util.List;

//@Select() @Insert()  @Update() @Delete()

public interface IUserDao {

    @Select("select * from user")
    @Results(id = "userMap", value = {
            @Result(id = true, property = "userId", column = "id"),
            @Result(property = "userName", column = "username"),
            @Result(property = "userBirthday", column = "birthday"),
            @Result(property = "userSex", column = "sex")
    })
    List<User> findAll();

    @Select("select * from user where id = #{id}")
    @ResultMap("userMap")
    User findById(Integer id);
}
