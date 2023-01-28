public class NewYearGoodie {
    private String name;
    private double calories;
    private int weight;

    public NewYearGoodie(String name, double calories, int weight) {
        this.name = name;
        this.calories = calories;
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }

    public int getWeight() {
        return this.weight;
    }

    public double getCalories() {
        return this.calories;
    }

    public boolean isMoreSinful(NewYearGoodie another) {
        return this.calories - another.calories > 0.0;
    }

    public double getCaloriesPerGram() {
        return this.calories / (double) this.weight;
    }

    public String toString() {
        return "NewYearGoodie[name=" + this.name + ",calaries=" + this.calories + ",weight=" + this.weight + "]";
    }
}
