import java.util.PriorityQueue;
import java.util.Queue;
public class PriorityQueueExample {
public static void main(String[] args) {
        Queue<Integer> numbers = new PriorityQueue<>();
        numbers.offer(5);
        numbers.offer(2);
        numbers.offer(8);
        numbers.offer(1);
        System.out.println("Priority Queue: " + numbers);
        System.out.println("Peek: " + numbers.peek());
        System.out.println("Poll: " + numbers.poll());
        System.out.println("After poll: " + numbers);
    }
}