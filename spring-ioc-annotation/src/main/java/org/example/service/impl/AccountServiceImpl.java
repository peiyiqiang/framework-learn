package org.example.service.impl;

import org.example.dao.IAccountDao;
import org.example.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/**
 * <bean id="accountService" class="org.example.service.impl.AccountServiceImpl" scope="prototype"></bean>
 */
@Service("accountService")
//@Scope("prototype")
public class AccountServiceImpl implements IAccountService {

    @Value("5")
    private int a;

//    @Autowired
//    @Qualifier("accountDao")
    @Resource(name = "accountDao")
    private IAccountDao accountDao;

    public AccountServiceImpl() {
        System.out.println("AccountServiceImpl.AccountServiceImpl");
    }

    public void saveAccount() {
        System.out.println("AccountServiceImpl.saveAccount");
        System.out.println(a);
        System.out.println(accountDao);
        accountDao.saveAccount();
    }
}
