package Eksamopg3;

public class Course {
    private String courseName;
    //private int id;
    //private static int idCounter = 1;

    public Course(String courseName) {
        this.courseName = courseName;
        //this.id = idCounter++;
    }

    public String getCourseName() {
        return courseName;
    }

}
