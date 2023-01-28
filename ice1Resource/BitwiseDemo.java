public class BitwiseDemo {
    public static void main(String[] args){
        int x = 0b0;
        System.out.println("x: " + x);
        System.out.println("~x: " + ~x);
        System.out.println("x integer: "+ Integer.toBinaryString(~x));

        // bitwise and
        int a = 0b0110010;
        int b = 0b1100000;
        System.out.println("bitwise a & b: " + Integer.toBinaryString(a & b));

        // check even odd using bitwise & and 1
        int even = 12;
        int odd = 13;
        System.out.println("even: " + even + " is even: " + ((even & 1) == 0));
        System.out.println("odd: " + odd + " is odd: " + ((odd & 1) == 1));

        // bitwise or |
        System.out.println("bitwise a | b: " + Integer.toBinaryString(a | b));

        // bitwise xor ^
        System.out.println("bitwise a ^ b: " + Integer.toBinaryString(a ^ b));

        // bitwise left shift <<
        System.out.println("bitwise a << 2: " + Integer.toBinaryString(a << 2));

        // signed right shift >>, if number is negative, 1 is used as filler, else positive numbers use 0 as filler from the left
        System.out.println("bitwise a >> 2: " + Integer.toBinaryString(a >> 2));

        // unsigned right shift >>>, will always insert 0 as filler from the left
        System.out.println("bitwise a >>> 2: " + Integer.toBinaryString(a >>> 2));
    }
}
