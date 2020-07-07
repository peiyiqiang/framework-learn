package org.example.service.impl;

import org.example.service.IAccountService;

public class AccountServiceImpl1 implements IAccountService {

    public AccountServiceImpl1() {
        System.out.println("AccountServiceImpl.AccountServiceImpl");
    }

    public void saveAccount() {
        System.out.println("AccountServiceImpl.saveAccount");
    }
}
