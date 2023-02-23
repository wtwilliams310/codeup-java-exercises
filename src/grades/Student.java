package grades;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    private String username;
//    private ArrayList<Integer> grades;




    public void setName(String name) {
        this.name = name;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public String getUsername() {
        return this.username;
    }

    //    public void setGrades(ArrayList<Integer> grades) {
//        this.grades = grades;
//    }


//    public ArrayList<Integer> getGrades() {
//        return this.grades;
//    }

    public String getName() {
        return name;
    }

    public void addGrade(int grade){
        grades.add(grade);

    }

    public double getGradeAverage() {
        double sum = 0;
        for(double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    public void display() {
        System.out.printf("""
                      Name: %s - GitHub Username: %s
                      Current Average: %f
                        """, getName(), getUsername(), getGradeAverage());
    }





}
