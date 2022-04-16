/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabTestOwn;

/**
 *
 * @author firda
 */
public class Cat extends Pet {
    
    // additional name variable 
    private String name;
    
    // to access the private method in Pet class
    public Cat(String name, String breed, int weight, String sickness) {
        this.name = name;
        Cat.super.setBreed(breed);
        Cat.super.setWeight(weight);
        Cat.super.setSickness(sickness);
    }
    
    // setter and getter for Cat's name
    public String getName() {
        return name;
    }
    
    public void setName(String newName) {
        this.name = newName;
    }
}
