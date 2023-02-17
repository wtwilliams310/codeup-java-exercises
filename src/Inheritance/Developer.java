package Inheritance;

public class Developer extends Person {
    private boolean isTyping;

    public Developer(String name, int age, boolean isTyping) {
        super(name, age);
        this.isTyping = isTyping;
    }

    public void isTyping() {
        if(isTyping) {
            System.out.println(getName() + " is typing");
        } else {
            System.out.println(getName() + " is NOT typing");

        }


    }

    public void eating(){
        System.out.println(getName() + " is eating RICH");
    }

    public static void main(String[] args) {
        Developer d = new Developer("Justin", 20, false);
        System.out.println(d.getAge());
        System.out.println(d.getName());
        d.livingLife();
        d.eating();
        d.isTyping();
        d.eating();

    }
}
