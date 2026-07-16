import java.util.*;

public class NextGreaterElement {

    public static int[] nextBusierDay(int[] visitors) {

        int n = visitors.length;
        int[] answer = new int[n];
        Arrays.fill(answer, -1);

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty() && visitors[i] > visitors[stack.peek()]) {
                answer[stack.pop()] = visitors[i];
            }

            stack.push(i);
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of days: ");
        int n = sc.nextInt();

        int[] visitors = new int[n];

        System.out.println("Enter visitor counts:");

        for (int i = 0; i < n; i++) {
            visitors[i] = sc.nextInt();
        }

        int[] result = nextBusierDay(visitors);

        System.out.println("Next Greater Elements:");

        for (int value : result) {
            System.out.print(value + " ");
        }

        sc.close();
    }
}