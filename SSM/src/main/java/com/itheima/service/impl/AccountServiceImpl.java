package com.itheima.service.impl;

import com.itheima.dao.AccountDao;
import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public List<Account> findAllAccounts() {
        List<Account> list = accountDao.findAllAccounts();
        return list;
    }

    public void saveAccount(Account account) {
        accountDao.saveAccount(account);
    }

    @Transactional(propagation = Propagation.SUPPORTS ,readOnly = true)
    public Account findAccountByaid(Integer aid) {
        return accountDao.findAccountByaid(aid);
    }

    public void updateAccount(Account account) {
        accountDao.updateAccount(account);
    }

    public void deleteAccounts(Integer[] aids) {
        for (Integer aid : aids) {
            accountDao.deleteAccounts(aid);
        }

    }
}
