/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab01_ProgFundamental;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        String[] filePathArr = { "src/Lab01/text1.txt", "src/Lab01/text2.txt", "src/Lab01/text3.txt", "src/Lab01/text4.txt" };
        String[] separatorArr = { ",", ", ", "; ", "\\d+" };
        Scanner sc;
        
        for (int i = 0; i < filePathArr.length; i++) {
            try {
                System.out.println("Text " + (i + 1) + "\n");
                sc = new Scanner(new FileReader(filePathArr[i]));
                int num = 0;
                boolean isText3 = filePathArr[i].equals("src/Lab01/text3.txt");
                System.out.println(isText3);
                while (sc.hasNextLine()) {
                    String line = sc.nextLine();
                    String[] items = line.split(separatorArr[i]);
                    for (int j = 0; j < items.length; j++) {
                        num += isText3 ? (items[j].length() - 1) : (items[j].length());
                        System.out.println(items[j] + " ");
                    }
                    System.out.println("");
                }
                System.out.println("Number of characters is: " + num + "\n");
                sc.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }
}