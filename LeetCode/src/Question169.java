public class Question169 {
    public static int SearchNum(int []nums){
        int maxCount=0;
        int maxNum=nums[0];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;


            // Inner loop to count occurrences of arr[i]
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }

            // Update max if this number repeats more
            if (count > maxCount) {
                maxCount = count;
                maxNum = nums[i];
            }
        }
        return maxNum;
    }
    public static void main(String[] args) {
   int [] nums={2,2,1,1,1,2,2};
        System.out.println( SearchNum(nums));
    }
}
