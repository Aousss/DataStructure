/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Generics;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author firda
 */

// berdasarkan Printer.java file
public class GenericExample {
    
    public static void main(String[] args) {
        
        // hanya tukar dalam <> untuk print integer/double
        
        Printer<Integer> Printer = new Printer<>(23);
        Printer.print();
        
        Printer<Double> DoublePrinter = new Printer<>(23.332);
        DoublePrinter.print();

        // utk private class dibawah (boleh jadi apa shj smd integer, char,...)
        shout("Jaki", 78);
        shout("Hello World", 888);
        
        
        //utk private printList dibawah
        List<Integer> intList = new ArrayList<>(56);
        intList.add(3);
        printList(intList);
        
        List<Cat> catList = new ArrayList<>();
        catList.add(new Cat() );
        printList(catList);
    }
    
    private static <K, V> K shout (K thingToShout, V otherThingToShout) {
        System.out.println(thingToShout + "!!!");
        System.out.println(otherThingToShout + "!!!");
        
        return thingToShout;
    }
    
    // <?> adalah master simbol utk anything
    private static void printList(List<?> myList) {
        System.out.println();
    }
}
