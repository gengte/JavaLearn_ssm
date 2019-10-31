package com.g.dao;

import com.g.domain.Account;

import java.util.List;

public interface IAccountDao {

    public List<Account> findAll();

    public void saveAccount(Account account);
}
