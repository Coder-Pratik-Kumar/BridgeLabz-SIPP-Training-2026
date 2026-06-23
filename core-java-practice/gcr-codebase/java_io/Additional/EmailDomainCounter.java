import java.io.*;
import java.util.*;

public class EmailDomainCounter {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("emails.txt"));
            Map<String, Integer> domainCount = new HashMap<>();
            
            String email;
            while ((email = br.readLine()) != null) {
                if (email.contains("@")) {
                    String domain = email.substring(email.indexOf("@") + 1, email.indexOf(".com"));
                    domainCount.put(domain, domainCount.getOrDefault(domain, 0) + 1);
                }
            }
            
            br.close();
            
            System.out.println("Domain Count:");
            for (String domain : domainCount.keySet()) {
                System.out.println(domain + ": " + domainCount.get(domain));
            }
            
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
