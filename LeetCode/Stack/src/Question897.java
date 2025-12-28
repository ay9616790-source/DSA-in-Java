import java.util.Stack;

public class Question897 {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Your inorder traversal (kept, but correct usage)
    public static Stack<Integer> inorder(Node root, Stack<Integer> st) {
        if (root == null) return st;
        inorder(root.left, st);
        st.push(root.data);
        inorder(root.right, st);
        return st;
    }

    // Modified increasingBST using your stack
    public static Node increasingBST(Node root) {
        Stack<Integer> st = new Stack<>();
        inorder(root, st);

        if (st.isEmpty()) return null;

        // First element becomes new root
        Node newRoot = new Node(st.get(0));
        Node curr = newRoot;

        // Attach remaining nodes to right
        for (int i = 1; i < st.size(); i++) {
            curr.right = new Node(st.get(i));
            curr = curr.right;
        }
        return newRoot;
    }

    // Helper to print result
    public static void printTree(Node root) {
        while (root != null) {
            System.out.print(root.data + " ");
            root = root.right;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(6);
        root.left.left = new Node(2);
        root.left.right = new Node(4);
        root.left.left.left = new Node(1);
        root.right.right = new Node(8);
        root.right.right.left = new Node(7);
        root.right.right.right = new Node(9);

        Node result = increasingBST(root);
        printTree(result);
    }
}
