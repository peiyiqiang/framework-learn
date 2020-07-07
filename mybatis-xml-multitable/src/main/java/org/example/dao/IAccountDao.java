package org.example.dao;

import org.example.domain.Account;

import java.util.List;

public interface IAccountDao {
    List<Account> findAll();

    Account findByUid(Integer uid);
}
