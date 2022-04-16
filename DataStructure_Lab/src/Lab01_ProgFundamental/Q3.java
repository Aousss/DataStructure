    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab01_ProgFundamental;

public class Q3 {
    public static void main(String[] args) {
        Account a = new Account(1122, 20000);
        a.setAnnualInterestRate(4.5);
        a.withdraw(2500);
        a.deposit(3000);
        System.out.println(a.getBalance());
        System.out.println(a.getMonthlyInterestRate());
        System.out.println(a.getDataCreated());
    }
}
