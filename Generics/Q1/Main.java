import java.util.*;

class Pair<T, U> {
    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public void display() {
        System.out.println("First : " + first);
        System.out.println("Second: " + second);
    }
}

class Stack<T> {

    private ArrayList<T> stack = new ArrayList<>();

    public void push(T item) {
        stack.add(item);
    }

    public T pop() {
        if (stack.isEmpty()) {
            return null;
        }
        return stack.remove(stack.size() - 1);
    }

    public T peek() {
        if (stack.isEmpty())
            return null;
        return stack.get(stack.size() - 1);
    }
}

class Q1 {

    public static <T extends Comparable<T>> T findMax(T[] arr) {

        T max = arr[0];

        for (T item : arr) {
            if (item.compareTo(max) > 0)
                max = item;
        }

        return max;
    }
}

class Repository<T> {

    private ArrayList<T> list = new ArrayList<>();

    public void add(T obj) {
        list.add(obj);
    }

    public void display() {
        for (T obj : list) {
            System.out.println(obj);
        }
    }
}

class PrintUtility {

    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}

public class Main {

    public static void main(String[] args) {

        // Pair
        Pair<String, Integer> pair = new Pair<>("Pratik", 101);
        pair.display();

        // Stack
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("\nPopped: " + stack.pop());
        System.out.println("Top: " + stack.peek());

        // findMax
        Integer[] numbers = {5, 15, 8, 25, 10};
        System.out.println("\nMaximum = " + Q1.findMax(numbers));

        // Repository
        Repository<String> repo = new Repository<>();
        repo.add("Java");
        repo.add("Python");
        repo.add("C++");

        System.out.println("\nRepository Contents:");
        repo.display();

        // Wildcard
        List<String> names = Arrays.asList("Amit", "Rahul", "Neha");

        System.out.println("\nPrinting List:");
        PrintUtility.printList(names);
    }
}