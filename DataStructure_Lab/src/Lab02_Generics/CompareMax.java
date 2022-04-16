/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab02_Generics;

/**
 *
 * @author firda
 */

// Q3
public class CompareMax {
    
    // create generic static method called maximum
    // the generic type extends the Caparable interface, recieve 3 parameter
    public static <T extends Comparable<T>> T maximum(T a, T b, T c){
        
        T max = a; // assume a initially the largest
        if(b.compareTo(max) > 0) {
            max = b; // b will be the largest
        }
        
        if(c.compareTo(max) > 0) {
            max = c; // c will be the largest
        }
        return max; // return to the max/largest
    }
    
    // find maximum 3 values invoked by main method
    public static void main(String[] args) {
        System.out.printf("Max of %d, %d and %d is %d\n", 1,2,3, maximum(1,2,3));
        
        System.out.printf("Max of %.1f, %.1f and %.1f is %.1f\n", 1.0, 4.9, 3.5, maximum(1.0, 4.9, 3.5));
        
        System.out.printf("Max of %s, %s and %s is %s\n", "Students", "Lectures", "Staff", maximum("Students", "Lectures", "Staff"));
    }
}