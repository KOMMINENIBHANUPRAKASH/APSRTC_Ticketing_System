package Ticket;

public class User {
	String userId;
    String name;
    String userType; // Adult, Student, SeniorCitizen

    public User(String userId, String name, String userType) {
        this.userId = userId;
        this.name = name;
        this.userType = userType;
    }

    public void displayUser() {
        System.out.println("User ID   : " + userId);
        System.out.println("Name      : " + name);
        System.out.println("User Type : " + userType);
}
}
