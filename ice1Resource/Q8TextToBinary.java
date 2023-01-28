import java.util.*;

//the program handles only positive decimals
public class Q8TextToBinary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text message: ");
        String inputString = sc.nextLine();
        String result = "";

        for(char letter: inputString.toCharArray()){
            int letterNum = (int) letter;
            String temp = "";
            while (letterNum > 0){
                int bin = letterNum % 2;
                temp = bin + temp;
                letterNum /= 2;
            }
            if(temp.length()<8){
                temp = "0" + temp;
            }
            result += temp + " ";
        }
        System.out.println(result);
        sc.close();
    }
}