public class BinarySearch1 {
    public static int findTargetIndex(int [] nums,int target){
        int idx=0;
        int left=0;
        int rigth=nums.length-1;
        while(left<=rigth) {
            int mid=(left+rigth)/2;

                if(nums[mid]==target){
                    idx=mid;
                    break;

                }
                if(nums[mid]>target){
                    rigth =mid-1;
               }
                else if (nums[mid]<target){
                    left =mid+1;
                }

            }

        return idx;

    }

    public static void main(String[] args) {
        int [] num={1,20,30,40,50};
        System.out.println(findTargetIndex(num,50));
    }
}
