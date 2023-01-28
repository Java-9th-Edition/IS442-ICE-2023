public class Q9 {

    public static void main(String[] args) {
        char c = 'a';
        int age = 9;

        // pre increment: ++i increments the value of i by 1, then uses it in statement
        // post increment i++ uses the value of i, then increments it by 1

        // fragment A
        // True && True
        // ++age = 10
//        if (c == 'a' && ++age == 10){
//        // short circuit && will not evaluate other conditions once one condition is determined false
//            age++;
//        }
//        System.out.println(age); // output: 11

        // fragment B
        // T & T, ++age = 10
//        if (c == 'a' & ++age == 10){
//        // normal & will evaluate all conditions regardless if they are false or not
//            age++;
//        }
//        System.out.println(age); // output: 11

        // fragment C
        // F && T, age = 10, short-circuit does not evaluate ++age since first condition is false
//        if (c != 'a' && ++age == 10){
//            age++;
//        }
//        System.out.println(age); // output: 9

//        // fragment D
        // F || T, second condition is evaluated to be true, age = 10
//        if (c != 'a' || ++age == 10){
//            age++;
//        }
//        System.out.println(age); // output: 11
//
//        // fragment E
        // T || T, short-circuit or does not evaluate second condition after first condition returns True
//        if (c == 'a' || ++age == 10){
//            age++;
//        }
//        System.out.println(age);  // output: 10
//
//        // fragment F
        // F | T, normal or evaluates all conditions regardless if they are false or not
        if (c != 'a' | ++age == 10){
            age++;
        }
        System.out.println(age);  // output: 11

    }
}