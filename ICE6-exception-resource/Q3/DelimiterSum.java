import java.util.Scanner;
import java.io.*;

public class DelimiterSum {
    public static void main(String[] args) throws FileNotFoundException {
        // prompt user to enter file name
        System.out.print("Enter a file name: ");
        // scanner for file name input
        Scanner fileScanner = new Scanner(System.in);

        // create a file object
        String input = fileScanner.nextLine();
        File file = new File(input);

        // check if file exists
        while (!file.exists()) {
            System.out.println(input + " not exist. Try again.");
            System.out.print("Enter a file name: ");
            file = new File(fileScanner.nextLine());
        }

        // read contents of file and add up numbers in each line of file
        Scanner contentScanner = new Scanner(file);
        while (contentScanner.hasNextLine()) {
            int sum = 0;
            String line = contentScanner.nextLine();
            Scanner lineScanner = new Scanner(line);
            lineScanner.useDelimiter(",");
            while (lineScanner.hasNextInt()) {
                sum += lineScanner.nextInt();
            }
            System.out.println(sum);
            lineScanner.close();
        }

        // close scanners
        fileScanner.close();
        contentScanner.close();
    }
}
