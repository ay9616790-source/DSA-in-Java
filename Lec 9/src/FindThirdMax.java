public class FindThirdMax {
    public static int findMax(int nums []){
        int max=nums[0];
        int n=nums.length;
        int secmax=nums[0];
//        int thirdmax=nums[0];
        for(int i=0;i<=n;i++){
            if(nums[i]>max){
                max=nums[i];
            }
            if(nums[i]>secmax && nums[i]!=max){
                secmax=nums[i];
            }

//            if(nums[0]>thirdmax && thirdmax<secmax){
//                thirdmax=nums[i];
//                System.out.println(thirdmax);
//
//            }
        }
        return secmax;

    }

    public static void main(String[] args) {
        int [] nums={12,20,25,23,30,40,90};
       int result= findMax(nums);
        System.out.println(+result);
    }
}
