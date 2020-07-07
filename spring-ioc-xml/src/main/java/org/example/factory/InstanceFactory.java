package org.example.factory;

import org.example.service.IAccountService;
import org.example.service.impl.AccountServiceImpl1;

public class InstanceFactory {

    public InstanceFactory(){
        System.out.println("InstanceFactory.InstanceFactory");
    }

    public IAccountService getAccountService() {
        return new AccountServiceImpl1();
    }
}
