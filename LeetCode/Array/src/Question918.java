public class Question918 {
    public static int maxSubarraySumCircular(int[] nums) {
        int s1=0;
        int s2=2;

        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        while(s1!=s2){
            sum += nums[s1];
            maxSum = Math.max(maxSum, sum);

            if (sum < 0) {
                sum = 0;
            }
            if(s1==nums.length) {
                s1 = (s1 + 1) / nums.length;
                s2 = (s2 + 1) / nums.length;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int [] nums={1,-2,3,-2};
        System.out.println(maxSubarraySumCircular(nums));

    }
}
