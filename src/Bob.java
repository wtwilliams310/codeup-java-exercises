import java.util.Scanner;

public class Bob {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

//        System.out.println("Talk to Bob...");

        String input = scanner.nextLine();
        int count = 0;
for(int i = 0; i >= count; i++) {
    if(input.endsWith("?")) {
        System.out.println("Sure.");
        input = scanner.next();
        count++;

    } if (input.endsWith("!")) {
        System.out.println("Whoa, chill out!");
        input = scanner.next();
        count++;


    } if (input.equals("")) {
        input = scanner.next();

        System.out.println("Whatever.");
        count = 10;
    }
}


    }
}
