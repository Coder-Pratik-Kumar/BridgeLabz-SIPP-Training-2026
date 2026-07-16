import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class CategoryTreeHeight {

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

    public static int height(Node node) {

        if (node == null) {
            return -1;
        }

        return Math.max(height(node.left), height(node.right)) + 1;
    }

    public static boolean isTooDeep(Node root, int threshold) {
        return height(root) > threshold;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of categories: ");
        int n = sc.nextInt();

        Node root = null;

        System.out.println("Enter category IDs:");

        for (int i = 0; i < n; i++) {
            root = insert(root, sc.nextInt());
        }

        System.out.print("Enter threshold: ");
        int threshold = sc.nextInt();

        int treeHeight = height(root);

        System.out.println("Tree Height: " + treeHeight);

        if (isTooDeep(root, threshold)) {
            System.out.println("Tree exceeds the threshold.");
        } else {
            System.out.println("Tree does not exceed the threshold.");
        }

        sc.close();
    }
}