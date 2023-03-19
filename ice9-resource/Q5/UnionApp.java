import java.util.*;
public class UnionApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first line> ");
        String firstLine = sc.nextLine();
        String[] firstArray = firstLine.split(",");
        System.out.println();

        System.out.println("Enter second line> ");
        String secondLine = sc.nextLine();
        String[] secondArray = secondLine.split(",");
        System.out.println();

        Set<String> union = new HashSet<>();
        for (String s : firstArray) {
            union.add(s);
        }
        for (String s : secondArray) {
            union.add(s);
        }

        List<String> list = new ArrayList<>(union);
        Collections.sort(list);
        System.out.println("Union: " + list);
    }
}