package Ticket;

import java.util.ArrayList;
import java.util.List;

public class Admin {
	private double totalRevenue = 0;
    private List<Ticket> allTickets = new ArrayList<>();

    public void addTicket(Ticket t) {
        allTickets.add(t);
        totalRevenue += t.fare;
    }

    public void viewDailyReport() {
        System.out.println("\n===== DAILY REPORT =====");
        System.out.println("Total Tickets Sold : " + allTickets.size());
        System.out.println("Total Revenue (₹)  : " + totalRevenue);
        System.out.println("=========================\n");
    }
}
