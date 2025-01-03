//BookingSystem håndterer værelser, brugere og bookinger.
//BookingSystem-klassen er ansvarlig for at administrere alle mødelokaler, brugere og bookinger.
package Eksamopg2;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class BookingSystem {
    private List<Room> rooms;
    private List<Booking> bookings;
    private List<User> users;

    public BookingSystem() {
        this.rooms = new ArrayList<>();
        this.bookings = new ArrayList<>();
        this.users = new ArrayList<>();
    }

    // Returnerer listen af alle værelser i systemet.
    public List<Room> getRooms() {
        return rooms;
    }

    //Returnerer listen af alle bookinger i systemet.
    public List<Booking> getBookings() {
        return bookings;
    }

    //Tilføjer et værelse til systemet, null =  kastet en undtagelse
    public void addRoom(Room room) {
        if (room != null) {
            rooms.add(room);
        } else {
            throw new IllegalArgumentException("Room cannot be null.");
        }
    }

    //Tilføjer en bruger til systemet, null = kastet en undtagelse
    public void addUser(User user) {
        if (user != null) {
            users.add(user);
        } else {
            throw new IllegalArgumentException("User cannot be null.");
        }
    }

    //metode tjekker, om et værelse er tilgængeligt i den ønskede tidsperiode.
    public boolean isAvailable(Room room, LocalDateTime start, LocalDateTime end) {
        if (start.isAfter(end)) {
            throw new IllegalArgumentException("Start time must be before end time.");
        }

        for (Booking booking : bookings) {
            if (booking.getRoom().equals(room) &&
                    (start.isBefore(booking.getEnd()) && end.isAfter(booking.getStart()))) {
                return false;
            }
        }
        return true;
    }

    //søger efter værelser, der har den nødvendige kapacitet og er tilgængelige i den ønskede tidsperiode.
    public ArrayList<Room> findAvailable(int capacity, LocalDateTime start, LocalDateTime end) {
        ArrayList<Room> availableRooms = new ArrayList<>();
        for (Room room : rooms) {
            if (room.getCapacity() >= capacity && isAvailable(room, start, end)) {
                availableRooms.add(room);
            }
        }
        return availableRooms; //Den returnerer en liste af værelser, der opfylder kravene.
    }

    //metoden forsøger at oprette en booking for et værelse.
    public Booking book(Room room, LocalDateTime start, LocalDateTime end, User user) {
        if (start.isAfter(end)) {
            throw new IllegalArgumentException("Start time must be before end time.");
        }

        if (isAvailable(room, start, end)) {
            Booking newBooking = new Booking(room, user, start, end);
            bookings.add(newBooking);
            System.out.println("Booking created for user ID: " + user.getUserID());
            return newBooking;
        } else {
            throw new IllegalArgumentException("Room is not available for the given time.");
        }
    }

    //metoden fjerner en booking fra systemet.
    public void cancel(Booking booking) {
        if (bookings.contains(booking)) {
            bookings.remove(booking);
        } else {
            throw new IllegalArgumentException("Booking does not exist.");
        }
    }
}

