import java.util.LinkedHashSet;
import java.util.Set;
public class LinkedHashSetExample {
public static void main(String[] args) {
        Set<String> fruits = new LinkedHashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple"); // Duplicate, won't be added
        System.out.println("Fruits: " + fruits);
        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);
    }
}