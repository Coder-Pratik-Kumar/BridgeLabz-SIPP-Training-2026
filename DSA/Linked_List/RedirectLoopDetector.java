import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class RedirectLoopDetector {

    public static boolean hasRedirectLoop(Node head) {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of URLs: ");
        int n = sc.nextInt();

        Node[] nodes = new Node[n];

        System.out.println("Enter URL IDs:");

        for (int i = 0; i < n; i++) {
            nodes[i] = new Node(sc.nextInt());
        }

        for (int i = 0; i < n - 1; i++) {
            nodes[i].next = nodes[i + 1];
        }

        System.out.print("Enter index to create cycle (-1 for no cycle): ");
        int index = sc.nextInt();

        if (index >= 0 && index < n) {
            nodes[n - 1].next = nodes[index];
        }

        boolean result = hasRedirectLoop(nodes[0]);

        if (result) {
            System.out.println("Cycle Detected");
        } else {
            System.out.println("No Cycle Detected");
        }

        sc.close();
    }
}