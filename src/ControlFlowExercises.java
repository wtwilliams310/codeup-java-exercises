import java.awt.*;
import java.math.BigInteger;
import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Loop Basics
        // 1 a.
//        int i = 5;
//
//        while (i <= 15) {
//            System.out.printf("%d ",i);
//            i++;
//        }

        // 1.b.i

//        int x = 0;
//
//        do {
//            x += 2;
//
//            System.out.println(x);
//
//        } while (x < 100);

        //1.b.ii
//        int x = 100;
//
//        do {
//           System.out.println(x);
//            x -= 5;
//
//        } while (x >= -10);

        // 1.b.iii

//        long x = 2;
//
//
//
//        do {
//            System.out.println(x);
//            x *= x;
//        } while(x < 1e6);

        //1.b.v.
//        int i;
//        for(i = 100; i >= -10; i -= 5 ) {
//            System.out.println(i);
//        }
//
//        for(long x = 2; x < 1e6; x *= x) {
//            System.out.println(x);
//        }

        //2. FizzBuzz

//        int i = 1;
//
//        for(i = 1; i <= 100; i++) {
//            if(i % 3 == 0 && i % 5 == 0){
//                System.out.printf("FizzBuzz%n");
//            } else if(i % 5 == 0 && i % 3 != 0){
//                System.out.printf("Buzz%n");
//
//
//            } else if(i % 3 == 0 && i % 5 != 0){
//                System.out.printf("Fizz%n");
//
//            } else {
//                System.out.println(i);
//
//            }
//
//
//        }
        // #3 Display a table of powers
//        int i;
//        boolean confirmation;
//
//        do {
//            System.out.print("Enter an integer: ");
//            int input= scanner.nextInt();
//            for(i = 1; i <= input; i++) {
//                int result = i * i;
//                int cubed = result * i;
//                if(i == 1){
//                    System.out.printf("Here is your table!%n" +
//                            "%n" +
//                            "number | squared | cubed" +
//                            "%n------ | ------- | ------%n" +
//                            "%s      | %s       | %s%n", i, result, cubed);
//
//
//                } else if(i > 1 && i <= 3) {
//                    System.out.printf("%s      | %s       | %s%n", i, result, cubed);
//                }
//                else if (i > 3){
//                    System.out.printf("%s      | %s      | %s%n", i, result, cubed);
//                }
//
//            }
//            System.out.println("Would you like to continue?");
//            String response = scanner.next();
//
//            confirmation = response.equals("y");
//
//        } while(confirmation);


        boolean confirmation;
        do {
            System.out.print("Enter a grade: ");
            int input = scanner.nextInt();
            if(input >= 88) {
                System.out.println("Grade = A");
            } else if(input >= 80 || input <= 87){
                System.out.println("Grade = B");
            } else if(input >= 67 || input <= 79){
                System.out.println("Grade = C");
            } else if(input >= 60 || input <= 66){
                System.out.println("Grade = D");
            } else {
                System.out.println("Grade = F");

            }

            System.out.println("Would you like to continue? [y/n]");
            String response = scanner.next();

            confirmation = response.equals("y");
        }while(confirmation);


    }
}
