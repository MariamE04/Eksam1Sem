package Eksamopg2;

public class Room {
    private int capacity;
    private String name;

    public Room(String name, int capacity) {
        this.capacity = capacity;
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getName() {
        return name;
    }
}

