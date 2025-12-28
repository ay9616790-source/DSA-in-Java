public class FindKey {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
            // left and right are automatically null
        }
    }

    public static boolean findKey(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }
        if (root.data > key) {
            return findKey(root.left, key); // search left
        } else {
            return findKey(root.right, key); // search right
        }
    }

    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(1);
        root.right = new Node(7);
        root.left.right = new Node(3);
        root.left.right.left = new Node(2);
        root.left.right.right = new Node(4);

        System.out.println(findKey(root, 3)); // true
        System.out.println(findKey(root, 6)); // false
    }
}
