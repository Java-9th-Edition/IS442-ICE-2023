import java.io.*;
import java.util.*;

import static java.nio.file.Files.exists;

public class ProductTest {
  public static void main(String[] args){
    ArrayList<Product> products = new ArrayList<>();
    products.add(new Product("apple", 3, 1.2));
    products.add(new Product("orange", 5, 3.2));
    products.add(new Product("pear", 2, 1.1));
  
    save(products,"data\\product.csv");
  }

  public static void save(ArrayList<Product> productList, String pathAndFileName){
    //TODO: goes through products and saves each Product as a line in file
    //format to be used: name,quantity,price

    // creates a new file with the pathAndFileName and goes through products and saves each Product as a line in file
    // format to be used: name,quantity,price

    try {
        File file = new File(pathAndFileName);
        file.createNewFile();


        FileOutputStream fos = new FileOutputStream(file, true);
        PrintStream ps = new PrintStream(fos);

        for (Product product : productList) {
          String line = product.getName() + "," + product.getQuantity() + "," + product.getPrice();
          ps.println(line);
        }
        ps.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }

  }
}
