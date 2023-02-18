import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DelimiterFileRead {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner fileScanner = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String fileName = fileScanner.nextLine();

        File file = new File(fileName);

        // check if file exists
        while (!file.exists()) {
            System.out.println(fileName + " not exist. Try again.");
            System.out.print("Enter a file name: ");
            file = new File(fileScanner.nextLine());
        }

        // read contents of file and add up numbers in each line of file and print to the console
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

        contentScanner.close();
        fileScanner.close();
    }
}
