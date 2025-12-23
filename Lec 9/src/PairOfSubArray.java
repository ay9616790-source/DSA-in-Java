public class PairOfSubArray {
    public static void subArray(int [] nums){
        int n = nums.length;
        int tp = 0;             // total number of subarrays
        int totalSum = 0;       // sum of all subarray elements

        for(int i = 0; i < n; i++){
            int start = i;
            for(int j = i; j < n; j++){
                int end = j;
                int sum = 0;   // reset sum for each subarray
                for(int k = start; k <= end; k++){
                    System.out.print(nums[k] + " ");
                    sum += nums[k];  // add element value
                }
                tp++;
                totalSum += sum;  // accumulate to global total sum
                System.out.print(" -> Sum = " + sum);
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total no. of subarrays = " + tp);
        System.out.println("Total sum of all subarrays = " + totalSum);
    }

    public static void main(String[] args) {
        int [] nums = {2, 4, 8, 9, 10};
        subArray(nums);
    }
}
