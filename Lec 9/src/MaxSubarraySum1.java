public class MaxSubarraySum1 {
    public static void calSubarrayMaxSum(int [] nums){
        int n=nums.length;
        int currSum=0;
        int maxSum=nums[0];
        int []prefix=new  int[n];
        int m= prefix.length;
        prefix[0]=nums[0];
        for(int i=1; i<m;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                currSum = i==0 ? prefix[j]: prefix[j]-prefix[i-1];
                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println("Max sum="+maxSum);
    }

    public static void main(String[] args) {
        int [] arr={ 2,4,6,8,10};
        calSubarrayMaxSum(arr);
    }
}
