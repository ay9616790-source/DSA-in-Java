public class CountNode {
    static class Node{
        int data;
        Node left;
         Node rigth;
         Node(int data){
             this.data=data;
             this.left=null;
             this.rigth=null;
         }
    }

    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        Node f=new Node(6);

        a.left=b;a.rigth=c;
        b.left=d;b.rigth=e;
        c.left=f;
        System.out.println(count(a));
    }
    private static int  count(Node root){
        if(root==null) return 0;
        int lCount=count(root.left);
        int rCount=count(root.rigth);
        return lCount+rCount+1;
    }
}
