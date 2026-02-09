import java.util.ArrayList;

public class Question1382 {

    public class ConvertBSTtoBalancedBST {
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
        public static void getInOrder(Node root, ArrayList<Integer> inorder){
            if(root==null){
                return ;
            }
            getInOrder(root.left,inorder);
            inorder.add(root.data);
            getInOrder(root.right,inorder);

        }
        public static Node createBST(ArrayList<Integer> arr,int st,int end){
            if(st>end){
                return null;
            }
            int mid=(st+end)/2;
            Node root=new Node(arr.get(mid));
            root.left=createBST(arr,st,mid-1);
            root.right=createBST(arr,mid+1,end);
            return root;
        }
        public static Node balancesBST(Node root){
            ArrayList<Integer> inorder=new ArrayList<>();
            getInOrder(root,inorder);

            root=createBST(inorder,0,inorder.size()-1);
            return root;
        }
        public static void preOder(Node root){
            if(root==null){
                return;
            }
            System.out.print(root.data+" ");
            preOder(root.left);

            preOder(root.right);
        }
        public static void main(String[] args) {
            Node root=new Node(1);
            root.right=new Node(2);



            root.right.right=new Node(3);
            root.right.right.right=new Node(4);
            root=balancesBST(root);
            preOder(root);
        }
    }

}
