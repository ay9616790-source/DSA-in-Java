public class PassingArrayToMethods {
    public static void printarr(int [] arr){
         arr[2]=-10;

    }

    public static void main(String[] args) {
        int [] nums={10,56,23,89,};
        System.out.println(nums[2]);
        printarr(nums);
        System.out.println(nums[2]);
    }
}
