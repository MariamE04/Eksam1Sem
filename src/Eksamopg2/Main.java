// Main-klassen fungerer som testklassen, hvor jeg demonstrerer systemets funktioner

package Eksamopg2;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        BookingSystem system = new BookingSystem();

        // Tilføj rum
        Room room1 = new Room("Meeting room A", 10);
        Room room2 = new Room("Meeting room B", 15);
        Room room3 = new Room("Meeting room C", 20);
        Room room4 = new Room("Meeting room d",10);

        system.addRoom(room1);
        system.addRoom(room2);
        system.addRoom(room3);
        system.addRoom(room4);

        // Tilføj brugere
        User user1 = new User("Mariam");
        User user2 = new User("John");

        system.addUser(user1);
        system.addUser(user2);

        // Booking-tidsrum
        LocalDateTime start = LocalDateTime.of(2024, 12, 20, 10, 0);
        LocalDateTime end = LocalDateTime.of(2024, 12, 20, 12, 0);

        // Tjek og udskriv ledige rum
        printAvailableRooms(system, 10, start, end, "Available rooms before booking:");

        // Lav en booking
        try {
            Booking booking = system.book(system.getRooms().get(0), start, end, user1);
            System.out.println("Booking created successfully: " + booking.getRoom().getName());
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }

        // Tjek og udskriv ledige rum igen
        printAvailableRooms(system, 10, start, end, "Available rooms after booking:");

        // Annuller bookingen
        try {
            system.cancel(system.getBookings().get(0));
            System.out.println("Booking canceled successfully.");
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }

        // Tjek og udskriv ledige rum igen
        printAvailableRooms(system, 10, start, end, "Available rooms after canceling:");
    }

    private static void printAvailableRooms(BookingSystem system, int capacity, LocalDateTime start, LocalDateTime end, String message) {
        System.out.println("\n" + message);
        for (Room room : system.findAvailable(capacity, start, end)) {
            System.out.println(room.getName());
        }
    }
}


