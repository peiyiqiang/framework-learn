package org.example.service.impl;

import org.example.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

@Service("accountService")
public class AccountServiceImpl implements IAccountService {

    @Resource(name = "birthday")
    private Date birthday;

    public void saveAccount() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "AccountServiceImpl{" +
                "birthday=" + birthday +
                '}';
    }
}
