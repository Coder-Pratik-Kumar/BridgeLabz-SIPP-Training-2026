import java.util.LinkedHashMap;
import java.util.Map;
public class LinkedHashMapExample {
public static void main(String[] args) {
            Map<String, String> capitals = new LinkedHashMap<>();
            capitals.put("USA", "Washington D.C.");
            capitals.put("UK", "London");
            
            capitals.put("France", "Paris");
            System.out.println("Capitals: " + capitals);

            capitals.put("Germany", "Berlin");
            System.out.println("After adding Germany: " + capitals);
    }
}