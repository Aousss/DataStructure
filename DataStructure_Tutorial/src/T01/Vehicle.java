/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T01;

/**
 *
 * @author firda
 */
public abstract class Vehicle {
    private double maxSpeed;
    protected double currentSpeed;
    
    Vehicle(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    
    public abstract void accelerate();
    public double getCurrentSpeed() {
        return currentSpeed;
    }
    
    public double getMaxSpeed() {
        return maxSpeed;
    }
    
    public void pedalToTheMatal() {
        while(currentSpeed < maxSpeed)
            accelerate();
    }
}
