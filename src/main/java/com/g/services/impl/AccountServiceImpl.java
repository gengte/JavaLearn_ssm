package com.g.services.impl;

import com.g.domain.Account;
import com.g.services.IAccountService;

import java.util.List;

public class AccountServiceImpl implements IAccountService {
    public List<Account> findAll() {
        System.out.println("业务层：查询所有账户。。。");
        return null;
    }

    public void saveAccount(Account account) {
        System.out.println("业务层：保存账户。。。");

    }
}
