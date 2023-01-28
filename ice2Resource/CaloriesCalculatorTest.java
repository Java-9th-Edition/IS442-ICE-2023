import java.text.DecimalFormat;
public class CaloriesCalculatorTest {
    private static final DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args) {

        NewYearGoodie tart = new NewYearGoodie("Tart", 82.5, 20);
        NewYearGoodie bakKwa = new NewYearGoodie("Bak Kwa", 115, 28);
        NewYearGoodie loveLetters = new NewYearGoodie("Love Letters", 56.5, 13);

        System.out.println("Pinneaple Tarts more sinful than Bak Kwa: " + tart.isMoreSinful(bakKwa));
        System.out.println();
        System.out.println("Pineapple Tarts (calories per gram): " + df.format(tart.getCaloriesPerGram()));
        System.out.println("Bak Kwa (calories per gram): " + df.format(bakKwa.getCaloriesPerGram()));
        System.out.println("Love Letters(calories per gram): " + df.format(loveLetters.getCaloriesPerGram()));
        System.out.println();

        CaloriesCalculator calocalc = new CaloriesCalculator();
        calocalc.addNewYearGoodie(tart, 2);
        calocalc.addNewYearGoodie(bakKwa, 3);
        calocalc.addNewYearGoodie(loveLetters, 5);

        double totalCalories = calocalc.getTotalCalories();
        System.out.println("Total Calories: " + totalCalories);

        System.out.println("Most sinful goodie: " + calocalc.getMostSinfulGoodie().getName());


    }
}
