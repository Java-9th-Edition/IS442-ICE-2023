import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class DeansList {
    public static void main(String[] args){
        File file = new File("./result.csv");
        ArrayList<String> deansListNames = new ArrayList<>();
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String student = sc.nextLine();

                if ( student.equals("name,email,gender,GPA") ) {
                    continue;
                }
                String[] studentInfo = student.split(",");
                String name = studentInfo[0];

                Float gpa;
                try {
                    gpa = Float.parseFloat(studentInfo[3]);
                    if (gpa >= 3.7){
                        deansListNames.add(name);
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid GPA for " + name); // Tina Lam
                    System.out.println("Student " + student);
                    gpa = 0f;
                }
            }
            for(String name : deansListNames) {
                System.out.println(name);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }


    }
}
