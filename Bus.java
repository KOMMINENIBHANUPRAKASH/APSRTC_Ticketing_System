package Ticket;

public class Bus {
	String busNo;
    String routeNo;
    String conductorName;

    public Bus(String busNo, String routeNo, String conductorName) {
        this.busNo = busNo;
        this.routeNo = routeNo;
        this.conductorName = conductorName;
    }

    public void displayBus() {
        System.out.println("Bus No.       : " + busNo);
        System.out.println("Route No.     : " + routeNo);
        System.out.println("Conductor     : " + conductorName);
    }
}
