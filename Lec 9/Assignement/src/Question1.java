public class Question1 {
    public static boolean ReapetedNumber(int [] nums) {
        int n = nums.length;
        for (int i = 0; i < n-1; i++) {
            int j=0;
            if (nums[i] == nums[j+1]) {
                j=i;

            }

            return true;

        }
        return false;
    }

    public static void main(String[] args) {
        int[] number={1,2,3,4};
        System.out.println(ReapetedNumber(number));

    }
}
