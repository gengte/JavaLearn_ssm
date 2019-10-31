package com.g.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 账户web层
 */
@Controller
@RequestMapping("account")
public class AccountController {

    @RequestMapping("findAll")
    public String findAll(){
        return "list";
    }
}
