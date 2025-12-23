public class SelectionSort {
    public static void sortDec(int []arr){
        for(int i=0;i< arr.length-1;i++){
            int maxElem=Integer.MIN_VALUE;
            int idx=-1;
            for(int j=i+1;j< arr.length;j++){
                if(arr[j]>maxElem){
                    maxElem=arr[j];
                    idx=j;
                }

            }
            int temp=arr[i];
            arr[i]=arr[idx];
            arr[idx]=temp;

        }
        for(int elem :arr){
            System.out.print(elem+" ");
        }
    }
    public static void main(String[] args) {
        int [] arr={3,6,2,1,8,7,4,5,3,1};
        sortDec(arr);
    }
}
