package com.itheima.service;

import com.itheima.domain.Account;

import java.util.List;

public interface AccountService {
    public void saveAccount(Account account);

    List<Account> findAccount();
}
