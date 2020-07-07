package org.example.dao;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.example.domain.User;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

public class IUserDaoTest {
    InputStream in;
    SqlSession session;
    IUserDao userDao;

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
        userDao = session.getMapper(IUserDao.class);
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
        List<User> users = userDao.findAll();
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void testSaveUser() {
        User user = new User();
        user.setUserName("李四");
        user.setUserBirthday(new Date());
        user.setUserSex("女");

        userDao.saveUser(user);
    }

    @Test
    public void testUpdateUser() {
        User user = new User();
        user.setUserId(57);
        user.setUserName("张三");
        user.setUserBirthday(new Date());
        user.setUserSex("男");

        userDao.updateUser(user);
    }

    @Test
    public void testDeleteUser() {
        userDao.deleteUser(53);
    }

    @Test
    public void testFindById() {
        User user = userDao.findById(57);
        System.out.println(user);
    }

    @Test
    public void testFirstLevelCache() {
        User user1 = userDao.findById(53);

        //session.clearCache();  //清空一级缓存

        /* //当调用 SqlSession 的修改，添加，删除，commit()，close()等方法时，也会清空一级缓存。
        User user = new User();
        user.setUserId(53);
        user.setUserName("lisi");
        user.setUserBirthday(new Date());
        user.setUserSex("F");
        userDao.updateUser(user);
         */

        User user2 = userDao.findById(53);

        System.out.println(user1 == user2);
    }

    public static void main(String[] args) throws IOException {
        //1.读取配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        //3.使用工厂生产SqlSession对象
        SqlSession session = factory.openSession();
        //4.使用SqlSession创建dao接口的代理对象
        IUserDao userDao = session.getMapper(IUserDao.class);
        //5.使用代理对象执行方法
        List<User> users = userDao.findAll();
        for (User user : users) {
            System.out.println(user);
        }
        //6.释放资源
        session.close();
        in.close();
    }
}
