import java.util.Scanner;

class Frame {
    String functionName;
    Frame next;

    Frame(String functionName, Frame next) {
        this.functionName = functionName;
        this.next = next;
    }
}

public class CallStack {

    private Frame top = null;

    public void push(String functionName) {
        top = new Frame(functionName, top);
    }

    public String pop() {
        if (isEmpty()) {
            throw new RuntimeException("No active call to return from");
        }

        String name = top.functionName;
        top = top.next;
        return name;
    }

    public String peek() {
        if (isEmpty()) {
            throw new RuntimeException("Call Stack is Empty");
        }

        return top.functionName;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CallStack stack = new CallStack();

        while (true) {

            System.out.println("\n1. Push Function");
            System.out.println("2. Pop Function");
            System.out.println("3. Peek Function");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Function Name: ");
                    String name = sc.nextLine();
                    stack.push(name);
                    System.out.println("Function Added");
                    break;

                case 2:
                    try {
                        System.out.println("Returned From: " + stack.pop());
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 3:
                    try {
                        System.out.println("Current Function: " + stack.peek());
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
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