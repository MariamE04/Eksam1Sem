package Eksamopg3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Opret en tom liste til studerende og kurser
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Course> courses = new ArrayList<>();

        // Opret akademiet
        Academy academy = new Academy(students,courses);

        // Opret studerende
        Student student1 = new Student("Mariam");
        Student student2 = new Student("Maja");

        // Opret kurser
        Course course1 = new Course("Datamatikker1sem");
        Course course3 = new Course("MatematikA");
        Course course2 = new Course("EngelskB");

        // Tilføj kurser til akademiet
        academy.addCourse(course3);
        academy.addCourse(course1);
        academy.addCourse(course2);

        // Tilmeld studerende kurser
        student1.addCourse(course1.getCourseName(),7);
        student1.addCourse(course3.getCourseName(),12);
        student2.addCourse(course2.getCourseName(),10);

        // Tilføj studerende til akademiet
        academy.addStudent(student1);
        academy.addStudent(student2);

        // Udskriv diplom for studerende
        academy.printDiploma(student1);
        System.out.println("---------------------");
        academy.printDiploma(student2);

        // Udskriv den højeste og laveste karakter
        System.out.println("--------------------------");
        System.out.println("Lowest and highest grade:");
        System.out.println("Highest grade: " + academy.gethighestGrade());
        System.out.println("Lowest grade: " + academy.getLowestGrade());
    }
}
