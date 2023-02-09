import java.util.Scanner;


public class ConsoleExercises {
    public static void main(String[] args) {
//        String name = "codeup";
//        System.out.printf("Hello there, %s. Nice to see you.%n", name);

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter something: ");
//        String userInput = scanner.nextLine();
//
//        System.out.println("You entered: --> \"" + userInput + "\" <--");

//        double pi = 3.14159;
//
//        System.out.format("The value of pi is approximately %.3f%n", pi);

        //Explore the Scanner Class

        // #1
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter an integer: ");
//        int userInput = scanner.nextInt();
//        System.out.println(userInput);


        // #2

        /*
        Scanner in = new Scanner(System.in);

        System.out.print("Enter three words: ");


        String input1 = in.next();
        String input2 = in.next();
        String input3 = in.next();

        System.out.printf("%s\n%s\n%s", input1, input2, input3);
        */

        // #3
        /*
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a sentence: ");

        String input = in.nextLine();

        System.out.print(input);
        */

        // Calculate the perimeter and area of Codeup's classroom

        // #1, #2

        Scanner in = new Scanner(System.in);

//        in.useDelimiter("\n");


        System.out.print("Enter the width of the room: ");

        float width = in.nextFloat();

        System.out.print("Enter the length of the room: ");

        float length = in.nextFloat();

        System.out.print("Enter the height of the room: ");

        float height = in.nextFloat();




        float area = width * length;
        float perimeter = 2 * length + 2 * width;
        float volume = width * height * length;

        System.out.printf("The area of the room is: %.2f ft; The perimeter of the room is: %.2f ft; The volume of the room" +
                "is: %.2f ", area, perimeter, volume);

        // Bonuses


    }
}
