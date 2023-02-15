public class DishTest {
    public static void main(String[] args) {

        Dish dish1 = new Dish(25, "Pizza", true);

//        dish1.setNameOfDish("Broken Dreams");
//        dish1.setCostInCents(25);
//        dish1.setWouldRecommend(true);

//        dish1.printSummary();

        DishTools.shoutDishName(dish1);
        DishTools.analyzeDishCost(dish1);
        DishTools.flipRecommendation(dish1);
        System.out.println(dish1.getWouldRecommend());
    }
}