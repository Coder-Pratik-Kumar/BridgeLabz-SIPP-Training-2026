import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class TreeDiameter {

    static int diameter = 0;

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

    public static int longestCommunicationPath(Node root) {
        diameter = 0;
        heightAndUpdateDiameter(root);
        return diameter;
    }

    public static int heightAndUpdateDiameter(Node node) {

        if (node == null) {
            return -1;
        }

        int leftHeight = heightAndUpdateDiameter(node.left);
        int rightHeight = heightAndUpdateDiameter(node.right);

        diameter = Math.max(diameter, leftHeight + rightHeight + 2);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        Node root = null;

        System.out.println("Enter employee IDs:");

        for (int i = 0; i < n; i++) {
            root = insert(root, sc.nextInt());
        }

        System.out.println("Diameter of Tree: " + longestCommunicationPath(root));

        sc.close();
    }
}