import java.util.Scanner;

public class Q8BinaryConverter {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter decimal number: ");
    int inputNum = sc.nextInt();
    String output = "";
    while (inputNum > 0){
      int bin = inputNum % 2;
      output = bin + output;
      inputNum /= 2;
    }

    System.out.println("Binary equivalent of " + inputNum + " is " + output);
  sc.close();
  }
}
  