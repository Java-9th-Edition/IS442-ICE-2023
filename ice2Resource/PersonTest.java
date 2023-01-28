
import java.util.Scanner;

public class PersonTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String firstName = sc.nextLine();

        System.out.print("Enter last name: ");
        String lastName = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        Person aPerson = new Person(firstName, lastName, age);

        aPerson.toStringPerson();

        // advances the scanner to the next line
        sc.nextLine();

        System.out.println();

        System.out.print("Enter first name of second person: ");
        String firstName2 = sc.nextLine();
        System.out.println();

        System.out.print("Enter last name of second person: ");
        String lastName2 = sc.nextLine();
        System.out.println();

        Person otherPerson = new Person(firstName2, lastName2, null);
        otherPerson.toStringPerson();

        System.out.print("Enter the age of second person: ");
        int age2 = sc.nextInt();
        otherPerson.setAge(age2);

        otherPerson.toStringPerson();
    }
}
