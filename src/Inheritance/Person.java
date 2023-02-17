package Inheritance;

public class Person {
    private String name;

    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eating(){
        System.out.println(name + " is eating");
    }

    public void livingLife(){
        System.out.println(name + " is living life");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Person p = new Person("isaac", 27);
        System.out.println(p.getAge());
        System.out.println(p.getName());
        p.livingLife();
    }
}
