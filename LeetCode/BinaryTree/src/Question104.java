public class Question104 {
    static class Node{
        int data;
        Node left;
        Node right;
        public  Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static int maxDepth(Node  root){
        if(root==null){
            return 0;
        }
        int left=maxDepth(root.left);
        int right=maxDepth(root.right);
//        int Depth=Math.max(left,right)+1;
        return Math.max(left,right)+1;
    }
    public static void main(String[] args) {
        Node root=new Node(3);
        root.left=new Node(9);
        root.right=new Node(20);
        root.right.left=new Node(15);
        root.right.right=new Node(7);
        System.out.println(maxDepth(root));

    }
}
