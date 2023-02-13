import java.util.Random;
import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {

    gameStart();

    }
    public static int count = 1;
    public static int lives = 25;

    public static void gameStart() {
        int randomNumber = (int) Math.floor(Math.random() *(100) + 1);

        System.out.printf("This is the random number: %s%n", randomNumber); // Used to check answer


        guessAgain(randomNumber);
    }

    public static void guessAgain(int input) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Guess a number between 1 and 100: ");

        int userGuess = scanner.nextInt();

        if(userGuess < 100 && userGuess > 1) {
            if(userGuess == input) {
                System.out.println("GOOD GUESS!");
                System.out.printf("Number of guesses used: %s; Number of guesses left: %s", count, lives);
            } else if(userGuess > input){
                System.out.println("LOWER");
                lives--;
                System.out.printf("You have %s guesses left.%n", lives);
                count++;
                guessAgain(input);
            } else if(userGuess < input) {
                System.out.println("HIGHER");
                lives--;
                System.out.printf("You have %s guesses left.%n", lives);
                count++;
                guessAgain(input);
            }
        } else {
            System.out.println("Enter a valid number between 1 and 10: ");
            guessAgain(input);
        }
    }
}
