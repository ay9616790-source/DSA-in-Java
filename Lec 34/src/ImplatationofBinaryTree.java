class Node{
    int data;
    Node left;
    Node rigth;
    Node(int data){
        this.data =data;
        this.left=null;
        this.rigth=null;
    }
}
public class ImplatationofBinaryTree {

    public static void main(String[] args) {
        Node a=new Node(3);
        Node b=new Node(4);
        Node c=new Node(2);
        Node d=new Node(-1);
        Node e=new Node(1);
        Node f=new Node(6);
        Node g=new Node(9);
        a.left=b;a.rigth=c;
        b.left=d;b.rigth=e;
        c.left=f;c.rigth=g;
             display(a);

    }
    private static void display(Node root){
        if(root==null) return;
        System.out.print(root.data+" ");
        display(root.left);
        display(root.rigth);
    }
}
