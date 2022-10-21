/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Battl
 */
public class Ticket {
    private Passenger passenger;
    private Flight flight;
    private double price;
    private int ticketNumber;
    private static int number = 1;
    
    public Ticket (Passenger p, Flight flight, double price) {
        passenger = p;
        this.flight = flight;
        this.price = price;
        ticketNumber = number;
        number ++;
    }
    
    public Passenger getPassenger () {
        return passenger;
    }
    public void setPassenger (Passenger p) {
        passenger = p;
    }
    
    public Flight getFlight () {
        return flight;
    }
    public void setFlight (Flight f) {
        flight = f;
    }
    
    public double getPrice () {
        return price;
    }
    public void setPrice (double p) {
        price = p;
    }
    
    public int getTicketNumber () {
        return ticketNumber;
    }
    public void setTicketNumber (int n) {
        ticketNumber = n;
    }
    
    public String toString() {
        return passenger.getName() + ", " + flight + ", " + price; 
    }
}
