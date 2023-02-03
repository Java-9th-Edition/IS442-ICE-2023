import java.util.ArrayList;


public class Q7 {
    public static void main(String[] args) {
        ArrayList<String> container = new ArrayList<>();
        container.add("apple");
        // below are not strings, will not compile.
        container.add(1);
        container.add(3.14);
    
        for (Object c : container) {
            System.out.println(c);
        }
    }
}