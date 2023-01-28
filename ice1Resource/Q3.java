import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        System.out.println(reverse());
    }

    public static String reverse() {
        System.out.print("Enter a sentence");
        Scanner sc = new Scanner(System.in);

        String result = "";

        String inputArray[] = sc.nextLine().split(" ");
        
        for (String word : inputArray) {
            result = word + " " + result;
        }
        sc.close();
        
        return result;
    }
}