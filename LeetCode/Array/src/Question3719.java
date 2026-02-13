import java.util.*;
public class Question3719 {
    public static int longestBalanced(int[] nums){
        int maxLen=0;
        HashSet<Integer> even=new HashSet<>();
        HashSet<Integer> odd=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            even.clear();
            odd.clear();
            for(int j=i;j<nums.length;j++){
                if(nums[j]%2==0){
                    even.add(nums[j]);
                }else{
                    odd.add(nums[j]);

                }
                if(even.size()==odd.size()){
                    maxLen=Math.max(maxLen,j-i+1);
                }

            }
        }
        return maxLen;

    }
    public static void main(String[] args) {
        int [] nums={3,2,2,5,4};
        System.out.println(longestBalanced(nums));
    }
}
