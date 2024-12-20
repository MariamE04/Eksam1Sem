package Eksamopg3;

import java.util.HashMap;

public class Student {
    private String name;
    private HashMap<String, Integer> courses;
    //nøglen (String) navnet på kurset
    //værdien (Integer) er karakteren.

    public Student(String name) {
        this.name = name;
        this.courses = new HashMap<>(); //En tom HashMap (courses) oprettes -holde styr på (kurser, karakterer)
    }
    public boolean addCourse(String course, int grade) {
        // Check om kurset allerede er tilføjet
        if (courses.containsKey(course)) {
            return false; // Kursus kan ikke tilføjes to gange
        }

        // Check om karakteren er gyldig
        if (isGradeValid(grade)) {
            courses.put(course, grade); // Tilføj kursus og karakter
            return true;
        }

        return false; // Hvis karakteren ikke er gyldig
    }
    private boolean isGradeValid(int grade) {
        return grade == -3 || grade == 0 || grade == 2 || grade == 4 ||
                grade == 7 || grade == 10 || grade == 12;
    }

    public Integer getGrade(String course) {
        return courses.get(course); // Returner karakteren, eller null hvis kurset ikke findes
    }

    public double calculateAverage() {
        if (courses.isEmpty()) {
            return 0.0; // Hvis der ikke er kurser
        }

        double sum = 0;
        for (int grade : courses.values()) {
            sum += grade;
        }
        //Går gennem alle karakterer i courses ved at bruge courses.values(), og lægger dem sammen.

        return sum / courses.size();
        //Dividerer summen af karakterer med antallet af kurser for at få gennemsnittet.
    }
}
