import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class TaskQueueDeletion {

    public static Node removeTask(Node head, int taskId) {

        if (head == null)
            return null;

        if (head.data == taskId)
            return head.next;

        Node prev = head;
        Node curr = head.next;

        while (curr != null && curr.data != taskId) {
            prev = curr;
            curr = curr.next;
        }

        if (curr != null) {
            prev.next = curr.next;
        }

        return head;
    }

    public static void display(Node head) {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of tasks: ");
        int n = sc.nextInt();

        Node head = null;
        Node tail = null;

        System.out.println("Enter task IDs:");

        for (int i = 0; i < n; i++) {

            int task = sc.nextInt();
            Node newNode = new Node(task);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        System.out.print("Enter completed task ID: ");
        int taskId = sc.nextInt();

        head = removeTask(head, taskId);

        System.out.println("Updated Task Queue:");
        display(head);

        sc.close();
    }
}