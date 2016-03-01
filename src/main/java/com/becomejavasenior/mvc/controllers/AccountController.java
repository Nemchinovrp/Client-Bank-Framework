package com.becomejavasenior.mvc.controllers;

import com.becomejavasenior.mvc.model.Account;
import com.becomejavasenior.mvc.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/Account")
public class AccountController {

    @Autowired
    private AccountRepository accountRepository;

    @RequestMapping(method = RequestMethod.GET)
    public String viewAllAccount(ModelMap model) {
        List<Account> accounts = accountRepository.getAllAccount();
        model.addAttribute("accounts", accounts);
        return "listAccount";
    }

    @RequestMapping("/addAccountForm")
    public String addAccountForm(ModelMap model) {
        return "account";
    }

    @RequestMapping("/addAccount")
    public String addAccount(@ModelAttribute Account account) {
        accountRepository.createAccount(account);
        return "redirect:/Account";
    }
    @RequestMapping(value = "/deleteAccount/{id}", method = RequestMethod.GET)
    public String deleteAccount(@PathVariable Integer id) {
        accountRepository.deleteAccount(id);
        return "redirect:/Account";
    }
}
