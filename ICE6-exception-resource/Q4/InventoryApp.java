import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InventoryApp {
    public static void stockTaking(String fileNameAndPath) {
        // read file and print out the following to the screen
        try {
            File file = new File(fileNameAndPath);
            Scanner fileScanner = new Scanner(file);

            while ( fileScanner.hasNextLine() ) {
                Scanner lineScanner = new Scanner(fileScanner.nextLine());
                lineScanner.useDelimiter(",");
                while ( lineScanner.hasNext() ) {
                    int quantity = lineScanner.nextInt();
                    String name = lineScanner.next();
                    double price = lineScanner.nextDouble();
                    System.out.println("There are " + quantity + " " + name + "s each cost $" + price + ".");
                }
                lineScanner.close();
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        }

    }

    public static void main(String[] args){
        stockTaking("product.csv");
    }
}
