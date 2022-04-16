/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabTestOwn;

import java.util.ArrayList;

/**
 *
 * @author firda
 */
public class Prescription<E extends Pet, K, T> {
    
//    ArrayList<String> medication = new ArrayList<>();
//    ArrayList<Integer> dosage = new ArrayList<>();
   
//    private<E> void medication(String medicine) {
//        medication.add(medicine);
//    }
//    
//    private<E> void dosage(Integer dos) {
//        dosage.add(dos);
//    }
      
    public K medication;
    public T doses;
    
    public Prescription(E Pet, K medication, T doses) {
        
        this.medication = medication;
        this.doses = doses;
    }
    
    void store(String cat_Object_1, String tylosin, int i) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
