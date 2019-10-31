package com.g.test;

import com.g.dao.IAccountDao;
import com.g.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class TestMyBatis {
    @Test
    public void run1() throws Exception {
        //加载配置文件
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        //SqlSession对象
        SqlSession sqlSession = factory.openSession();
        //获取代理对象
        IAccountDao mapper = sqlSession.getMapper(IAccountDao.class);
        List<Account> all = mapper.findAll();
        for (Account account:all)
            System.out.println(account);
        //释放资源
        sqlSession.close();
        inputStream.close();
    }

    @Test
    public void run2() throws Exception {
        //加载配置文件
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        //SqlSession对象
        SqlSession sqlSession = factory.openSession();
        //获取代理对象
        IAccountDao mapper = sqlSession.getMapper(IAccountDao.class);
        Account newAccount = new Account();
        newAccount.setName("zhaoliu");
        newAccount.setMoney(90d);
        mapper.saveAccount(newAccount);
        //提交事务
        sqlSession.commit();
        //释放资源
        sqlSession.close();
        inputStream.close();
    }
}
