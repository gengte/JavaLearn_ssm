package com.g.controller;

import com.g.domain.Account;
import com.g.services.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
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
    public String findAll(Model model) {
        System.out.println("表现层：查询所有账户。。。");
        List<Account> all = accountService.findAll();
        model.addAttribute("list", all);
        return "list";
    }

    @RequestMapping("saveAccount")
    public void saveAccount(Account account, HttpServletRequest req, HttpServletResponse res) throws IOException {
        System.out.println("表现层：保存账户。。。");
        accountService.saveAccount(account);
        res.sendRedirect(req.getContextPath()+"/account/findAll");
    }
}
