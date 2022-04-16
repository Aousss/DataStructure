/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tutorials02;

/**
 *
 * @author firda
 */
public class MyArray {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5};
        String[] names = {"Jane", "Tom", "Bob"};
        Character[] alphabet = {'a', 'b', 'c'};
        
        MyArray.<Integer>print(numbers);
        MyArray.<String>print(names);
        MyArray.<Character>print(alphabet);
    }
    
    public static <E> void print(E[] list) {
        for (E list1 : list) {
            System.out.print(list1 + " ");
        }
            System.out.println();
    }
}
