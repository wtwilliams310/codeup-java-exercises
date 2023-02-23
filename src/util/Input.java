package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);

    public String getString(){
        return this.scanner.next();
    }

    public String getString(String prompt) {
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

//    public int getInt(int min, int max) {
//        System.out.printf("Enter a number between %d and %d: ", min, max);
//        int input = getInt();
//        if(input <= min || input >= max) {
//            return getInt(min, max);
//        }
//        return input;
//    }

    // Original
//    public int getInt() {
//        return this.scanner.nextInt();
//    }

    // Exceptions Exercises
    public int getInt() {
        try {
            return Integer.valueOf(getString());
        } catch (Exception ex) {
            System.out.println("This was not an integer");
            return getInt();
        }
    }

    public double getDouble(double min, double max) {
        System.out.printf("Enter a number between %f and %f: ", min, max);
        double input = getDouble();
        if(input <= min || input >= max) {
            return getDouble(min, max);
        }
        return input;
    }

    // Original
//    public double getDouble() {
//        return this.scanner.nextDouble();
//    }

    // Exceptions exercise
    public double getDouble() {
        try {
            return Double.valueOf(getString());
        } catch (Exception ex) {
            System.out.println("This was not an double");
            return getDouble();
        }
    }



//   Input obj = new Input();


//    public Input() {
//      this.scanner = new Scanner(System.in);


    }




