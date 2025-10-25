package Ticket;

public class FareCalculator {
	public static double calculateFare(double distance, String userType) {
        double baseRate = 3.0; // ₹3 per km
        double fare = distance * baseRate;

        switch (userType.toLowerCase()) {
            case "student":
                fare *= 0.8; // 20% discount
                break;
            case "seniorcitizen":
                fare *= 0.7; // 30% discount
                break;
            default:
                break;
        }
        return fare;
    }
}
