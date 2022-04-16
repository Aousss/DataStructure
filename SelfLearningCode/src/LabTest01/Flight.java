/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabTest01;

/**
 *
 * @author firda
 */
public class Flight {
    
    public String flight;
    public String meal;
    public int priceflight;
    public int pricemeal;

    public Flight() {
    }

    public Flight(String flight, String meal, int priceflight, int pricemeal) {
        this.flight = flight;
        this.meal = meal;
        this.priceflight = priceflight;
        this.pricemeal = pricemeal;
    }
    
    

    public Flight(String flight, String meal) {
        this.flight = flight;
        this.meal = meal;
    }
    
    
}
