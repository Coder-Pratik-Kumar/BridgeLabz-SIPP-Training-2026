import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class FolderTreeDeletion {

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

    public static void deleteFolderTree(Node node) {

        if (node == null) {
            return;
        }

        deleteFolderTree(node.left);
        deleteFolderTree(node.right);

        System.out.print(node.data + " ");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of folders: ");
        int n = sc.nextInt();

        Node root = null;

        System.out.println("Enter folder IDs:");

        for (int i = 0; i < n; i++) {
            root = insert(root, sc.nextInt());
        }

        System.out.println("Postorder Traversal (Safe Deletion Order):");
        deleteFolderTree(root);

        sc.close();
    }
}