public class Question35 {
    public static int searchInsert(int [] nums,int target){
        int idx=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>=target && nums[i+1]<=target){
                idx +=i;
            }
        }
        return idx;
    }
    public static void main(String[] args) {
        int [] nums={1,3,5,6};
        int target=2;
        System.out.println(searchInsert(nums,target));
    }
}
