public class SelectionSort {
    public static void main(String[] args) {
        int arr[]= {13,46,24,52,20,9};

        for(int i=0;i<arr.length-1;i++){
            int minIndex=i;  //assume current index has the smallest
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j; //update index of smallest element

                }
            }
            // swap arr[i] and arr[minIndex]
            int temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;

        } //print shorted array
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

}
