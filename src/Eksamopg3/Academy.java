//hovedadministratoren, der håndterer relationen mellem studerende og kurser.

package Eksamopg3;

import java.util.ArrayList;

public class Academy {
    private ArrayList<Student> students;
    private ArrayList<Course> courses;

    public Academy(ArrayList<Student> students, ArrayList<Course> courses){
        this.students = students;
        this.courses = courses;
    }

    //Tilføjer en studerende til akademiets liste (håndterer fejl)
    public void addStudent(Student student){
        if(!students.contains(student)){
            students.add(student);
        }
    }

    //Tilføjer et kursus til akademiets liste
    public void addCourse(Course course){
        if(!courses.contains(course)){
            courses.add(course);
        }
    }

    // formål at udskrive en diplomoversigt for en studerende.
    public void printDiploma(Student student){
        if(!students.contains(student)) { //kontrollere en betingelse.
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



    // Returner den højeste karakter blandt alle studerende
    public int getHighestGrade() {
        int highest = Integer.MIN_VALUE;  // Start med den laveste mulige værdi

        // Gennemgå hver student i listen
        for (Student student : students) {
            // Gennemgå hver kursus og karakter for studenten
            for (int grade : student.getCourses().values()) {
                // Hvis karakteren er højere end den nuværende højeste, opdater højeste
                if (grade > highest) {
                    highest = grade;
                }
            }
        }

        return highest;  // Returner den højeste karakter
    }

    // Returner den laveste karakter blandt alle studerende
    public int getLowestGrade() {
        int lowest = Integer.MAX_VALUE;  // Start med den højeste mulige værdi

        // Gennemgå hver student i listen
        for (Student student : students) {
            // Gennemgå hver kursus og karakter for studenten
            for (int grade : student.getCourses().values()) {
                // Hvis karakteren er lavere end den nuværende laveste, opdater laveste
                if (grade < lowest) {
                    lowest = grade;
                }
            }
        }

        return lowest;  // Returner den laveste karakter
    }

}
