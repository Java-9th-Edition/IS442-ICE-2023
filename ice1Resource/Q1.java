import static java.lang.Math.abs;

public class Q1 {
    public static int sumOfDigits(int number) {
        int posNumber = abs(number);
        int result = 0;
        while (posNumber > 0){
            int temp = posNumber % 10;
            posNumber /= 10;
            result += temp;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Test 1");
        int result = sumOfDigits(123);
        System.out.println("Expected:6");
        System.out.println("Actual  :" + result);
        System.out.println();

        System.out.println("Test 2");
        result = sumOfDigits(-354);
        System.out.println("Expected:12");
        System.out.println("Actual  :" + result);
        System.out.println();
    }
}
