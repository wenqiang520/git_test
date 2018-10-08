package com.itheima.service.impl;

import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("accountService")
public class AccountServiceImpl  implements AccountService{
    public void saveAccount(Account account) {

    }

    public List<Account> findAccount() {
        System.out.println("查询所有");
        return null;
    }
}
