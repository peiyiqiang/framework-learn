package org.example.dao;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.example.domain.Account;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class IAccountDaoTest {
    InputStream in;
    SqlSession session;
    IAccountDao accountDao;

    @Before
    public void init() throws IOException {
        System.out.println("init");

        //1.读取配置文件
        in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        //3.使用工厂生产SqlSession对象
        session = factory.openSession();
        //session = factory.openSession(true);  设置自动提交
        //4.使用SqlSession创建dao接口的代理对象
        accountDao = session.getMapper(IAccountDao.class);
    }

    @After
    public void destroy() throws IOException {
        //事务提交
        session.commit();
        //6.释放资源
        session.close();
        in.close();

        System.out.println("destroy");
    }

    @Test
    public void testFindAll() {
        List<Account> accounts = accountDao.findAll();
        for(Account account : accounts) {
            System.out.println(account);
        }
    }
}
