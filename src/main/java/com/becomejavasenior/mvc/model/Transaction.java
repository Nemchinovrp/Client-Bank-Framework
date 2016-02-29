package com.becomejavasenior.mvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Transaction")
public class Transaction {
    @Id
    private int id;
    @Column(name = "id_account")
    private int idAccount;
    @Column(name = "operation")
    private String operation;
    @Column(name = "amount")
    private double amount;

    public Transaction(){

    }
    public Transaction(int id, int idAccount, String operation, double amount) {
        this.id = id;
        this.idAccount = idAccount;
        this.operation = operation;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(int id_account) {
        this.idAccount = id_account;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
