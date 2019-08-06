package com.itheima.web.controller;

import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @RequestMapping("/listAccounts")
    public String listAccounts(Model model) {
        model.addAttribute("accounts", accountService.findAllAccounts());
        return "listAccounts";
    }

    @RequestMapping(path = "/addAccountUI",name = "转发到添加账户的页面")
    public String addAccountUI() {
        return "addAccount";
    }

    @RequestMapping(path = "/addAccount",name = "添加账户")
    public String addAccount(Account account) {
        accountService.saveAccount(account);
        return "redirect:/account/listAccounts";
    }

    @RequestMapping(path = "/editAccountUI",name = "转发到修改账户的页面")
    public String editAccountUI(Integer aid,Model model) {
        Account account= accountService.findAccountByaid(aid);
        model.addAttribute(account);
        return "edit";
    }

    @RequestMapping(path = "/editAccount",name = "保存修改的信息")
    public String editAccount(Account account) {
        accountService.updateAccount(account);
        return "redirect:/account/listAccounts";
    }

    @RequestMapping(path = "/delAccounts",name = "删除账户信息")
    public String delAccounts(Integer[] aids) {
        accountService.deleteAccounts(aids);
        return "redirect:/account/listAccounts";
    }
}
