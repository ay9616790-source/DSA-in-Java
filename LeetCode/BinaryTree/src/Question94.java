import java.util.ArrayList;
import java.util.List;

public class Question94 {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    static List<Integer> ans = new ArrayList<>();

    public static List<Integer> inorderTraversal(Node root) {
        ans.clear();          // important if method called multiple times
        helper(root);
        return ans;
    }

    private static void helper(Node root) {
        if (root == null) return;

        helper(root.left);        // LEFT
        ans.add(root.data);       // ROOT
        helper(root.right);       // RIGHT
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.right = new Node(2);
        root.right.left = new Node(3);

        System.out.println(inorderTraversal(root)); // [1, 3, 2]
    }
}
