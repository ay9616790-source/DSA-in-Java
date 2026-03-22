import java.util.ArrayList;

public class Question100 {
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
    public static ArrayList<Integer> getInorder(Node root,ArrayList<Integer> arr){
        if(root==null){
            return null;
        }
          getInorder(root.left,arr);
          arr.add(root.data);
          getInorder(root.right,arr);
          return arr;
    }
    public static boolean isSameTree(Node  p, Node q){

        ArrayList<Integer> arr1=new ArrayList<>();
      getInorder(p,arr1);
      ArrayList<Integer> arr2=new ArrayList<>();
      getInorder(q,arr2);
      if(arr1.size()!=arr2.size()){
          return false;
      }
      for(int i=0;i<arr1.size();i++){
          if(arr1.get(i)!=arr2.get(i)){
              return false;
          }
      }
      return true;
    }
    public static void main(String[] args) {
        Node root1=new Node(1);
        root1.left=new Node(2);
        root1.right=new Node(3);

        Node root2=new Node(1);
        root2.left=new Node(2);
        root2.right=new Node(1);
        System.out.println(isSameTree(root1,root2));

    }
}
