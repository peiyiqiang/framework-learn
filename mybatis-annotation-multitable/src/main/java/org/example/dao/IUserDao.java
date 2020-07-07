package org.example.dao;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;
import org.example.domain.User;

import java.util.List;

public interface IUserDao {

    @Select("select * from user")
    @Results(id = "userMap", value = {
            @Result(property = "id", column = "id"),
            @Result(property = "username", column = "username"),
            @Result(property = "birthday", column = "birthday"),
            @Result(property = "sex", column = "sex"),
            @Result(property = "accounts", column = "id", many = @Many(select = "org.example.dao.IAccountDao.findByUid",fetchType = FetchType.LAZY))
    })
    List<User> findAll();

    @Select("select * from user where id = #{id}")
    User findById(Integer id);
}
