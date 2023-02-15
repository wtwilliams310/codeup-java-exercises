

public class DishTools {
    static int averageCostOfDishInCents = 1300;
    static void shoutDishName(Dish obj){
        System.out.printf("%s%n", obj.getNameOfDish().toUpperCase());
    }
    static void analyzeDishCost(Dish obj){
        if(obj.getCostInCents() > averageCostOfDishInCents){
            System.out.println("More expensive than average");
        } else if(obj.getCostInCents() < averageCostOfDishInCents){
            System.out.println("Less expensive than average");
        }
    }

    static void flipRecommendation(Dish obj){
        if(obj.getWouldRecommend()) {
            obj.setWouldRecommend(false);
        } else {
            obj.setWouldRecommend(true);
        }
    }

}

