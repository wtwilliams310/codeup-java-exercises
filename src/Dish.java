public class Dish {
    public int costInCents;
    public String nameOfDish;
    public boolean wouldRecommend;






    public void printSummary() {
        System.out.printf("Cost: %s%n" +
                "Name: %s%n" +
                "Recommended: %s", costInCents, nameOfDish, wouldRecommend);
    }

}

