import java.util.Hashtable;
import java.util.Map;
public class HashtableExample {
public static void main(String[] args) {
        Map<String, Integer> population = new Hashtable<>();
        population.put("New York", 8419000);
        population.put("Los Angeles", 3898000);
        population.put("Chicago", 2716000);
        System.out.println("Population: " + population);

        System.out.println("Los Angeles population: " +

        population.get("Los Angeles"));
        population.remove("Chicago");
        System.out.println("After removing Chicago: " + population);
    }
}