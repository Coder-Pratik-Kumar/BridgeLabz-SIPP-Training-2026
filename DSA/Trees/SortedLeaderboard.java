import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class SortedLeaderboard {

    public static Node insert(Node root, int data) {

        if (root == null) {
            return new Node(data);
        }

        if (data < root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }

        return root;
    }

    public static void inorder(Node root, List<Integer> result) {

        if (root == null) {
            return;
        }

        inorder(root.left, result);
        result.add(root.data);
        inorder(root.right, result);
    }

    public static List<Integer> getSortedLeaderboard(Node root) {

        List<Integer> result = new ArrayList<>();
        inorder(root, result);
        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of player scores: ");
        int n = sc.nextInt();

        Node root = null;

        System.out.println("Enter player scores:");

        for (int i = 0; i < n; i++) {
            root = insert(root, sc.nextInt());
        }

        List<Integer> leaderboard = getSortedLeaderboard(root);

        System.out.println("Sorted Leaderboard:");

        for (int score : leaderboard) {
            System.out.print(score + " ");
        }

        sc.close();
    }
}