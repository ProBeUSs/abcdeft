public class Dish {
      private String name;
      private double price;
      private String category;

      public Dish(String name, double price, String category) {
            this.name = name;
            this.price = price;
            this.category = category;
      }


      public void displayInfo() {
            System.out.println("Назва: " + name + ", Ціна: " + price + ", Категорія: " + category);
      }
}
