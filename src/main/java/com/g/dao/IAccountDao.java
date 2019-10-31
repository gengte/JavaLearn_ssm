package com.g.dao;

import com.g.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IAccountDao {

    @Select("select * from account")
    public List<Account> findAll();

    @Insert("insert into account (name,money) value (#{name},#{money})")
    public void saveAccount(Account account);
}
