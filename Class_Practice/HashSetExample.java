import java.util.HashSet;
import java.util.Set;
public class HashSetExample {
public static void main(String[] args) {
        Set<String> colors = new HashSet<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Red"); // Duplicate, won't be added
        System.out.println("Colors: " + colors);

        System.out.println("Contains Green? " +

        colors.contains("Green"));
        colors.remove("Blue");
        System.out.println("After removing Blue: " + colors);
    }
}