import java.util.Arrays;

public class Person {
    private String name;

    // TODO FROM Justin Method to change age of all people to + 1
//    public static void makePeopleOlder(Person[] people){
//        for(Person person : people) {
//                person.age = person.age + 1; <----- or
//            person.setAge(person.getAge() + 1);
//        }
//    }
//    print agees
//    public static void printPeopleAges(Person[] people){
//        for(Person person : people) {
//            System.out.println(person.age);
//        }
//    }



    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello(){
        System.out.printf("Hello, %s", name);
    }

    public Person(String name) {
        this.name = name;
    }

    public static Person[] addPerson(Person[] personArray, Person person){
        Person[] newPersonArray = Arrays.copyOf(personArray, personArray.length + 1);
        newPersonArray[newPersonArray.length -1] = person;
        return newPersonArray;
    }



    public static void main(String[] args) {
//        Person person1 = new Person("Titus");
//
//        person1.sayHello();

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());



    }



//        public String getName(){
//            return name;
//        }
//
//        public void setName(String name){
//
//        }
//    }
}
