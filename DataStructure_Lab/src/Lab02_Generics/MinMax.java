/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab02_Generics;

/**
 *
 * @author firda
 */

// Q4
// declaration and implemention of the genric method minmax()
// takes in an array of generic type and return a String
public class MinMax {
    public static <E extends Comparable<E>> String minmax(E[] array) {
        
        E min = array[0];
        E max = array[0];
        
        // using compareTo() method
        for(int i=0; i<array.length; i++) {
            if(min.compareTo(array[i])>0)
                min = array[i];
            if(max.compareTo(array[i])<0)
                max = array[i];
        }
        // return String with format given
        return "Min = " + min + " Max = " + max;
    }
    
    public static void main(String[] args) {
        
        Integer[] intArray = {5, 3, 7, 1, 4, 9,  8,  2};
        String[] strArray = {"red", "blue", "orange", "tan"};
        
        String intStr = minmax(intArray);
        System.out.println(intStr);
        
        String strStr = minmax(strArray);
        System.out.println(strStr);
    }
}
