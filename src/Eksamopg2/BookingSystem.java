package Eksamopg2;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class BookingSystem {
    List<Room> rooms;
    List<Booking> bookings;

    public BookingSystem() {
        this.rooms = new ArrayList<>();  // Initialiserer rooms
        this.bookings = new ArrayList<>();  // Initialiserer bookings
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void addRoom(Room room) {
        if (room != null) {
            rooms.add(room);
        } else {
            throw new IllegalArgumentException("Room cannot be null.");
        }
    }


    public boolean isAvailable(Room room, LocalDateTime start, LocalDateTime end) {
        for (Booking booking : bookings) {
            if (booking.getRoom().equals(room) &&
                    (start.isBefore(booking.getEnd()) && end.isAfter(booking.getStart()))) {
                // Tjekker om tiderne overlapper
                return false;
            }
        }
        return true;
    }

    public ArrayList<Room> findAvailable(int capacity, LocalDateTime start, LocalDateTime end ){
            ArrayList<Room> availableRooms = new ArrayList<>();
            for(Room room : rooms){
                if(room.getCapacity() >= capacity && isAvailable(room, start, end)){
                    availableRooms.add(room);
                }
            }
            return availableRooms;
     }

     public  Booking book(Room room, LocalDateTime start, LocalDateTime end, User user) {
         if (isAvailable(room, start, end)) {  // Tjekker om rummet er ledigt
             Booking newBooking = new Booking(room, user, start, end);  // Opretter en ny booking
             bookings.add(newBooking);     // Tilføjer bookingen til listen over eksisterende bookinger
             return newBooking;
         } else {
             throw new IllegalArgumentException("Room is not available for the given time."); // Kaster en undtagelse
            }
         }

    public void cancel(Booking booking) {
        if (bookings.contains(booking)) {
            bookings.remove(booking);
            System.out.println("Booking successfully canceled.");
        } else {
            throw new IllegalArgumentException("Booking does not exist.");
        }
    }
}
