import java.util.InputMismatchException;
import java.util.Scanner;

public class Adder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean repeat = true;
        int num1 = 0;
        int num2 = 0;

        while (repeat) {
            try {
                System.out.print("Enter num 1> ");
                num1 = sc.nextInt();
                System.out.println();

                while (repeat) {
                    try {
                        System.out.print("Enter num 2> ");
                        num2 = sc.nextInt();
                        repeat = false;

                    } catch (InputMismatchException e) {
                        System.out.println("Please enter a number!");
                        sc.next();
                        repeat = true;
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter a number!");
                sc.next();
                repeat = true;
            }
        }

        int sum = num1 + num2;

        System.out.println();
        System.out.println("The answer is " + sum);

        sc.close();
    }
}