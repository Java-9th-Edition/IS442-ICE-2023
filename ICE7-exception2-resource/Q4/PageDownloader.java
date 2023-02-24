import java.io.IOException;
import java.net.URL;
import java.nio.charset.MalformedInputException;
import java.util.Scanner;

public class PageDownloader {
    public static void main(String[] args) throws IOException {
        Scanner console = new Scanner(System.in);
        boolean repeat = true;
        URL url = null;

        while (repeat) {
            try {
                System.out.print("Enter the URL> ");
                String websiteURL = console.nextLine();
                url = new URL(websiteURL);
                repeat = false;
            } catch (Exception e) {
                System.out.println("Invalid URL!");
                repeat = true;
            }
        }
        Scanner sc = new Scanner(url.openStream());
        while (sc.hasNext()) {
            System.out.println(sc.nextLine());
        }
    }
}
