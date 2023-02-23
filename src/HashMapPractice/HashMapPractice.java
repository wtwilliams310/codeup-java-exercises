package HashMapPractice;

import java.util.*;

public class HashMapPractice {
    public static void main(String[] args) {

                int a = 10;
                int b = 3;
                int c = 88;

                HashMap<String, Integer> happy = new HashMap<>();
                happy.put("a", 10);
                happy.put("b", 3);
                happy.put("c", 88);

//        System.out.println(happy);
//        System.out.println(happy.get("c"));

        HashMap<String, String> fun = new HashMap<>();
        fun.put("bobbyJoe1996", "FluffyPonies");
        fun.put("helloKitty123", "sunSets");
//        System.out.println(fun);
//        System.out.println(fun.containsValue("sunSets"));
//        System.out.println(fun.containsKey("sunSets"));
        System.out.println(fun.size());
        System.out.println(fun.replace("helloKitty123", "sunRises"));
        System.out.println(fun);
        System.out.println(fun.values());
        System.out.println(fun.keySet());

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(1000);


//        System.out.println(numbers);

        List<String> instructors = new ArrayList<>();
        instructors.add("Justin");
        instructors.add("Titus");
        instructors.add("Jason");

//        System.out.println(instructors.get(1));

        List<Integer> numbersSome = new ArrayList<>(Arrays.asList(7, 10, 1));


        for(String instructor : instructors) {
//            System.out.println("Your instructor is: " + instructor);

            Collections.sort(numbersSome);
//            System.out.println(numbersSome);
        }



            }





}
