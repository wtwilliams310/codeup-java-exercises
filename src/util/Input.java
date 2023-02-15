package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);

    public String getString(){
        return this.scanner.next();
    }

    public boolean yesNo(){
        String getStringLower = getString().toLowerCase();
        if(getStringLower.equals("yes") || getStringLower.equals("y")) {
            return true;
        } else {
            return false;
        }
    }

    public int getInt(int min, int max) {
        System.out.printf("Enter a number between %d and %d: ", min, max);
        int input = getInt();
        if(input <= min || input >= max) {
            return getInt(min, max);
        }
        return input;
    }

    public int getInt() {
        return this.scanner.nextInt();
    }

    public double getDouble(double min, double max) {
        System.out.printf("Enter a number between %f and %f: ", min, max);
        double input = getDouble();
        if(input <= min || input >= max) {
            return getDouble(min, max);
        }
        return input;
    }

    public double getDouble() {
        return this.scanner.nextDouble();
    }



//   Input obj = new Input();


//    public Input() {
//      this.scanner = new Scanner(System.in);


    }




