package Ticket;

import java.util.Scanner;
import java.util.UUID;

public class APSRTCTicketingSystem {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Admin admin = new Admin();

        System.out.println("===== APSRTC CITY BUS TICKETING =====\n");

        System.out.print("Enter Passenger Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Passenger Type (Adult / Child / SeniorCitizen): ");
        String type = sc.nextLine();

        User user = new User(UUID.randomUUID().toString().substring(0, 6), name, type);

        System.out.print("Enter Source: ");
        String source = sc.nextLine();

        System.out.print("Enter Destination: ");
        String destination = sc.nextLine();

        System.out.print("Enter Distance (in km): ");
        double distance = sc.nextDouble();

        double fare = FareCalculator.calculateFare(distance, type);

        Ticket ticket = new Ticket(source, destination, distance, fare);
        admin.addTicket(ticket);

        System.out.println("\n✅ Ticket Booked Successfully!\n");

        user.displayUser();
        ticket.displayTicket();

        Bus bus = new Bus("AP05BX1234", "36D", "Ramesh");
        bus.displayBus();

        admin.viewDailyReport();

        System.out.println("Thank you for using APSRTC City Bus Ticketing System!");
        sc.close();
    }
}
