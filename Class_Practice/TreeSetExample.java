import java.util.TreeSet;
import java.util.Set;
public class TreeSetExample {
public static void main(String[] args) {
            Set<Integer> numbers = new TreeSet<>();
            numbers.add(5);
            numbers.add(2);
            numbers.add(8);
            numbers.add(2); // Duplicate, won't be added
            System.out.println("Numbers: " + numbers);
            System.out.println("First number: " + ((TreeSet<Integer>)

            numbers).first());

            System.out.println("Last number: " + ((TreeSet<Integer>)numbers).last());
    }
}