package org.example.dao.impl;

import org.example.dao.IAccountDao;
import org.springframework.stereotype.Repository;

@Repository("accountDao")
public class AccountDaoImpl implements IAccountDao {
    public void saveAccount() {
        System.out.println("AccountDaoImpl.saveAccount");
    }
}
