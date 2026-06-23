import java.io.*;

public class DailyExpenseLogger {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new FileWriter("expenses.txt", true));
            
            System.out.println("Enter expense category and amount (e.g., Food - 200):");
            String expense = br.readLine();
            
            bw.write(expense + "\n");
            bw.close();
            
            System.out.println("Expense logged successfully");
            
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
