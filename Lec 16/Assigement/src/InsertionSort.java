public class InsertionSort {
    public static void SortDec(int [] arr){
        for(int i=0;i<arr.length;i++){
            int cur=arr[i];
            int prv=i-1;
            while(prv>=0 && arr[prv]<cur){
                arr[prv+1]=arr[prv];
                prv--;
            }
            arr[prv+1]=cur;
        }
        for(int elem : arr){
            System.out.print(elem+" ");
        }
    }
    public static void main(String[] args) {
        int [] arr={3,6,2,1,8,7,4,5,3,1};
        SortDec(arr);
    }

}
