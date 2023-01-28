// this is for Q7
public class Person {
    private String firstName;
    private String lastName;
    private Integer age;

    public Person(String firstName, String lastName, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        if (age == null) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void toStringPerson() {
        System.out.println(
                "Person [firstName=" + this.firstName + ", lastName=" + this.lastName + ", age=" + this.age + "]");
    }
}
