public class Snack {
    private int numCalories;
    private String brand;
    private int weight;
    private Product product;

    Snack(String name, double price, int numCalories, String brand, int weight) {
        // dependency injection (DI)
        this.product = new Product(name, price);
        this.numCalories = numCalories;
        this.brand = brand;
        this.weight = weight;
    }

    Snack(String name, double price, int numCalories, String brand) {
        // dependency injection (DI)
        this.product = new Product(name, price);
        this.numCalories = numCalories;
        this.brand = brand;
        this.weight = 90;
    }

    Snack(String name, double price, String brand, int weight) {
        // dependency injection (DI)
        this.product = new Product(name, price);
        this.brand = brand;
        this.weight = weight;
        this.numCalories = 100;
    }

    public int getNumCalories() {
        return this.numCalories;
    }

    public String getBrand() {
        return this.brand;
    }

    public int getWeight() {
        return this.weight;
    }
	
    public String toString() {
        return this.product + "0 [numCalories=" + numCalories + ", brand=" + brand + ", weight=" + weight + "]";
    }
}
