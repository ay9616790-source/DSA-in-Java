public class CreateMirrorImage {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    // Create Mirror Image
    public static Node createMirror(Node root) {
        if (root == null) return null;

        Node left = createMirror(root.left);
        Node right = createMirror(root.right);

        root.left = right;
        root.right = left;

        return root;
    }

    // Preorder Traversal
    public static void preOrder(Node root) {
        if (root == null) return;

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {

        // Original Tree
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.left.left = new Node(1);
        root.left.left.right = new Node(2);
        root.right.right = new Node(11);
        root.right.right.right = new Node(14);

        // Print Original Tree
        System.out.print("Original Tree (Preorder): ");
        preOrder(root);
        System.out.println();

        // Create Mirror
        createMirror(root);

        // Print Mirror Tree
        System.out.print("Mirror Tree (Preorder): ");
        preOrder(root);
    }
}
