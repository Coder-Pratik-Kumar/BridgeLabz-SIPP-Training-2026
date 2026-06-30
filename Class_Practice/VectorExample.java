import java.util.Vector;
public class VectorExample {
public static void main(String[] args) {
        Vector<Integer> numbers = new Vector<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println("Numbers: " + numbers);
        System.out.println("First number: " + numbers.firstElement());

        System.out.println("Last number: " + numbers.lastElement());

        numbers.removeElementAt(1);
        System.out.println("After removing second element: " + numbers);
    }
}