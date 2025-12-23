public class Linearsearch {
    public static void searchElementInArray (int [] nums,int target){
        boolean found=false;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                found=true;
                break;
            }
        }
        if(found){
            System.out.println("Target is exit in array");
        }else{
            System.out.println("Target is not exit in array");
        }
    }

    public static void main(String[] args) {
    int [] arr={5,26,35,12,10,44,10};
    int n=11;
    searchElementInArray(arr,n);

    }
}
