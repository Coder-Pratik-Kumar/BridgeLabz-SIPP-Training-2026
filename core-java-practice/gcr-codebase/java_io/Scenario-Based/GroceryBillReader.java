import java.io.*;

public class GroceryBillReader {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("bill.txt");
            BufferedReader br = new BufferedReader(fr);
            
            String line;
            int lineCount = 0;
            
            System.out.println("Bill Contents:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                lineCount++;
            }
            
            System.out.println("\nTotal Lines: " + lineCount);
            
            br.close();
            fr.close();
            
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
