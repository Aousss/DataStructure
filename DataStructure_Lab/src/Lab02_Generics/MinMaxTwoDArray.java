/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab02_Generics;

/**
 *
 * @author firda
 */

// Q6
// class called MinMaxTwoArray
// write 2 generic method
public class MinMaxTwoDArray {
    
    // 1st method: return minimum elements in 2-dimensional array
    public static <E extends Comparable<E>> E min(E[][] list) {
        
        E min = list[0][0];
        
        for(int i=0; i<list.length; i++) {
            for(int j=0; j<list[i].length; j++) {
                if(min.compareTo(list[i][j]) > 0) {
                    min = list[i][j];
                }
            }
        }
        return (E) ("Min is: " + min);
    }
    
    // 2nd method: return maximum elements in 2-dimensional array
    public static <E extends Comparable<E>> E max(E[][] list) {
        
        E max = list[0][0];
        
        for(int i=0; i<list.length; i++) {
            for(int j=0; j<list.length; j++) {
                if(max.compareTo(list[i][j]) < 0) {
                    max = list[i][j];
                }
            }
        }
        return (E) ("Max is: " + max);
    }
    
    // test program creates one instance of generic class of types integer
    public static void main(String[] args) {
        
        // integer called numbers with elements: {4, 5, 6}, {1, 2, 3}
        Integer[][] numbers = { {4, 5, 6}, {1, 2, 3} };
        
        // display min & max elements using methods
        System.out.println(min(numbers));
        System.out.println(max(numbers));
    }
}
