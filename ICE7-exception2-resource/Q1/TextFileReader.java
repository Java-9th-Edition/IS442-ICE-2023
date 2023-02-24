import java.io.*;
class TextFileReader {
    public static void main(String[] args) {
        String fileNameAndPath = "data/students.txt";
        File f = new File(fileNameAndPath);
        long start = System.currentTimeMillis();

        if (f.exists()) {
            System.out.println("Yes, " + fileNameAndPath + " exists");
        } else {
            System.out.println("No, " + fileNameAndPath + " does not exist");
        }

        long end = System.currentTimeMillis();
        System.out.println("Elapsed time: " + (end-start));

    }
}