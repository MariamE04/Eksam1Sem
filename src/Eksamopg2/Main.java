package Eksamopg2;

import java.time.LocalDateTime;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BookingSystem system = new BookingSystem();

        Room room1 = new Room("Meeting room A", 10);
        Room room2 = new Room("Meeting room B",15);
        Room room3 = new Room("Meeting room C",20);

        system.addRoom(room1);
        system.addRoom(room2);
        system.addRoom(room3);

        User user = new User("Mariam");
        LocalDateTime start = LocalDateTime.of(2024,12,20,10,0);
        LocalDateTime end = LocalDateTime.of(2024, 12, 20, 12, 0);

        // Tjek og udskriv ledige rum
        printAvailableRooms(system, 10, start, end, "Available rooms before booking:");

        // Lav en booking
        Booking booking = system.book(system.getRooms().get(0), start, end, user); // Booker det første rum

        // Tjek og udskriv ledige rum igen
        printAvailableRooms(system, 10, start, end, "Available rooms after booking:");

        // Annuller bookingen
        system.cancel(booking);

        // Tjek og udskriv ledige rum igen
        printAvailableRooms(system, 10, start, end, "Available rooms after canceling:");
    }

    // Hjælpefunktion til at udskrive ledige rum
    private static void printAvailableRooms(BookingSystem system, int capacity, LocalDateTime start, LocalDateTime end, String message) {
        System.out.println("\n" + message);
        for (Room room : system.findAvailable(capacity, start, end)) {
            System.out.println(room.getName());
        }
    }
}

