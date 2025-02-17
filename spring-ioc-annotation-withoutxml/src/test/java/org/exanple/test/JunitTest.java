package org.exanple.test;

import config.SpringConfiguration;
import org.example.service.IAccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfiguration.class)
public class JunitTest {

    @Autowired
    private IAccountService as;

    @Test
    public void testJunit() {
        as.saveAccount();
    }
}
