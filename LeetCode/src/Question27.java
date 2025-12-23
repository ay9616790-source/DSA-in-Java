public class Question27 {
    public static int removeElement(int [] nums,int val){
       int k=1;
       if(nums.length==0){
           return 0;
       }
       for(int i=1;i< nums.length;i++){
           if(val==nums[i]){
               nums[i]=nums[i-1];
               k++;
           }
       }
       return k;
    }
    public static void main(String[] args) {
        int [] nums={0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println( removeElement(nums,val));
    }
}
