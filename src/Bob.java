import java.util.Scanner;

public class Bob {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int count = 1;
        for (int i = 0; i < count; i++) {
            if (input.endsWith("?")) {
                System.out.println("Sure.");
                input = scanner.nextLine();
                count++;
            } else if (input.endsWith("!")) {
                System.out.println("Whoa, chill out!");
                input = scanner.nextLine();
                count++;
            }  else if (input.equals("")) {
                System.out.println("Whatever.");
                count++;
                input = scanner.nextLine();
            } else if (input.equals("bye")) {
                System.out.println("Please come back!!!");
            } else  {
                System.out.println("Fine. Be that way!");
                count++;
                input = scanner.nextLine();

            }
        }}}