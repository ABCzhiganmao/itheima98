package com.itheima.test;

import com.itheima.dao.AccountDao;
import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class test {
    @Test
    public void testFindAllAccounts() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = build.openSession();
        AccountDao accountDao = sqlSession.getMapper(AccountDao.class);
        List<Account> accounts = accountDao.findAllAccounts();
        for (Account account : accounts) {
            System.out.println(account);
        }
        sqlSession.close();
    }

    @Test
    public void test() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountService bean = ac.getBean(AccountService.class);
        List<Account> accounts = bean.findAllAccounts();
        for (Account account : accounts) {
            System.out.println(account);
        }

    }

}
