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
public class Vet {
    
    // name and qualification of the practitioner
    private String name;
    private String qualification;
    
    // giveTreatment method that return nothing
    public static String giveTreatment(ArrayList<Prescription> Prescription) {
        for(int i=0; i<Prescription.size(); i++ ) {
            System.out.println(Prescription.get(i));
        }
        return null;
    }

    public Vet(String name, String qualification) {
        this.name = name;
        this.qualification = qualification;
    }

    public String getName() {
        return name;
    }

    public String getQualification() {
        return qualification;
    }
}
