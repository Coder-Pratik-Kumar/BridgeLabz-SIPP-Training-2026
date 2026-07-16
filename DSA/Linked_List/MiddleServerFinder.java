import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MiddleServerFinder {

    public static Node findMiddleServer(Node head) {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
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

        System.out.print("Enter number of servers: ");
        int n = sc.nextInt();

        Node head = null;
        Node tail = null;

        System.out.println("Enter server IDs:");

        for (int i = 0; i < n; i++) {

            int id = sc.nextInt();
            Node newNode = new Node(id);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        System.out.println("Server Chain:");
        display(head);

        Node middle = findMiddleServer(head);

        if (middle != null) {
            System.out.println("Middle Server: " + middle.data);
        } else {
            System.out.println("List is empty.");
        }

        sc.close();
    }
}