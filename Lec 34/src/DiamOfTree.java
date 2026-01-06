public class DiamOfTree {  //O(n^2)
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static int heigth(Node root){
        if(root==null){
            return 0;
        }
        int leftHt=heigth(root.left);
        int rightHt=heigth(root.right);
        return Math.max(leftHt,rightHt)+1;
    }
    public static int diameter(Node root){
        if(root==null){
            return 0;
        }
        int leftD=diameter(root.left);
        int leftHt=heigth(root.left);
        int rightD=diameter(root.right);
        int rightHt=heigth(root.right);

        int selfD=leftHt+rightHt+1;
        return Math.max(selfD,Math.max(leftD,rightD));
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.right=new Node(6);
        System.out.println(diameter(root));
    }
}
