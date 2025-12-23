public class KAncestorfind {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    public static int KAncestor(Node root, int n1, int k) {
        if (root == null) {
            return -1;
        }

        // ✅ target node found
        if (root.data == n1) {
            return 0;
        }

        int leftdist = KAncestor(root.left, n1, k);
        int rightdist = KAncestor(root.right, n1, k);

        if (leftdist == -1 && rightdist == -1) {
            return -1;
        }

        int max = Math.max(leftdist, rightdist);

        if (max + 1 == k) {
            System.out.println(root.data);
        }

        return max + 1;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(7);
        root.right.right = new Node(6);

        KAncestor(root, 5, 2);  // Output: 1
    }
}
