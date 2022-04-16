/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tutorials02;

/**
 *
 * @author firda
 */

// T2_Q5
class Duo<A, B> {
    
    // must private because under generic class for certain classes
    private A first;
    private B second;
    
    // create constructor
    public Duo( A a, B b ) {
        first = a;
        second = b;
    }
}
