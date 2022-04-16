/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab02_Generics;

/**
 *
 * @author firda
 */

// Q5
// create class FindMax
public class FindMax {
    
    // in main program 
    // create 3 different object of type array
    public static void main(String[] args) {
        
        // a - for integers values 1,2,3;
        Integer[] numbers = {1, 2, 3};
        System.out.println(max(numbers));
        
        // b - list of string stores red, green, blue
        String[] colours = {"red", "green", "blue"};
        System.out.println(max(colours));
        
        // c - circle radius 3, 2.9, 5.9
        Circle[] radius = {new Circle(3), new Circle(2.9), new Circle(5.9)};
        System.out.println(max(radius));
    }
    
    // circle class that use the Comparible interface
    // declare radius variable and a single parameterized constructor
    static class Circle implements Comparable<Circle> {
        double radius;
        
        public Circle(double radius) {
            this.radius = radius;
        }
        
        @Override
        public int compareTo(Circle o) {
            if(radius < o.radius)
                return -1;
            
            else if(radius == o.radius)
                return 0;
            
            else
                return 1;
        }
        
        @Override
        public String toString() {
            return "Circle radius: " + radius;
        }
        
    }
    
    public static <E extends Comparable<E>> E max(E[] list) {
        
        E max = list[0];
        
        // compareTo (String) - compare using alphabet order (a:smallest, z:largest)
        for(int i=1; i<list.length; i++) {
            if(max.compareTo(list[i]) < 0) {
                max = list[i];
            }
        }
        // return maximum values in an array
        return max;
    }
    
}
