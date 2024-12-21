package Eksamopg3;

import java.util.HashMap;

public class Student {
    private String name;
    private HashMap<String, Integer> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new HashMap<>();
    }

    public boolean addCourse(String course, int grade) {
        if (courses.containsKey(course)) {
            return false; // Kursus findes allerede
        }
        if (isGradeValid(grade)) {
            courses.put(course, grade); // Tilføj kursus og karakter
            return true;
        }
        return false; // Ugyldig karakter
    }

    private boolean isGradeValid(int grade) {
        return grade == -3 || grade == 0 || grade == 2 || grade == 4 || grade == 7 || grade == 10 || grade == 12;
    }

    public Integer getGrade(String courseName) {
        return courses.get(courseName); // Hent karakter for kursusnavn
    }

    public double calculateAverage() {
        if (courses.isEmpty()) {
            return 0.0; // Ingen kurser
        }
        double sum = 0;
        for (int grade : courses.values()) {
            sum += grade;
        }
        return sum / courses.size(); // Beregn gennemsnit
    }

    public String getName() {
        return name;
    }

    public HashMap<String, Integer> getCourses() {
        return new HashMap<>(courses); // Returnér en kopi
    }
}
