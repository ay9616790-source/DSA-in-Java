public class RotateAnArrayMethod2 {
    public static void main(String[] args) {
        int [] arr={6,8,1,2,4,9,0};
        int n= arr.length;
        int d=5;
        for(int i=0;i<d/2;i++){
            int temp=arr[i];
            arr[i]=arr[d-1-i];
            arr[d-1-i]=temp;

        }
       for(int elem:arr){
           System.out.print(elem);
       }

    }
}
