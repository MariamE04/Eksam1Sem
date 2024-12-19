package Eksamopg2;

public class User {
    private String name;
    private int userID;
    private static int idCounter = 1;

    public User(String name) {
        this.name = name;
        this.userID = idCounter++;
    }

    public String getName() {
        return name;
    }
}

