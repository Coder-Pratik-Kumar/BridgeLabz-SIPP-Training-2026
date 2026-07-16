import java.util.Scanner;
import java.util.Stack;

public class UndoBuffer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter maximum undo capacity: ");
        int capacity = sc.nextInt();
        sc.nextLine();

        Stack<String> stack = new Stack<>();

        while (true) {

            System.out.println("\n1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    if (stack.size() == capacity) {
                        System.out.println("Undo Buffer is Full");
                    } else {
                        System.out.print("Enter Edit: ");
                        String edit = sc.nextLine();
                        stack.push(edit);
                        System.out.println("Edit Added");
                    }
                    break;

                case 2:

                    if (stack.isEmpty()) {
                        System.out.println("Nothing to Undo");
                    } else {
                        System.out.println("Undo: " + stack.pop());
                    }
                    break;

                case 3:

                    if (stack.isEmpty()) {
                        System.out.println("Undo Buffer is Empty");
                    } else {
                        System.out.println("Top Edit: " + stack.peek());
                    }
                    break;

                case 4:
                    System.out.println("Program Ended");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}