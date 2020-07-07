package org.example.dao;

import org.example.domain.User;

import java.util.List;

public interface IUserDao {
    List<User> findAll();

    User findById(Integer id);
}
