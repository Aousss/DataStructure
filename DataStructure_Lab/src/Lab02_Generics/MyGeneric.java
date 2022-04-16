/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab02_Generics;

/**
 *
 * @author firda
 */

// Q2
// create generic class called MyGeneric (accept 1 parameter)
// declare variable called e
public class MyGeneric<E> {     
    private E e;                
    
    // create no-arg constructor
    public MyGeneric() {}
    
    // create a constructor that accept 1 generic parameter
    public MyGeneric(E e) {
        this.e = e;
    }
    
    // create a setter and getter method for the generic type
    public void set(E e) {
        this.e = e;
    }
    
    public E get() {
        return e;
    }
    
    // create test program taht create 2 instances of generic class
    // String (strObj), Integer (intObj)
    public static void main(String[] args) {
        MyGeneric<String> strObj = new MyGeneric<>();
        MyGeneric<Integer> intObj = new MyGeneric<>();
        
        // set value for each objects
        strObj.set("Muhamad Firdaus");
        intObj.set(28);
        
        // display value using getter method
        System.out.println(strObj.get());
        System.out.println(intObj.get());
    }
}
