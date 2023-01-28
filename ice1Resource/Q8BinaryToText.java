import java.util.*;

public class Q8BinaryToText {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a binary string: ");
        String binInput = sc.nextLine();
        String output = "";
        for(int i=0; i < binInput.length(); i+=8){
            String temp = binInput.substring(i, i+8);
            char letter = (char) Integer.parseInt(temp, 2);
            output += letter;
        }
        System.out.println(output);
        sc.close();

        // According to Tiobe, Java has been the number 1 or 2 most popular language basically since its creation in the mid-90's
    }

}