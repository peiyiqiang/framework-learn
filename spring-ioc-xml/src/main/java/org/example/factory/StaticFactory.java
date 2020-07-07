package org.example.factory;

import org.example.service.IAccountService;
import org.example.service.impl.AccountServiceImpl1;

public class StaticFactory {

    public static IAccountService getAccountService() {
        return new AccountServiceImpl1();
    }
}
