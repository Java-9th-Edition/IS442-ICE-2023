import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReverseDelimiterFileRead {
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

        Scanner contentScanner = new Scanner(file);

        while (contentScanner.hasNextLine()) {
            ArrayList<Integer> intList = new ArrayList<Integer>();
            String line = contentScanner.nextLine();
            Scanner lineScanner = new Scanner(line);
            lineScanner.useDelimiter(",");
            while (lineScanner.hasNextInt()) {
                intList.add(lineScanner.nextInt());
            }
            for (int i = intList.size() - 1; i >= 0; i--) {
                if (i == 0) {
                    System.out.println(intList.get(i));
                } else {
                    System.out.print(intList.get(i) + ",");
                }
            }
        }
    }
}
