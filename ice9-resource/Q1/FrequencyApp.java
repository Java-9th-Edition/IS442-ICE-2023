import java.util.*;
public class FrequencyApp {

    public static void main(String[] args) {
        HashMap<String, Integer> frequencyTable = new HashMap<String, Integer>();
        Scanner sc = new Scanner(System.in);
        // prompt the user to enter a word and add it to the frequency table
        // stop prompting when the user enters a blank line
        System.out.println("Enter a word: ");
        String word = sc.nextLine();
        while (!word.equals("")) {
            if (frequencyTable.containsKey(word)) {
                int count = frequencyTable.get(word);
                frequencyTable.put(word, count + 1);
            } else {
                frequencyTable.put(word, 1);
            }
            System.out.println("Enter a word: ");
            word = sc.nextLine();
        }

        // print the frequency table
        System.out.println("Frequency Count");

        Iterator<Map.Entry<String, Integer>> iter = frequencyTable.entrySet().iterator();

        while (iter.hasNext()) {
            Map.Entry<String, Integer> entry = iter.next();
            System.out.println(entry.getValue() + " " + entry.getKey());
        }
    }
}