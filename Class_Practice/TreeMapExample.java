import java.util.TreeMap;
import java.util.Map;
public class TreeMapExample {
public static void main(String[] args) {
        TreeMap<Integer, String> scores = new TreeMap<>();
        scores.put(85, "John");
        scores.put(92, "Jane");
        scores.put(78, "Bob");
        
        System.out.println("Scores: " + scores);
        System.out.println("Highest score: " + scores.lastEntry());
        System.out.println("Lowest score: " + scores.firstEntry());
    }
}