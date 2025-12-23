import java.util.Arrays;

public class Question238 {
    public static int[] productMul(int [] nums){
        int product=1;
        int res[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i!=j){
                    product=product*nums[j];

                }
            }
            res[i]=product;
        }
        return res;
    }
    public static void main(String[] args) {
        int []nums={10,20,30,40,50};

        System.out.println( productMul(nums));
    }
}
