

public class DishTools {
    static int averageCostOfDishInCents = 1300;
    static void shoutDishName(Dish obj){
        System.out.printf("%s%n", obj.nameOfDish.toUpperCase());
    }
    static void analyzeDishCost(Dish obj){
        if(obj.costInCents > averageCostOfDishInCents){
            System.out.println("More expensive than average");
        } else if(obj.costInCents < averageCostOfDishInCents){
            System.out.println("Less expensive than average");
        }
    }

    static void flipRecommendation(Dish obj){
        if(obj.wouldRecommend) {
            obj.wouldRecommend = false;
        } else {
            obj.wouldRecommend = true;
        }
    }

}

