/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;
import java.util.*;
/**
 *
 * @author Battl
 */
public class Manager {
    static ArrayList<Flight> flights = new ArrayList<Flight>();
    static ArrayList<Ticket> tickets = new ArrayList<Ticket>();
    public static void createFlights() {
        Scanner inp = new Scanner(System.in);
        System.out.println("How many new flights are there? ");
        int number = inp.nextInt();
        int flightNumber;
        String origin;
        String destination;
        String departureTime;
        int capacity;
        int numberOfSeatsLeft;
        double originalPrice;
        for (int i = 0; i < number; i ++) {
            System.out.println("\nFlight Number: ");
            flightNumber = inp.nextInt();
            System.out.println("\nOrigin: ");
            origin = inp.next();
            origin = inp.nextLine();
            System.out.println("\nDestination: ");
            destination = inp.next();
            destination = inp.nextLine();
            System.out.println("\nDeparture Time: ");
            departureTime = inp.next();
            departureTime = inp.nextLine();
            System.out.println("\nCapacity: ");
            capacity = inp.nextInt();
            System.out.println("\nOriginal Price: ");
            originalPrice = inp.nextDouble();
            flights.add(new Flight(flightNumber, origin, destination, departureTime, capacity, originalPrice));
        }
    }
    public static void displayAvailableFlights(String origin, String destination) {
        for (Flight f : flights)
            if (f.getOrigin() == origin && f.getDestination() == destination && f.getNumberOfSeatsLeft() > 0) {
                System.out.println(f);
            }
    }
    public static Flight getFlight(int flightNumber) {
        return flights.get(flightNumber);
    }
    public static void bookSeat(int flightNumber, Passenger p) {
        boolean booked = false;
        for (Flight f : flights) {
            if (f.getFlightNumber() == flightNumber) {
                booked = f.bookASeat();
            }
            if (booked == true) {
                booked = false;
                tickets.add(new Ticket(p, f, p.applyDiscount(f.getOringialPrice())));
                System.out.println("Your ticket has been booked for " + p.applyDiscount(f.getOringialPrice()));
            }
        }
    }
    public static void main (String[] args) {
        ArrayList<Passenger> passengers = new ArrayList<Passenger>();
        for (int i = 0; i < 10; i ++) {
            flights.add(new Flight(i, "tor", "don", i + "2/12/98 " + i + 5 + ":35", i + 1, (i + 1) * 100));
        }
        for (int i = 0; i < 10; i ++) {
            if (i % 2 == 0) {
                passengers.add(new Member("John", i + 1));
                bookSeat(i, passengers.get(i));
            }
            else {
                passengers.add(new NonMember("Jerry", i + 1));
                bookSeat(i, passengers.get(i));
            }
        }
        displayAvailableFlights("tor", "don");
        
        System.out.println(getFlight(0));
        System.out.println(getFlight(1));
        createFlights();
        /* input:
            2
            5
            don
            tor
            10/11/2022, 7:50
            50
            250
            6
            don
            tor
            10/12/2022, 9:50
            55
            300
        */
    }
}
