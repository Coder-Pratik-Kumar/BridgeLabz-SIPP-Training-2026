import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class PlaylistQueueInsertion {

    public static void insertAfter(Node current, int trackId) {
        Node newNode = new Node(trackId);
        newNode.next = current.next;
        current.next = newNode;
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

        System.out.print("Enter number of tracks: ");
        int n = sc.nextInt();

        System.out.println("Enter track IDs:");

        Node head = null;
        Node tail = null;

        for (int i = 0; i < n; i++) {
            int track = sc.nextInt();
            Node newNode = new Node(track);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        System.out.print("Enter current track ID: ");
        int currentTrack = sc.nextInt();

        System.out.print("Enter new track ID: ");
        int newTrack = sc.nextInt();

        Node current = head;

        while (current != null && current.data != currentTrack) {
            current = current.next;
        }

        if (current != null) {
            insertAfter(current, newTrack);
            System.out.println("Updated Playlist:");
            display(head);
        } else {
            System.out.println("Current track not found.");
        }

        sc.close();
    }
}