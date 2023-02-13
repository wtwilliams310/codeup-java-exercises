import java.util.Random;
import java.util.Scanner;

public class MethodExercises {
    public static void main(String[] args) {

//        calculator();



//        getInteger(1, 10);

//        factorial();

//        diceRoll();


    }


    public static void calculator() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first number: ");

        float number1 = scanner.nextFloat();

        System.out.print("Spell out the operation you would like to do? ");
        String operation = scanner.next();

        System.out.print("Enter your second number: ");

        float number2 = scanner.nextFloat();

        if(operation.equals("addition")) {
            addition(number1, number2);
        } else if(operation.equals("subtraction")) {
            subtraction(number1, number2);

        }else if(operation.equals("multiplication")) {
            multiplication(number1, number2);

        }else if(operation.equals("division")) {
            division(number1, number2);

        } else if(operation.equals("modulus")) {
            modulus(number1, number2);

        }
    }

    public static  float addition(float input1, float input2) {
        float result = input1 + input2;
        System.out.print(result);
        return result;
    }

    public static  float subtraction(float input1, float input2) {
        float result = input1 - input2;
        System.out.print(result);
        return result;
    }

    public static  float multiplication(float input1, float input2) {
        float result = input1 * input2;
        System.out.print(result);
        return result;
    }

    public static  float division(float input1, float input2) {
        float result = input1 / input2;
        System.out.print(result);
        return result;
    }

    public static  double modulus(double input1, double input2) {
        double result = input1 % input2;
        System.out.print(result);
        return result;
    }

//     #2
    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter a number between %s and %s: ", min, max);

        String input = scanner.next();
        int inputParse = Integer.parseInt(input);

        int count = 1;
        for(int i = 0; i < count; i++) {
            if(inputParse >= max || inputParse <= min) {
                System.out.printf("Enter a number between %s and %s: ", min, max);
                input = scanner.next();
                inputParse = Integer.parseInt(input);
                count++;
            } else {
                System.out.print(inputParse);
            }
        }

        return inputParse;
    }

    // #3
    public static void factorial() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number between 1 and 10: ");
        int number = scanner.nextInt();
        if(number >= 10 || number <= 1){
            System.out.println("Enter a valid number between 1 and 10: ");
            number = scanner.nextInt();
        }
        long count = 1;
        for(int i = 1; i <= number; i++){
            count *= i;
        }
        System.out.printf("%s! = %s%n", number, count);
        System.out.print("Would you like to continue [y/n]?");
        String answer = scanner.next();

        if(answer.equalsIgnoreCase("y")){
            factorial();
        }

    }

    // # 4

    public static void diceRoll() {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Enter the number of sides for the dice: ");
        int diceSides = scanner.nextInt();


        System.out.print("Press [r] to roll the dice");
        String roll = scanner.next();
        String empty = "";

        if(roll.equals("y")) {
            int randomDice1 = (int) Math.floor(Math.random() *(diceSides) + 1);
            int randomDice2 = (int) Math.floor(Math.random() *(diceSides) + 1);

            System.out.printf("You rolled  %s and %s%n", randomDice1, randomDice2);

        }
        System.out.print("Would you like to continue [y/n]? ");
        String answer = scanner.next();

        if(answer.equalsIgnoreCase("y")){
            diceRoll();
        }

    }

    // TODO

    public static String sayName(String first, String last) {
        System.out.printf("Hi %s %s", first, last);
        return String.format("Hi %s %s", first, last);
    }

    public static String sayName(String first) {
        System.out.printf("Hi %s", first);
        return String.format("Hi %s", first);

    }
}


//if(!operation.equals("addition") || !operation.equals("subtraction") || !operation.equals("multiplication") || !operation.equals("division")
//        | !operation.equals("modulus")) {
//            System.out.print("Please type a valid operation you would like to do? ");
//        } else {
