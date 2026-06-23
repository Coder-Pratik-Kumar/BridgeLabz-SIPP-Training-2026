import java.io.*;

public class CustomerFeedbackAnalyzer {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int count = 0;
            
            System.out.println("Enter 5 feedback messages:");
            for (int i = 0; i < 5; i++) {
                String feedback = br.readLine().toLowerCase();
                if (feedback.contains("good")) {
                    count++;
                }
            }
            
            System.out.println("Good Feedback Count = " + count);
            
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
