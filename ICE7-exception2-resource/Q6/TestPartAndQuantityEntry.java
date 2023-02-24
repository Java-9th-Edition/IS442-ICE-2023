import java.util.Scanner;

public class TestPartAndQuantityEntry {
    public static void main(String[] args) {
        boolean repeat = true;

        while (repeat) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter part number> ");
            int partNumber = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter quantity> ");
            int quantity = sc.nextInt();

            try {
                PartAndQuantityEntry.enterPartAndQuantity(partNumber, quantity);
                repeat = false;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
