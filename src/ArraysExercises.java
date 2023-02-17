import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args){
        int[] numbers = {1, 2, 3, 4};
        System.out.println(Arrays.toString(numbers));

        Person[] personArray = new Person[3];

        personArray[0] = new Person("Titus");
        personArray[1] = new Person("Hung");
        personArray[2] = new Person("Horace");

        Person newPerson1 = new Person("Sarah");

        for(Person person : personArray) {
            System.out.println(person.getName());
        }

        // static method is located in Person class
        System.out.println(Arrays.toString(Person.addPerson(personArray, newPerson1)));


//
//        persons[0] = new Person("Titus");
//        persons[1] = new Person("Hung");
//        persons[2] = new Person("Horace");

//
//        for(int i=0; i < persons.length; i++) {
//
//        }

    }
}
