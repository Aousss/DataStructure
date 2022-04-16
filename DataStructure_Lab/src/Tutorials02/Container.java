/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tutorials02;

/**
 *
 * @author firda
 */

public class Container<T> {
    
    // declare a private variable, t and type T
    private T t;
    
    // no-arg constructor
    public Container() {
        
    }
    
    public Container(T t) {
        this.t = t;
    }
    
    // method, add that returns nothing, accept a parameter
    public void add(T t) {
        this.t = t;
    }
    
    // method retrieve return t
    public T retreive() {
        return this.t;
    }
    
    public static void main(String[] args) {
        Container<String> a = new Container();
        Container<Integer> b = new Container<>();
        
        a.add("Muhamad Firdaus");
        b.add(28);
        
        System.out.println(a.retreive());
        System.out.println(b.retreive());
    }
}
