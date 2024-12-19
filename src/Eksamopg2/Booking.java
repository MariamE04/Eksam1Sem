package Eksamopg2;

import java.time.LocalDateTime;

public class Booking {
    private Room room;
    private User user;
    private LocalDateTime start;
    private LocalDateTime end;

    public Booking(Room room, User user, LocalDateTime start, LocalDateTime end) {
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

