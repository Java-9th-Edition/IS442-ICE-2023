import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size for part A: ");
        int AInput = sc.nextInt();
        System.out.println(partA(AInput));
        
        System.out.print("Enter size for part B: ");
        int BInput = sc.nextInt();
        System.out.println(partB(BInput));
        
        System.out.print("Enter size for part C: ");
        int CInput = sc.nextInt();
        System.out.println(partC(CInput));

        sc.close();
    }

    public static String partA(int size){
        // a = 97, z = 122
        String result = "";
        for(int i=0; i<size; i++){
            result += (char)('a' + i%26) + " ";
        }
        return result;
    }

    public static String partB(int size){
        String output = "";
        for(int i = 1; i < size + 1; i++){
            String temp = "";
            for (int j=i; j<i+3; j++){
                temp += j;
            }
            output += temp + " ";
        }
        return output;
    }

    public static String partC(int size) {
        String output = "";
        String temp = "";

        for(int i = 1; i < size+1; i++){
            temp += i;
            output += temp + "\n";
        }
        return output;
    }

}