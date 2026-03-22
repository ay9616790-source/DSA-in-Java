import java.util.ArrayList;

public class MergeTwoBST {

    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Inorder traversal
    public static void getInorder(Node root, ArrayList<Integer> arr) {
        if (root == null) return;

        getInorder(root.left, arr);
        arr.add(root.data);
        getInorder(root.right, arr);
    }

    // Create balanced BST from sorted array
    public static Node balancedBST(ArrayList<Integer> arr, int st, int end) {
        if (st > end) return null;

        int mid = (st + end) / 2;
        Node root = new Node(arr.get(mid));

        root.left = balancedBST(arr, st, mid - 1);
        root.right = balancedBST(arr, mid + 1, end);

        return root;
    }

    // Merge two BSTs
    public static Node create(Node root1, Node root2) {

        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        getInorder(root1, arr1);
        getInorder(root2, arr2);

        // Merge sorted arrays
        int i = 0, j = 0;
        ArrayList<Integer> finalArr = new ArrayList<>();

        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) <= arr2.get(j)) {
                finalArr.add(arr1.get(i++));
            } else {
                finalArr.add(arr2.get(j++));
            }
        }

        while (i < arr1.size()) finalArr.add(arr1.get(i++));
        while (j < arr2.size()) finalArr.add(arr2.get(j++));

        return balancedBST(finalArr, 0, finalArr.size() - 1);
    }

    // Print inorder to verify
    public static void printInorder(Node root) {
        if (root == null) return;
        printInorder(root.left);
        System.out.print(root.data + " ");
        printInorder(root.right);
    }

    public static void main(String[] args) {

        // BST 1
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        // BST 2
        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        Node mergedRoot = create(root1, root2);

        // Output inorder of merged BST
        printInorder(mergedRoot);
    }
}
