import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class BrowserHistoryReversal {

    public static Node reverseHistory(Node head) {

        Node prev = null;
        Node curr = head;

        while (curr != null) {

            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
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

        System.out.print("Enter number of pages: ");
        int n = sc.nextInt();

        Node head = null;
        Node tail = null;

        System.out.println("Enter page IDs:");

        for (int i = 0; i < n; i++) {

            int page = sc.nextInt();
            Node newNode = new Node(page);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        System.out.println("Original History:");
        display(head);

        head = reverseHistory(head);

        System.out.println("Reversed History:");
        display(head);

        sc.close();
    }
}