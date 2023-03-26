public class ArrayUtility {
    public static String printArray(int[] array) {
        String res = "[";
        for (int i = 0; i < array.length; i++) {
            res += array[i];
            if (i < array.length - 1) {
                res += ", ";
            }
        }

        return res + "]";
    }

    // create sum method that takes in null and returns a string null
    public static int sum(int[] numArray) {
        int sum = 0;
        if (numArray == null) {
            return 0;
        }
        for (int num : numArray) {
            sum += num;
        }
        return sum;
    }

    public static int[] twoTimes(int[] original) {
        if (original == null) {
            return null;
        }
        if (original.length == 0) {
            return new int[0];
        }
        int[] twoTimes = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            twoTimes[i] = original[i] * 2;
        }
        return twoTimes;
    }

    public static void reverse(int[] array) {
        for (int i = 0 ; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }
}
