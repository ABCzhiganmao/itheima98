package com.itheima.service;

import com.itheima.domain.Account;

import java.util.List;

public interface AccountService {
    List<Account> findAllAccounts();

    void saveAccount(Account account);

    Account findAccountByaid(Integer aid);

    void updateAccount(Account account);

    void deleteAccounts(Integer[] aids);
}
