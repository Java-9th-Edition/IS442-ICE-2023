import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First word: ");
        String stringOne = sc.nextLine(); 
        
        System.out.print("Enter Second word: ");
        String stringTwo = sc.nextLine(); 

        while (stringOne.charAt(0) != stringTwo.charAt(0)) {
            System.out.println("try again");
            System.out.print("Enter First word: ");
            stringOne = sc.nextLine();

            System.out.print("Enter Second word: ");
            stringTwo = sc.nextLine();
        }

        System.out.println("Bingo");
        sc.close();
    }

}