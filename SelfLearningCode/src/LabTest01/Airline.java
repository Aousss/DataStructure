/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabTest01;

/**
 *
 * @author firda
 */
public class Airline extends Account{
    
    private String airline_name;
    private String flight_number;
    
    public Airline(String airline_name, String flight_number, int user_id, String name, String email, String contact_number) {
        this.airline_name = airline_name;
        this.flight_number = flight_number;
        Airline.super.setUser_id(user_id);
        Airline.super.setName(name);
        Airline.super.setEmail(email);
        Airline.super.setContact_number(contact_number);
    }
    
    public String getAirline_name() {
        return airline_name;
    }

    public void setAirline_name(String airline_name) {
        this.airline_name = airline_name;
    }

    public String getFlight_number() {
        return flight_number;
    }

    public void setFlight_number(String flight_number) {
        this.flight_number = flight_number;
    }
    
    
}
