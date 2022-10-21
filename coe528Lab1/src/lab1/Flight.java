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
public class Flight {
    private int flightNumber;
    private String origin;
    private String destination;
    private String departureTime;
    private int capacity;
    private int numberOfSeatsLeft;
    private double originalPrice;
    
    public Flight (int fn, String org, String dest, String dept, int cap, double orgp) {
        if (org == dest) {
            throw new IllegalArgumentException("Origin and Destination are the same");
        }
        flightNumber = fn;
        origin = org;
        destination = dest;
        departureTime = dept;
        numberOfSeatsLeft = cap;
        capacity = cap;
        originalPrice = orgp;
    }
    
    public int getFlightNumber() {
        return flightNumber;
    }
    public void setFlightNumber(int fn) {
        flightNumber = fn;
    }
    
    public String getOrigin() {
        return origin;
    } 
    public void setOrigin(String org) {
        origin = org;
    } 
    
    public String getDestination() {
        return destination;
    }
    public void setDestination(String dest) {
        destination = dest;
    }
    
    public String getDepartureTime() {
        return departureTime;
    }
    public void setDepartureTime(String dept) {
        departureTime = dept;
    }
    
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int cap) {
        capacity = cap;
    }
    
    public int getNumberOfSeatsLeft() {
        return numberOfSeatsLeft;
    }
    public void setNumberOfSeatsLeft(int nosl) {
        numberOfSeatsLeft = nosl;
    }
    
    public double getOringialPrice() {
        return originalPrice;
    }
    public void setOriginalPrice(double orgp) {
        originalPrice = orgp;
    }
    
    public boolean bookASeat() {
        if (numberOfSeatsLeft > 0) {
            numberOfSeatsLeft --;
            return true;
        }
        return false;
    }
    
    @Override
    public String toString() {
        return "Flight " + flightNumber + ", " + origin + " to " + destination + ", " + departureTime + ", original price: $" + originalPrice; 
    }
}
