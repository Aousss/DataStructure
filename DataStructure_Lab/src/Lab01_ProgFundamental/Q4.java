/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab01_ProgFundamental;

public class Q4 {
    public static void main(String[] args) {
        Account1 a = new Account1(1122, 1000, "George");
        a.setAnnualInterestRate(1.5);
        a.deposit(30);
        a.deposit(40);
        a.deposit(50);
        a.withdraw(5);
        a.withdraw(4);
        a.withdraw(2);
        
        System.out.println("Name: " + a.getName());
        System.out.println("Monthly interest rate: " + a.getMonthlyInterestRate());
        System.out.println("Balance: " + a.getBalance());
        System.out.println("Transaction History");
        for (Transaction t : a.getTransactions()) {
            System.out.println(t.toString());
        }
    }
}