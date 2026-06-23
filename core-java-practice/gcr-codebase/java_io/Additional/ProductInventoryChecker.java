import java.io.*;

public class ProductInventoryChecker {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("inventory.txt"));
            
            String line;
            System.out.println("Out of Stock Items:");
            
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("-");
                if (parts.length == 2) {
                    String product = parts[0].trim();
                    int quantity = Integer.parseInt(parts[1].trim());
                    
                    if (quantity == 0) {
                        System.out.println(product + " is out of stock");
                    }
                }
            }
            
            br.close();
            
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
