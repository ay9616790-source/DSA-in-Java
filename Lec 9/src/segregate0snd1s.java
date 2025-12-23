public class segregate0snd1s {
    public static void print(int[] arr){
        int n= arr.length;
        int Zeroes=0;
        int i=0,j=n-1;
        while(i<j)
        for( i=0;i<n;i++){
            if (arr[i]==Zeroes) {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;

            }

        }
        System.out.println(arr);
    }

    public static void main(String[] args) {
        int [] arr={0,0,1,1,0};
        print(arr);
    }
}
