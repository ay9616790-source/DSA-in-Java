public class MinDis {
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
    public static Node lca(Node root,int n1,int n2){
        if(root==null || root.data==n1 ||root.data==n2){
            return root;
        }
        Node fountLeft=lca(root.left,n1,n2);
        Node fountRight=lca(root.right,n1,n2);

        if(fountRight==null){
             return fountLeft;
        }
        if(fountLeft==null){
            return fountRight;
        }
        return root;
    }
    public static int lcaDistTon(Node root,int n){
        if(root==null){
            return -1;
        }
        if(root.data==n){
            return 0;
        }
        int leftDist=lcaDistTon(root.left,n);
        int rightDist=lcaDistTon(root.right,n);
        if(leftDist==-1){
            return rightDist+1;
        }else{
             return leftDist+1;
        }
    }

    public static int minDistance(Node root,int n1,int n2){
        Node lca= lca(root,n1,n2);
        int leftDist=lcaDistTon(lca,n1);
        int rightDist=lcaDistTon(lca,n2);
         return leftDist+rightDist;
    }
    public static void main(String[] args) {
         Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.right=new Node(6);

        System.out.println(minDistance(root,4,6));
    }
}
