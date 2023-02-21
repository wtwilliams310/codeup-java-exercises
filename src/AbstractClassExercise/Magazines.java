package AbstractClassExercise;

public class Magazines extends Media{
    @Override
    public double minReserved() {
        return 0;
    }

    @Override
    public void whereToUse() {
        System.out.println("Use within any open seating area.");
    }
}
