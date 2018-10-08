package com.itheima.dao;

import com.itheima.domain.Account;

import java.util.List;

public interface AccountDao {

    public void saveAccount(Account account);

    List<Account>findAccount();
}
