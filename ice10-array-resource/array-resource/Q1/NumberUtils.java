import java.util.*;

public class NumberUtils {

    public static Map<Integer, Integer> calculateFrequency(int[] array) throws IllegalArgumentException {
        Map<Integer, Integer> freqMap = new HashMap<Integer, Integer>();

        if (array == null){
            throw new IllegalArgumentException();
        }

        for (int num: array){
            if (freqMap.containsKey(num)){
                freqMap.put(num, freqMap.get(num) + 1);
            } else {
                freqMap.put(num, 1);
            }
        }

        return freqMap;

    }

    public static int[] createArray(Map<Integer, Integer> freqMap) throws IllegalArgumentException {

        if (freqMap == null){
            throw new IllegalArgumentException();
        }
        
        int[] list = new int[0];

        for (Map.Entry<Integer, Integer> pair: freqMap.entrySet()){

            int[] temp = new int[list.length + pair.getValue()];

            for (int i = 0; i < list.length; i++){
                temp[i] = list[i];
            }

            for (int i = list.length; i < temp.length; i++){
                temp[i] = pair.getKey();
            }

            list = temp;
        } 
        return list;
    }

    public static int max(int[] arr) throws IllegalArgumentException {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException();
        }
        int max = arr[0];

        for (int num: arr){
            if (num > max){
                max = num;
            }
        }
        return max;
    }

    public static int max(int n1, int n2, int n3) {
        int max = n1;

        if (n2 > max){
            max = n2;
        }

        if (n3 > max){
            max = n3;
        }

        return max;
    }

    public static int min(int[] arr) {
        int min = arr[0];

        for (int num: arr){
            if (num < min){
                min = num;
            }
        }

        return min;
    }

    public static List<Pair> findUniquePairs(int[] arr, int sum) {
        List<Pair> pairs = new ArrayList<Pair>();
        // keeps track of the past elements 
        HashMap<Integer, Integer> difference = new HashMap<Integer, Integer>();

        // if the difference between target and existing element exists in key of
        // difference, then we have found a pair
        // add the pair to the pairs ArrayList
        for (int num: arr){
            if (difference.containsKey(num)){
                pairs.add(new Pair(num, difference.get(num)));
            } else {
                difference.put(sum - num, num);
            }
        }
        return pairs;
    }

    public static List<Pair> findPairs(int[] arr, int sum) {
        List<Pair> pairs = new ArrayList<Pair>();
        
        for (int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i] + arr[j] == sum){
                    pairs.add(new Pair(arr[i], arr[j]));
                }
            }
        }
        return pairs;
    }


    public static int findTheMissingNumber(int[] arr, int n) throws IllegalArgumentException{
        if (arr == null) {
            throw new IllegalArgumentException();
        }

        if (arr.length != n - 1){
            throw new IllegalArgumentException();
        }
        
        int sum = 0;
        int expectedSum = n * (n + 1) / 2;
        for (int num: arr){
            sum += num;
        }
        return expectedSum - sum;
    }
}
