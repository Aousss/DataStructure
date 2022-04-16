/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab01_ProgFundamental;

import java.util.Date;

/**
 *
 * @author firda
 */
public class Account {
    private int id;
    private double balance, annualInterestRate;
    private Date dateCreated;
    
    public Account() {
        dateCreated = new Date();
        id = 0;
        balance = 0;
        annualInterestRate = 0;
    }
    
    public Account(int id, double balance) {
        dateCreated = new Date();
        this.id = id;
        this.balance = balance;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    
    public Date getDataCreated() {
        return dateCreated;
    }
    
    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }
    
    public double getMonthlyInterestRate() {
        return annualInterestRate / 100 / 12;
    }
    
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Amount is larger than balance.");
            return;
        }
        balance -= amount;
    }
    
    public void deposit(double amount) {
        balance += amount;
    }
}
