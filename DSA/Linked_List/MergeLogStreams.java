import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MergeLogStreams {

    public static Node mergeLists(Node a, Node b) {

        Node dummy = new Node(0);
        Node tail = dummy;

        while (a != null && b != null) {

            if (a.data <= b.data) {
                tail.next = a;
                a = a.next;
            } else {
                tail.next = b;
                b = b.next;
            }

            tail = tail.next;
        }

        if (a != null) {
            tail.next = a;
        } else {
            tail.next = b;
        }

        return dummy.next;
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

        System.out.print("Enter number of nodes in first list: ");
        int n1 = sc.nextInt();

        Node head1 = null;
        Node tail1 = null;

        System.out.println("Enter elements of first sorted list:");

        for (int i = 0; i < n1; i++) {

            Node newNode = new Node(sc.nextInt());

            if (head1 == null) {
                head1 = newNode;
                tail1 = newNode;
            } else {
                tail1.next = newNode;
                tail1 = newNode;
            }
        }

        System.out.print("Enter number of nodes in second list: ");
        int n2 = sc.nextInt();

        Node head2 = null;
        Node tail2 = null;

        System.out.println("Enter elements of second sorted list:");

        for (int i = 0; i < n2; i++) {

            Node newNode = new Node(sc.nextInt());

            if (head2 == null) {
                head2 = newNode;
                tail2 = newNode;
            } else {
                tail2.next = newNode;
                tail2 = newNode;
            }
        }

        Node merged = mergeLists(head1, head2);

        System.out.println("Merged Sorted List:");
        display(merged);

        sc.close();
    }
}