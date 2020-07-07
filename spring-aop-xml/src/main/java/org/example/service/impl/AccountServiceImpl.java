package org.example.service.impl;

import org.example.service.IAccountService;

public class AccountServiceImpl implements IAccountService {

    @Override
    public void saveAccount() {
        System.out.println("1111111AccountServiceImpl.saveAccount");
    }

    @Override
    public void updateAccount(int i) {
        System.out.println("2222222AccountServiceImpl.updateAccount"+i);

    }

    @Override
    public int countAccount() {
        System.out.println("3333333AccountServiceImpl.countAccount");
        return 0;
    }
}
