import java.util.HashMap;
import java.util.Map;
public class HashMapExample {
public static void main(String[] args) {
            Map<String, Integer> ages = new HashMap<>();
            ages.put("John", 25);
            ages.put("Jane", 30);
            ages.put("Bob", 35);

            System.out.println("Ages: " + ages);

            System.out.println("Jane's age: " + ages.get("Jane"));
            
            ages.remove("Bob");
            System.out.println("After removing Bob: " + ages);
    }
}