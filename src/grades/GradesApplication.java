package grades;

import java.util.*;

import util.Input;

public class GradesApplication {


    public static Map<String, Student> informationStudent(){
        Student student1 = new Student("Titus");
        student1.setUsername("titusProgrammer76");
        student1.addGrade(95);
        student1.addGrade(100);
        student1.addGrade(90);
        student1.addGrade(85);

        Student student2 = new Student("Hung");
        student2.setUsername("hungSungHero87");
        student2.addGrade(80);
        student2.addGrade(80);
        student2.addGrade(95);
        student2.addGrade(95);


        Student student3 = new Student("Horace");
        student3.setUsername("lostInTheForestHorace22");
        student3.addGrade(80);
        student3.addGrade(80);
        student3.addGrade(90);
        student3.addGrade(90);

        Student student4 = new Student("Leo");
        student4.setUsername("theDillioLeo23");
        student4.addGrade(90);
        student4.addGrade(90);
        student4.addGrade(85);
        student4.addGrade(95);

        Map<String, Student> students = new HashMap<>();


        students.put(student1.getUsername(),student1);
        students.put(student2.getUsername(),student2);
        students.put(student3.getUsername(),student3);
        students.put(student4.getUsername(),student4);

        return students;
    }

    public static void showUsernames(List<String> usernames) {
        System.out.print("Here are the GitHub usernames of our students:\n\n");
        String listUsernames = "";
        for(String username : usernames){
            listUsernames += String.format("|%s| ", username);
        }
        System.out.print(listUsernames + "\n");
    }

    public static void userChoice(String result, Student student, Map<String, Student> students){
        Input input = new Input();
        System.out.print("\nWould you like to see another student? [y/n]\n");
        String seeAnotherStudent = input.getString();
        if(seeAnotherStudent.equalsIgnoreCase("y")) {
            System.out.print("\nWhat student would you like to see more information on?\n");
            result = input.getString();
            student = students.get(result);
            showUserInfo(student, result);
            userChoice(result, student, students);
        }
         else if (seeAnotherStudent.equalsIgnoreCase("n")){
            System.out.print("Goodbye, and have a wonderful day!");
        } else {
             userChoice(result, student, students);
        }
    }

    public static void showUserInfo(Student student, String userInput){
        if(student != null){
        System.out.printf("""
                
                Name: %s - Github Username: %s
                Current Average: %f        
                """, student.getName(), student.getUsername(), student.getGradeAverage());
        } else {
            System.out.printf("Sorry, no student found with the  Github username of \"%s\".", userInput);
        }
    }


    public static void main(String[] args) {

        Map<String, Student> students = informationStudent();

        List<String> usernames = new ArrayList<>(students.keySet());

        System.out.print("Welcome!\n\n");
        showUsernames(usernames);

        System.out.println("\nWhat student would you like to see more information on?\n");
        Input input = new Input();
        String result = input.getString();
        Student student = students.get(result);

        showUserInfo(student, result);

        userChoice(result, student, students);














//        Set<Map.Entry<String, Student>> entries = students.entrySet();
//
//        System.out.print("Welcome!\n\n");
//        System.out.print("Here are the GitHub usernames of our students:\n\n");
//
//        for(Map.Entry<String, Student> stu : entries) {
//                System.out.printf("|%s| ", stu.getKey());
//        }
//        System.out.println("\n");
//
//        System.out.print("What student would you like to see more information on?\n\n");
//
//        Input userInput = new Input();
//
//        String response = userInput.getString();
//
//        System.out.print("\n");
//
//
//
//        for(Map.Entry<String, Student> stu : entries) {
//            if(stu.getKey().equals(response)){
//                Student allStudents = stu.getValue();
//                allStudents.display();
//            }
//
//        }





//        System.out.println(students.keySet());

//        for(Map.Entry<String, Student> stu : entries) {
//            if(stu.getKey().equals("hungSungHero87")){
//                System.out.println(stu.getKey());
//                Student allStudents = stu.getValue();
//                allStudents.display();
//            }
//
//        }

    }
}
