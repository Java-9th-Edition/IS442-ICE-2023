import java.util.*;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string:");
        String input1 = sc.nextLine();
        System.out.print("Enter the second string:");
        String input2 = sc.nextLine();
        System.out.println();

        if (matchStrings(input1, input2)) {
            System.out.println("There is an alignment as shown above.");
        } else {
            System.out.println("No alignment can be found.");
        }

        sc.close();
    }

    // This method returns true if str2 can be aligned with str1 
    // and false otherwise. If there is an alignment, this method 
    // also prints out the alignment. See the sample runs of the 
    // program for exact output of this method.
    public static boolean matchStrings(String str1, String str2) {
        // Modify the code below to return the correct value.
        int A = 0;
        int B = 0;
        int charCount = 0;
        String result = "";

        while ( A < str1.length() && B < str2.length()) {
            if (str1.charAt(A) == str2.charAt(B)){
                result += str1.charAt(A);
                A++;
                B++;
                charCount++;
            }
            else {
                A++;
                result += " ";
            }
        }

        if (charCount == str2.length()){
            System.out.println(str1);
            System.out.println(result);
            return true;
        }
        return false;
    }

}
