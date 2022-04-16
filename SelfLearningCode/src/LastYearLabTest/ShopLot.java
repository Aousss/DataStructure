/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LastYearLabTest;

/**
 *
 * @author firda
 */
public class ShopLot {

    String ShopName;
    int ContactPerson;
    String EmployeeDetails;
    
    public static void main(String[] args) {
        
        Item("Burger", 10);
    }
    
    // create 'Person' class 
    // store information about contact person, employees (name + contact num)
    // contact number cannot be null
    private class Person {
        
    }
    
    // create generic 'Item'
    // accept 2 type parameter (items and price)
    private static <K, T> K Item (K ItemNames, T ItemPrice) {
        
        System.out.println("Menu: " + ItemNames + ", RM" + ItemPrice);
        
        return ItemNames;
    }
}
