public class Buublesort {
    public static void SortDec(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int sort=0;
            for(int j=0;j< arr.length-1-i;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }  //if(sort==0)break;
        }
        for(int elem :arr){
            System.out.print(elem+" ");
        }
    }
    public static void main(String[] args) {
        int [] arr={3,6,2,1,8,7,4,5,3,1};
        SortDec(arr);

    }
}
