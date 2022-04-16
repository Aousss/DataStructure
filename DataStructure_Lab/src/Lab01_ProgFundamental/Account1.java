package Lab01_ProgFundamental;

import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author firda
 */
public class Account1 extends Account {
    private String name;
    private ArrayList<Transaction> transactions;
    
    public Account1(int id, double balance, String name) {
        super(id, balance);
        this.name = name;
        transactions = new ArrayList<>();
    }
    
    public String getName() {
        return name;
    }
    
    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }
    
    public void withdraw(double amount) {
        if (amount > getBalance()) {
            System.out.println("Amount is larger than balance.");
            return;
        }
        setBalance(getBalance() - amount);
        transactions.add(new Transaction('W', amount, getBalance(), "Withdrawal"));
    }
    
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        transactions.add(new Transaction('D', amount, getBalance(), "Deposit"));
    }
}
