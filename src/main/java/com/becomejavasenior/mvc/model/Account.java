package com.becomejavasenior.mvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Account")
public class Account {
    @Id
    private int id;
    @Column(name = "accountType")
    private String accountType;
    @Column(name = "id_currency")
    private int idCurrency;
    @Column(name = "balance")
    private double balance;
    @Column(name = "user_id")
    private int usersId;

    public Account() {

    }

    public Account(int id, String accountType, int idCurrency, double balance, int usersId) {
        this.id = id;
        this.accountType = accountType;
        this.idCurrency = idCurrency;
        this.balance = balance;
        this.usersId = usersId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public int getIdCurrency() {
        return idCurrency;
    }

    public void setIdCurrency(int idCurrency) {
        this.idCurrency = idCurrency;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getUsersId() {
        return usersId;
    }

    public void setUsersId(int usersId) {
        this.usersId = usersId;
    }
}
