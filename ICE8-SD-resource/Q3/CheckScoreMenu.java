import java.util.Scanner;

public class CheckScoreMenu {
    private CheckScoreCtrl ctrl;

    public CheckScoreMenu(CheckScoreCtrl ctrl) {
        this.ctrl = ctrl;
    }

    public void display() {
        System.out.println("== Quiz Management System ==");
        System.out.println("1. Check student's score");
        System.out.println("2. Quit Application");
        System.out.print("Please enter your choice: ");
    }

    public void readOption() {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            display();
            choice = sc.nextInt();
            switch (choice) {
                case 1 :
                    checkScore();
                    break;
                case 2 :
                    System.out.println("bye bye");
                    break;
                default :
                    System.out.println("Enter a choice between 1 to 2");
            }
        } while (choice != 2);
    }

    public void checkScore() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the student's name> ");
        String studentName = sc.nextLine();
        System.out.println();

        System.out.print("Enter the quiz's name> ");
        String quizName = sc.nextLine();
        System.out.println();


        CheckScoreCtrl checkScoreCtrl = new CheckScoreCtrl();
        try {
            double scoreDifference = checkScoreCtrl.calculateDifferenceFromAverage(studentName, quizName);
            if (scoreDifference < 0) {
                System.out.println(studentName + " is " + Math.abs(scoreDifference) + " marks below the average");
            } else if (scoreDifference > 0) {
                System.out.println(studentName + " is " + Math.abs(scoreDifference) + " marks above the average");
            } else {
                System.out.println(studentName + " is sitting on the fence!");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }


}