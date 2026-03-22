import java.util.ArrayList;

public class Question1022 {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    public static int sumRootToLeaf(Node root, ArrayList<Integer> path) {
        if (root == null) return 0;

        // add current node to path
        path.add(root.data);

        int sum = 0;

        // if leaf node
        if (root.left == null && root.right == null) {
            int decimal = 0;
            for (int bit : path) {
                decimal = decimal * 2 + bit;
            }
            sum = decimal;
        } else {
            sum += sumRootToLeaf(root.left, path);
            sum += sumRootToLeaf(root.right, path);
        }

        // backtrack
        path.remove(path.size() - 1);

        return sum;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(0);
        root.right = new Node(1);
        root.left.left = new Node(0);
        root.left.right = new Node(1);
        root.right.left = new Node(0);
        root.right.right = new Node(1);

        ArrayList<Integer> path = new ArrayList<>();
        System.out.println(sumRootToLeaf(root, path));
    }
}