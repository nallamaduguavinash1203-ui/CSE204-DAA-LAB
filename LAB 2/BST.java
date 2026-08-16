import java.util.Scanner;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class BST {

    // Insertion
    static Node insert(Node root, int data) {

        if (root == null) {
            return new Node(data);
        }

        if (data < root.data) {
            root.left = insert(root.left, data);
        }
        else if (data > root.data) {
            root.right = insert(root.right, data);
        }

        return root;
    }

    // Find minimum value
    static Node findMin(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    // Deletion
    static Node delete(Node root, int data) {

        if (root == null) {
            return null;
        }

        if (data < root.data) {
            root.left = delete(root.left, data);
        }
        else if (data > root.data) {
            root.right = delete(root.right, data);
        }
        else {
            // Case 1: No child
            if (root.left == null && root.right == null) {
                return null;
            }

            // Case 2: Only right child
            if (root.left == null) {
                return root.right;
            }

            // Case 2: Only left child
            if (root.right == null) {
                return root.left;
            }

            // Case 3: Two children
            Node temp = findMin(root.right);
            root.data = temp.data;
            root.right = delete(root.right, temp.data);
        }

        return root;
    }

    // Inorder traversal
    static void inorder(Node root) {

        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Node root = null;

        System.out.print("How many elements do you want to insert? ");
        int n = sc.nextInt();

        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            root = insert(root, data);
        }

        System.out.print("BST (Inorder): ");
        inorder(root);

        System.out.print("\nEnter element to delete: ");
        int data = sc.nextInt();

        root = delete(root, data);

        System.out.print("BST after deletion: ");
        inorder(root);
    }
}