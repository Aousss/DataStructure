/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab01_ProgFundamental;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        // Part 1
        Scanner input;
        try {
            // file path relative to project folder
            // Scanner way
            
            input = new Scanner(new FileReader("src/Lab01/Firdaus_U2001264.txt"));
            while(input.hasNextLine()) {
                String line = input.nextLine();
                System.out.println(line);
            }
            input.close();
        } catch (IOException e) {
            System.out.println(e);
        }
        
        // Part 2
        try {
            input = new Scanner(System.in);
            System.out.println("\nEnter your text here: ");
            String text = input.nextLine();
            
            PrintWriter p = new PrintWriter(new FileWriter("src/Lab01/Firdaus_U2001264.txt"));
            p.println();
            p.println("Thursday, 18 June 2021.");
            p.println();
            p.println(text);
            p.close();
            
            input.close();
            
            // Read from the file again
            input = new Scanner(new FileReader("src/Lab01/Firdaus_U2001264.txt"));
            System.out.println("The letter: ");
            while (input.hasNextLine()) {
                String line = input.nextLine();
                System.out.println(line);
            }
            
        } catch (IOException e) {
            System.out.println(e);
        }
        
    }
}