import java.awt.*;
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

//        double x = 2;
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

        int i = 1;

        for(i = 1; i <= 100; i++) {
            if(i % 3 == 0 && i % 5 == 0){
                System.out.printf("FizzBuzz%n");
            } else if(i % 5 == 0 && i % 3 != 0){
                System.out.printf("Buzz%n");


            } else if(i % 3 == 0 && i % 5 != 0){
                System.out.printf("Fizz%n");

            } else {
                System.out.println(i);

            }


        }


    }
}
