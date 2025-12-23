import java.util.Arrays;

public class FindSecMax {
    public static void secMax(int [] nums){
        int max=Integer.MIN_VALUE;
        int sMax=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++) {
            if (nums[i] > max ) {
                max=nums[i];

            }
        }
        for(int i=0;i<nums.length;i++) {
            if (nums[i] > sMax && nums[i]!=max) {
                sMax=nums[i];

            }
        }
        System.out.println("Sec max number is:"+sMax);
        System.out.println();


    }

    public static void main(String[] args) {
        int [] arr={25,36,69,78,99,99};
        secMax(arr);


    }
}
