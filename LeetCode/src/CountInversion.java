public class CountInversion {
    public static int countInverse(int []arr){
        int count=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr={2,4,1,3,5};
        System.out.println(countInverse(arr));
    }
}
