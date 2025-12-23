public class HeigthOfBinaryTree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    //Heigth of the Node
    public static int heigth(Node root){
        if(root==null){
            return 0;
        }
        int lh=heigth(root.left);
        int rh=heigth(root.right);
        return Math.max(lh,rh)+1;
    }
    //Count Node present
    public static int countNode(Node root){
        if(root==null){
            return 0;
        }
        int lCount=countNode(root.left);
        int rCount=countNode(root.right);
        return lCount+rCount+1;
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.right=new Node(6);
//        System.out.println(heigth(root));
        System.out.println(countNode(root));
    }
}
