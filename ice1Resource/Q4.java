import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int result = 1;
        String resultString = "";
        int input = 0;
        while (input >= 0){
            System.out.print("Enter number: ");
            input = sc.nextInt();
            if (input < 0){
                break;
            }
            resultString += input + " x ";
            result *= input; 
        }

        if (resultString.length() == 0){
            System.out.println("No positive number is entered");
        } else {
            System.out.println(resultString.substring(0, resultString.length()-2) + "= " + result);
        }
        
        sc.close();
        
    }
}