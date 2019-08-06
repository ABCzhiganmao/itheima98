package com.itheima.dao;

import com.itheima.domain.Account;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface AccountDao {
    List<Account> findAllAccounts();

    void saveAccount(Account account);

    Account findAccountByaid(Integer aid);

    void updateAccount(Account account);

    void deleteAccounts(Integer aid);
}
