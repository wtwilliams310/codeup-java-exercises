public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        int myFavoriteNumber = 23;

//        String myString = "This is a string.";
//        System.out.println(myString);
//
//        float myNumber = 3.14f;
//        System.out.println(myNumber);

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

        String theNumberThree = "three";
        Object o = theNumberThree;

//        int x = 4;
//        x += 5;
//        System.out.println(x);

//        int x = 3;
//        int y = 4;
//        y *= x;
//        System.out.println(y);

//        int x = 10;
//        int y = 2;
//        x /= y;
//        y -= x;
//        System.out.println(x);
//        System.out.println(y);
//
//        byte test1 = 127;
//        ++test1;
//        System.out.println(test1);


//        double[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers[1]);

        double[] numbers = new double[5];

        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;

        System.out.println(numbers[3]);

        double count = 0;
        // for loop
//        for(int i=0; i < numbers.length; i++){
//            count += numbers[i];
//        }
//        System.out.println(count);

        //Enhanced loop
        for(double number: numbers) {
            count += number;
        }
        System.out.println(count);

    }



}
