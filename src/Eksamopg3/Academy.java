package Eksamopg3;

import java.util.ArrayList;

public class Academy {
    private ArrayList<Student> students;
    private ArrayList<Course> courses;

    public Academy(ArrayList<Student> students, ArrayList<Course> courses){
        this.students = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    public void addStudent(Student student){
        if(!students.contains(student)){
            students.add(student);
        }
    }

    public void addCourse(Course course){
        if(!courses.contains(course)){
            courses.add(course);
        }
    }

    public void printDiploma(Student student){
        if(!students.contains(student)) {
            System.out.println("student not found");
            return;
        }

            System.out.println("Student: " + student.getName());
        // Gennemgå alle kurser, som studenten er tilmeldt, og udskriv kursusnavn og karakter
            for(String courseName : student.getCourses().keySet()) {
                int grade = student.getGrade(courseName);
                System.out.println("Course: " + courseName + " Grade: " + grade);
            }
                double average = student.calculateAverage();
                System.out.println("Average: " + average);
            }



    public int getHighest(int amount){
        return amount;
    }

    public int getLowestAmount(int amount) {
        return amount;
    }
}
