package Inheritance;

public class SeniorDeveloper extends Developer {
    public SeniorDeveloper(String name, int age, boolean isTyping, boolean isInMeeting) {
        super(name, age, isTyping);
        this.isInMeeting = isInMeeting;
    }
    private boolean isInMeeting;

    public void isInMeeting() {
        if(isInMeeting) {
            System.out.println(getName() + " is in a meeting");
        } else {
            System.out.println(getName() + " is NOT in a meeting");

        }
    }

    public static void main(String[] args) {
        SeniorDeveloper s = new SeniorDeveloper("Bob", 88, false, true);
        s.eating();
        s.isTyping();
        s.isInMeeting();
    }
}
