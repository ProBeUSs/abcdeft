public class Main {
    public static void main(String[] args){



        System.out.println("Ресторан");
        Dish soup = new Dish("Суп", 50,"Супы" );
        Dish pizza = new Dish("Пицца", 120,"Основное блюдо");
        Dish icecream = new Dish("Мороженое", 70,"Десерт");



        Restaurant.addDish(soup);
        Restaurant.addDish(pizza);
        Restaurant.addDish(icecream);


        System.out.println("Меню Ресторана");
        Restaurant.displayMenu();
        System.out.println("Общее количество блюд " + Restaurant.getTotalDishes());



        System.out.println("\n-----------------------------------");
        System.out.println("\nАвтомобили");
        Car tesla = new Car("Tesla Model S", 2020, "Tesla");
        Car ford = new Car("Ford Mustang", 2018, "Ford");
        Car bmw = new Car("BMW X5", 2022, "BMW");
        tesla.displayInfo();
        ford.displayInfo();
        bmw.displayInfo();

        System.out.println("Общее количество выпущенных авто " + Car.getTotalCarsProduced());
        }


