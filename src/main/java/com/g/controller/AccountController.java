package com.g.controller;

import com.g.domain.Account;
import com.g.services.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 账户web层
 */
@Controller
@RequestMapping("account")
public class AccountController {

    @Autowired
    private IAccountService accountService;

    @RequestMapping("findAll")
    public String findAll() {
        System.out.println("表现层：查询所有账户。。。");
        List<Account> all = accountService.findAll();
        return "list";
    }
}
