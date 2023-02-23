package util;

public class InputTest {
    public static void main(String[] args) {

        Input input = new Input();
//        System.out.println(input.getDouble(1.1, 10.5));

        System.out.println("give an integer");
        int userInput = input.getInt();

        if(userInput == 4) {
            System.out.println("that is correct");
        } else {
            System.out.println("that was wrong");
        }
    }
}
