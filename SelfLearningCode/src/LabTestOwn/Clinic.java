/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabTestOwn;

/**
 *
 * @author firda
 */
public class Clinic {
    
    // main class
    public static void main(String[] args) {
        
//        Pet<Prescription> Prescription01 = new Pet<>();
        
        Clinic clinic1 = new Clinic ("Happy Animal Clinic");
        Vet worker = new Vet ("Abu Bakar", "DVM(India)");
        
        Cat cat01 = new Cat ("Dimmy", "Siamese", 5, "Diarrhae");
        Cat cat02 = new Cat ("Tabby", "British Shorthair", 6, "Worms");
        
        // display program
        System.out.println("Clinic: " + clinic1.clinicName);
        System.out.println("Vet on duty: " + worker.getName() + ", " + worker.getQualification());
        System.out.println("\n");
        
        System.out.println("Prescription Note");
        System.out.println("Name: " + cat02.getName());
        System.out.println("Breed: " + cat02.getBreed());
        System.out.println("Weight (KG): " + cat02.getWeight());
        System.out.println("Sickness: " + cat02.setSickness());
        
        // display the ArrayList
        Prescription01("Cat Object 1", "Tylosin", 5);
        
        System.out.println("\n");
        System.out.println("Prescription Note");
        System.out.println("Name: " + cat01.getName());
        System.out.println("Breed: " + cat01.getBreed());
        System.out.println("Weight (KG): " + cat01.getWeight());
        System.out.println("Sickness: " + cat01.setSickness());
        
        // display the ArrayList
        Prescription02("Cat Object 2", "Pyrantel", 3);
        
        System.out.println("\n");
        System.out.println(cat01.getWeight() > cat02.getWeight()? "Weight analysis: " + cat01.getName() + " is heavier than " + cat02.getName() : "Weight analysis: " + cat02.getName() + " is heavier than " + cat01.getName());
        
    }
    
    // 
    private String clinicName;
    
    public Clinic(String ClinicName) {
        this.clinicName = ClinicName;
    }
    
    private static <E, K, T> E Prescription01 (E Pet, K medication, E doses) {
        System.out.println("Medication: " + medication);
        System.out.println("Dosage: " + doses);
        
        return Pet;
    }
    
    private static <E, K, T> E Prescription02 (E Pet, K medication, E doses) {
        System.out.println("Medication: " + medication);
        System.out.println("Dosage: " + doses);
        
        return Pet;
    }
}
