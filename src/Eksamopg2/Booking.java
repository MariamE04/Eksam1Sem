//Booking-klassen repræsenterer en reservation af et mødelokale
package Eksamopg2;

import java.time.LocalDateTime;

public class Booking {
    private Room room; //booket
    private User user; //foretaget bookingen
    private LocalDateTime start;
    private LocalDateTime end;

    public Booking(Room room, User user, LocalDateTime start, LocalDateTime end) {
        if (start.isAfter(end)) {
            throw new IllegalArgumentException("Start time must be before end time.");
        }
        this.room = room;
        this.user = user;
        this.start = start;
        this.end = end;
    }

    public Room getRoom() {
        return room;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public LocalDateTime getEnd() {
        return end;
    }
}


