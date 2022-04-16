/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Generics;

/**
 *
 * @author firda
 */
public class Printer <K> {
    
    K thingToPrint;
    
    public Printer(K thingToPrint) {
        this.thingToPrint = thingToPrint;
    }
    
    public void print() {
        System.out.println(thingToPrint);
    }
}