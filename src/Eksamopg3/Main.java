package Eksamopg3;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> courses = new HashMap<>();
        courses.put("Dansk", 10);
        System.out.println(courses.get("Dansk"));
    }
}
