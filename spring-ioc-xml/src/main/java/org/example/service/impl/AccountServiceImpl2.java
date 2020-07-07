package org.example.service.impl;

import org.example.dao.IAccountDao;
import org.example.service.IAccountService;

public class AccountServiceImpl2 implements IAccountService {

    private String name;
    private int age;
    private String sex;
    private IAccountDao accountDao;

    public AccountServiceImpl2(String name, int age, String sex, IAccountDao accountDao) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.accountDao = accountDao;
    }

    public void saveAccount() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "AccountServiceImpl{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", accountDao=" + accountDao +
                '}';
    }
}
