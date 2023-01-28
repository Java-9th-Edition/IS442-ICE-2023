import java.util.Scanner;

public class CashRegisterTest {
    public static void main(String[] args) {
        CashRegister cashReg = new CashRegister();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the price of the first item: $");
        double firstItem = sc.nextFloat();
        cashReg.registerPurchase(firstItem);

        System.out.print("Enter the price of the second item: $");
        double secondItem = sc.nextFloat();
        cashReg.registerPurchase(secondItem);

        System.out.print("Enter dollars received from customer: ");
        int dollars = sc.nextInt();

        System.out.print("Enter cents received from customer: ");
        int cents = sc.nextInt();

        cashReg.makePayment(dollars, cents);

        System.out.println("Total cost of purchase: $" + cashReg.getPurchaseAmt());
        System.out.println("Change due: $" + cashReg.giveChange());
    }
}
