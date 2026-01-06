import java.util.LinkedList;
import java.util.Queue;

public class Question1161 {
    static class Node{
        int data;
        Node left;
        Node right;
        Node (int data){
            this.data=data;
            this.left=null;
            this.right=null;

        }
    }

public static int maxLevelSum(Node root) {
    if (root == null) return 0;

    Queue<Node> q = new LinkedList<>();
    q.add(root);

    int maxSum = Integer.MIN_VALUE;
    int maxLevel = 0;
    int level = 1; // start from level 1

    while (!q.isEmpty()) {
        int size = q.size();
        int levelSum = 0;

        // process one level
        for (int i = 0; i < size; i++) {
            Node curr = q.remove();
            levelSum += curr.data;

            if (curr.left != null) q.add(curr.left);
            if (curr.right != null) q.add(curr.right);
        }

        // check if this level has greater sum
        if (levelSum > maxSum) {
            maxSum = levelSum;
            maxLevel = level;
        }

        level++; // move to next level
    }

    return maxLevel;
}


    public static void main(String[] args) {
      Node root=new Node(1);
      root.left=new Node(7);
      root.right=new Node(0);
      root.left.left=new Node(7);
      root.left.right=new Node(-8);
        System.out.println(maxLevelSum(root));
    }
}
