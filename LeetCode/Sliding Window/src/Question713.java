public class Question713 {
    public static int numSubarrayProductLessThanK(int[] nums, int k){
        int i=0;

        int count=0;
        while(i<nums.length){
            int product=1;
            int j=i;
            while(j<nums.length){
                product=product*nums[j];
                if(product<k){
                    count++;
                }else{
                    break;
                }
                j++;
            }
            i++;
        }
        return count;
    }
    public static void main(String[] args) {
        int nums[]={1,2,3};
        int k=0;
        System.out.println(numSubarrayProductLessThanK(nums, k));
    }
}
