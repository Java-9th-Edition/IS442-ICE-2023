public class PartAndQuantityEntry {
    public static void enterPartAndQuantity(int partNumber, int quantity) throws IllegalArgumentException {
        if (partNumber < 0 || quantity < 1 || quantity > 5000 || partNumber > 999) {
            throw new IllegalArgumentException("Part number and quantity must be positive");
        }
        System.out.println("Successfully inserted order");
    }
}
