public class MaxSubarraySum {
    public static void CalMaxSum(int [] nums){
        int n= nums.length;
        int currSum=0;
        int Max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
//            int start=i;
            for(int j=i;j<n;j++){
//                int end=j;
                 currSum=0;
                for(int k=i;k<=j;k++){
                    System.out.print(nums[k]+" ");
                    currSum +=nums[k];
                }
                System.out.println(" → Sum = " + currSum);
                if(currSum>Max){
                    Max=currSum;
                }
            }
            System.out.println();
        }
        System.out.println("Max Sum"+Max);
    }

    public static void main(String[] args) {
        int [] arr={2,4,6,8,10};
        CalMaxSum(arr);
    }
}
