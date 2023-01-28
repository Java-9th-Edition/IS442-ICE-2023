import java.util.Scanner;

public class CompanyTest {

    public static void main(String[] args) {

        Company company1 = new Company("UMS");

        // Employee e1 = new Employee();
        company1.addEmployee(new Employee("John", 5, 2500, 'M', new Spouse("Kate", 37)));

        System.out.println("Total salary (before): $" + company1.getAllEmployeesSalary());

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ID: ");
        int newID = sc.nextInt();
        sc.nextLine();

        System.out.println();
        System.out.print("Enter Name: ");
        String newName = sc.nextLine();

        System.out.println();
        System.out.print("Enter Salary: ");
        double newSalary = sc.nextDouble();
        sc.nextLine();

        System.out.println();
        System.out.print("enter Gender: ");
        char newGender = sc.next().charAt(0);
        sc.nextLine();

        company1.addEmployee(new Employee(newName, newID, newSalary, newGender));

        System.out.println("Total salary (after): $" + company1.getAllEmployeesSalary());
        System.out.println();

        checkEmployee(company1, 4);
        checkEmployee(company1, 5);


        // System.out.println("Name: "+ emp4.getName() + ", Salary: " + emp4.getSalary());
    }

    public static void checkEmployee(Company comp, int id){
        Employee emp = comp.getEmployee(id);
        String empStatus = emp.getSpouse() == null ? "Single" : "Married";
        System.out.println("Name: " + emp.getName() + ", Salary: $" + emp.getSalary() + ", Status: " + empStatus);
        if (empStatus == "Married") {
            System.out.println(emp.getSpouse().toString());
        }
        System.out.println();
    }
}
