import java.util.ArrayList;



public class Restaurant {
    private static ArrayList<Dish> menu = new ArrayList<>();


    public static void addDish(Dish dish) {
        menu.add(dish);
    }
    public static  int getTotalDishes(){
        return menu.size();

    }
    public static void displayMenu(){
        for (Dish dish : menu) {
            dish.displayInfo();
        }
    }
}
