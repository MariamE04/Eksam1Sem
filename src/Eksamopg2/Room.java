package Eksamopg2;

public class Room {
    private String name;
    private int capacity;

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

