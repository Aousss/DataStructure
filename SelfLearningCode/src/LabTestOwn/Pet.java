/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabTestOwn;

/**
 *
 * @author firda
 */
public class Pet implements Comparable{
    
    // get breed, weight, and sickness of pets
    // set private = restricted access
    private String breed;
    private int weight;
    private String sickness;
    
    // getter method
    public String getBreed() {
        return breed;
    }
    
    public int getWeight() {
        return weight;
    }
    
    public String setSickness() {
        return sickness;
    }
    
    // setter method
    public void setBreed(String newBreed) {
        this.breed = newBreed;
    }
        
    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }
    
    public void setSickness(String newSickness) {
        this.sickness = newSickness;
    }

    // override method
    @Override
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
