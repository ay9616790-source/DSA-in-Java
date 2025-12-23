public class ReverseAnArray {
    public static void arrayReverse(int [] arr) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        int i =0,j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        System.out.println(arr);
    }

    public static void main(String[] args) {
        int []num={5,6,9,4,2,3};
        arrayReverse(num);

    }
}
