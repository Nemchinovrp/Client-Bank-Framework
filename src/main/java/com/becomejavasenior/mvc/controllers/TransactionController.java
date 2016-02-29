package com.becomejavasenior.mvc.controllers;

import com.becomejavasenior.mvc.model.Account;
import com.becomejavasenior.mvc.model.Transaction;
import com.becomejavasenior.mvc.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/Transaction")
public class TransactionController {
    @Autowired
    private TransactionRepository transactionRepository;

    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {
        List<Transaction> transactions = transactionRepository.getAllTransaction();
        model.addAttribute("transactions", transactions);
        return "listTransaction";
    }

    @RequestMapping("/addTransactionForm")
    public String addTransactionForm(ModelMap model) {
        return "transaction";
    }

    @RequestMapping("/addTransaction")
    public String addTransaction(@ModelAttribute Transaction transaction) {
        transactionRepository.createTransaction(transaction);
        return "redirect:/Transaction";
    }

    @RequestMapping(value = "/deleteTransaction/{id}", method = RequestMethod.GET)
    public String deleteTransaction(@PathVariable Integer id) {
        transactionRepository.deleteTransaction(id);
        return "redirect:/Transaction";
    }
}
