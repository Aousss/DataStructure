/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabTest01;

/**
 *
 * @author firda
 */
public class Airport {
    
    public static void main(String[] args) {
        
        // Passanger information (airline name, airline num, user id, name, email, contact num)
        Airline one = new Airline ("ANA – All Nippon Airways", "NH804", 1001, "Amy", "amy@gmail.com", "012-9887765");
        Airline two = new Airline ("Singapore Airlines", "SQ103", 1002, "Jessica", "jessica@gmail.com", "019-2562398");
        Airline three = new Airline ("Malaysia Airlines", "MH104", 1003, "Brandon", "brandon@gmail.com", "018-3234546");
        
        // Passenger information (flight_class, item_menu, flight_price, item_price)
        Flight one1 = new Flight ("Economy", "Deep Fried Chicken Don", 3932, 25);
        Flight two2 = new Flight ("Economy", "Egg Sandwiches", 5476, 12);
        Flight three3 = new Flight ("Bussiness", "Chinese Roasted Duck with Rice", 14210, 39);
        
        
        // Print the information
        System.out.println("Airline Name: " + one.getAirline_name());
        
        System.out.println("\nPassenger Info: ");
        
        // First passenger
        System.out.println("User ID: " + one.getUser_id());
        System.out.println("Name: " + one.getName());
        System.out.println("Email: " + one.getEmail());
        System.out.println("Contact Num: " + one.getContact_number());
        
        System.out.println("[Item Name: " + one1.flight);
        System.out.println("Item Price: RM" + one1.priceflight + "]");
        System.out.println("[Item Name: " + one1.meal);
        System.out.println("Item Price: RM" + one1.pricemeal + "]");
        
        // Second passenger
        System.out.println("\n\nUser ID: " + two.getUser_id());
        System.out.println("Name: " + two.getName());
        System.out.println("Email: " + two.getEmail());
        System.out.println("Contact Num: " + two.getContact_number());
        
        System.out.println("[Item Name: " + two2.flight);
        System.out.println("Item Price: RM" + two2.priceflight + "]");
        System.out.println("[Item Name: " + two2.meal);
        System.out.println("Item Price: RM" + two2.pricemeal + "]");
        
        // Third passenger
        System.out.println("\n\nUser ID: " + three.getUser_id());
        System.out.println("Name: " + three.getName());
        System.out.println("Email: " + three.getEmail());
        System.out.println("Contact Num: " + three.getContact_number());
        
        System.out.println("[Item Name: " + three3.flight);
        System.out.println("Item Price: RM" + three3.priceflight + "]");
        System.out.println("[Item Name: " + three3.meal);
        System.out.println("Item Price: RM" + three3.pricemeal + "]");
        
        System.out.println("\nFlight Malaysia Airline has a larger cabin crew than Flight ANA");
        
        if(one1.priceflight > two2.priceflight && one1.priceflight > three3.priceflight) {
            System.out.println("The most expensive flight ticket is RM "+ one1.priceflight);
        }
        
        else if(two2.priceflight > three3.priceflight && two2.priceflight > one1.priceflight) {
            System.out.println("The most expensive flight ticket is RM "+ two2.priceflight);
        }
        
        else if(three3.priceflight > one1.priceflight && three3.priceflight > two2.priceflight) {
            System.out.println("The most expensive flight ticket is RM "+ three3.priceflight);
        }
    }
}
