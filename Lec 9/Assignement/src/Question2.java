public class Question2 {
    public static int CheckTarget(int [] nums,int d,int target){
        int n=nums.length;

        for(int i=0;i<=d/2;i++){
            int temp=nums[i];
            nums[i]=nums[d-i-1];
            nums[d-i-1]=temp;

        }
        for (int left = d, right = n - 1; left < right; left++, right--) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
        }
        for(int i=0;i<n/2;i++){
            int temp=nums[i];
            nums[i]=nums[n-1-i];
            nums[n-i-1]=temp;
            if(nums[i]==target){
                return i;
            }
        }

//        for(int elem:nums){
//            System.out.print(elem);
//        }
        return -1;

    }

    public static void main(String[] args) {
        int [] arr={0,1,2,4,5,6,7};
        int traget=0;
        int d=3;
        System.out.println(CheckTarget(arr,d,traget));
    }
}
