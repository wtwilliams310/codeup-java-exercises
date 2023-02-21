package AbstractClassExercise;

abstract public class Media {
    public void checkout(){
        System.out.println("To checkout please see the Librarian.");
    }

    public abstract double minReserved();

    public abstract void whereToUse();
}
