import java.io.*;

public class Student_report {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("students_data.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("report_card.txt", true));
            
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 3) {
                    String name = parts[0].trim();
                    double mark1 = Double.parseDouble(parts[1].trim());
                    double mark2 = Double.parseDouble(parts[2].trim());
                    double average = (mark1 + mark2) / 2;
                    
                    bw.write(name + " - Average: " + String.format("%.2f", average) + "\n");
                }
            }
            
            br.close();
            bw.close();
            System.out.println("Report card generated successfully");
            
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO Error: " + e.getMessage());
        }
    }
}