import java.util.Scanner;

public class SearchMenu {
    private SearchCtrl ctrl;

    public SearchMenu(SearchCtrl ctrl) {
        this.ctrl = ctrl;
    }

    public void display() {
        System.out.println("== Interest Group Management System ==");
        System.out.println("1. President Gender Search");
        System.out.println("2. Quit Application");
        System.out.print("Please enter your choice:");
    }

    public void readOption() {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            display();
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    searchPresident();
                    break;
                case 2:
                    System.out.println("bye bye");
                    break;
                default:
                    System.out.println("Enter a choice between 1 to 2");
            }
        } while (choice != 2);
    }

    public void searchPresident() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the Interest Group's name> ");
        String IGNameInput = sc.nextLine();

        System.out.print("Please enter the year> ");
        int yearInput = sc.nextInt();

        SearchCtrl searchCtrl = new SearchCtrl();
        Student president = searchCtrl.searchPresident(IGNameInput, yearInput);
        
        if (president != null) {
            String gender = president.getGender() == 'M' ? "gentleman" : "lady";
            System.out.println("The president " + president.getName() + " is a " + gender);
            System.out.println();
            sc.close();
        }
        System.out.println("Invalid interest group/year entered");
        System.out.println();
        sc.close();
    }
}