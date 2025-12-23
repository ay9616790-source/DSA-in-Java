public class MaxSubarraySum2 {
    public static void kadanes(int [] nums){
        int n=nums.length;
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            currSum +=nums[i];
            if(currSum<0){
                currSum=0;
            }
            maxSum=Math.max(currSum,maxSum);
        }

        System.out.println(" Max sum is="+maxSum);
    }

    public static void main(String[] args) {
        int [] arr={-2,-3,4,-1,-2,1,5,-3};
        kadanes(arr);

    }
}
