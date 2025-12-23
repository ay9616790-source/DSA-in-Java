public class IndexesofSubarraySum {
    public static  void findSum(int arr[],int taregt){


       for(int i=0;i< arr.length;i++){
           int sum=0;
           for(int j=i;j<arr.length;j++){
            sum +=arr[j];
           }
           if(sum==taregt){

           }
       }




    }
    public static void main(String[] args) {
        int arr[]={1,2,3,7,5,};
        int target=15;
        System.out.println();
        findSum(arr,target);
    }
}
