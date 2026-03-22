import java.util.Arrays;

public class Question108 {
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
    public static Node buildBST(int nums[],int start,int end){
        if(start>end){
            return null;
        }
        int mid=(start+end)/2;
        Node root=new Node(nums[mid]);
        root.left=buildBST(nums,0,mid-1);
        root.right=buildBST(nums,mid+1,end);
        return root;
    }
    public static Node  sortedArrayToBST(int nums[]){
        Arrays.sort(nums);
       return buildBST(nums,0,nums.length-1);

    }

    public static void main(String[] args) {
        int [] nums={-10,-3,0,5,9};
        System.out.println(sortedArrayToBST(nums));
    }
}
