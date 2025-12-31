public class DeleteNode {

        static class Node{
            int data;
            Node left;
            Node right;
            Node(int data){
                this.data=data;
            }
        }
        public static Node insert(Node root, int val){
            if(root==null){
                root=new Node(val);
                return root;

            }
            if(root.data>val){
                root.left=insert(root.left,val);
            }else{
                root.right=insert(root.right,val);
            }
            return root;
        }
        public static void inOrder(Node root){
            if(root==null){
                return;
            }
            inOrder(root.left);
            System.out.print(root.data);
            inOrder(root.right);
        }
    public static Node deleteNode(Node root, int val) {
        if (root == null) return null;

        if (root.data > val) {
            root.left = deleteNode(root.left, val);
        } else if (root.data < val) {
            root.right = deleteNode(root.right, val);
        } else {
            // Case 1: No children
            if (root.left == null && root.right == null) {
                return null;
            }
            // Case 2: One child
            else if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            // Case 3: Two children
            else {
                Node IS = findInOrderSuccessor(root.right);
                root.data = IS.data;
                root.right = deleteNode(root.right, IS.data);
            }
        }
        return root;
    }

    public static Node findInOrderSuccessor(Node root){
            while(root.left!=null){
                root=root.left;
            }
            return root;
        }

        public static void main(String[] args) {
            int [] values={5,1,3,4,2,7};
            Node root=null;
            for(int i=0;i<values.length;i++){
                root = insert(root, values[i]); // update root
            }
            inOrder(root); // now prints sorted order
            deleteNode(root,3);
            System.out.println();
            inOrder(root);
        }
}
