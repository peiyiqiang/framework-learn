package org.example.service.impl;

import org.example.dao.IAccountDao;
import org.example.service.IAccountService;

public class AccountServiceImpl3 implements IAccountService {

    private String name;
    private int age;
    private IAccountDao accountDao;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAccountDao(IAccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public void saveAccount() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "AccountServiceImpl3{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", accountDao=" + accountDao +
                '}';
    }
}
