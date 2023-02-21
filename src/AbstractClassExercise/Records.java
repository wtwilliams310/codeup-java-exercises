package AbstractClassExercise;

public class Records extends Media{
    @Override
    public void whereToUse() {
        System.out.println("Record may be used in the assigned listening booth.");
    }

    @Override
    public double minReserved() {
        return 0;
    }
}
