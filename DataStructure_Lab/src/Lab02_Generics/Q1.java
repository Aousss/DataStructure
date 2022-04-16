/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab02_Generics;

/**
 *
 * @author firda
 */
public class Q1 {
    
    public static void main(String[] args) {

        StorePairGeneric<Integer> a = new StorePairGeneric<>(6,4);
        StorePairGeneric<Integer> b = new StorePairGeneric<>(2,2);
        StorePairGeneric<Integer> c = new StorePairGeneric<>(6,3);

        // compareTo Method

        System.out.println(a.compareTo(b)); // a>b, return 1
        System.out.println(a.compareTo(c)); // b<c, return 0
        System.out.println(b.compareTo(c)); // c==a, return -1

        System.out.println(a.equals(b)); // return false
        System.out.println(a.equals(c)); // return true
        System.out.println(b.equals(c)); // return false
    }
}
