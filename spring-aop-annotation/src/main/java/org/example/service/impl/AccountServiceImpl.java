package org.example.service.impl;

import org.example.service.IAccountService;
import org.springframework.stereotype.Service;

@Service("accountService")
public class AccountServiceImpl implements IAccountService {

    public void saveAccount() {
        System.out.println("1111111AccountServiceImpl.saveAccount");
    }

    public void updateAccount(int i) {
        System.out.println("2222222AccountServiceImpl.updateAccount"+i);

    }

    public int countAccount() {
        System.out.println("3333333AccountServiceImpl.countAccount");
        return 0;
    }
}
