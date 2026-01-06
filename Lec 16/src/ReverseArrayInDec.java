public class ReverseArrayInDec {
    public static int[] ReverseByBubbleShort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int sort = 0;
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] < nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    sort++;
                }
            }
            if (sort == 0) {
                break;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int n[] = {5, 6, 9, 7, 9};
        int[] result = ReverseByBubbleShort(n);
        for (int val : result) {
            System.out.print(val);
        }


    }
}
