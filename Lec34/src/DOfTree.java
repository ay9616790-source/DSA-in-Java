public class DOfTree {
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
    static class Info{
        int diam;
        int Ht;
        Info(int diam,int Ht){
            this.diam=diam;
            this.Ht=Ht;
        }
    }
    public static Info Diameter(Node root){
        if(root==null){
            return new Info(0,0);
        }
        Info infoLeft=Diameter(root.left);
        Info infoRight=Diameter(root.right);
        int Diam=  Math.max(Math.max(infoLeft.diam,infoRight.diam),infoLeft.Ht+infoRight.Ht+1);
        int ht=Math.max(infoLeft.Ht, infoRight.Ht)+1;
        return new Info(Diam,ht);
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.right=new Node(6);
        System.out.println(Diameter(root).diam);
    }
}
