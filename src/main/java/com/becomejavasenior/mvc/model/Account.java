package com.becomejavasenior.mvc.model;


public class Account {
    private int id;
    private String accountType;
    private int idCurrency;
    private double balance;
    private int usersId;

    public Account(){

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
