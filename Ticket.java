package Ticket;

import java.util.Date;

public class Ticket {
	static int counter = 1000;
    String ticketId;
    String source;
    String destination;
    double distance;
    double fare;
    Date timeStamp;

    public Ticket(String source, String destination, double distance, double fare) {
        this.ticketId = "APS" + (++counter);
        this.source = source;
        this.destination = destination;
        this.distance = distance;
        this.fare = fare;
        this.timeStamp = new Date();
    }

    public void displayTicket() {
        System.out.println("\n----- APSRTC TICKET -----");
        System.out.println("Ticket ID     : " + ticketId);
        System.out.println("Source        : " + source);
        System.out.println("Destination   : " + destination);
        System.out.println("Distance (km) : " + distance);
        System.out.println("Fare (₹)      : " + fare);
        System.out.println("Time          : " + timeStamp);
        System.out.println("--------------------------\n");
    }
}
