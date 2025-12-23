import java.util.Arrays;

public class FindMissingNum {
    public static void print(int [] arr,int idx){
        int n= arr.length;
        Arrays.sort(arr); int i;
//        boolean found=true;
        for( i=0;i<n;i++){

            if(i+idx != arr[i]){
                System.out.print(i+idx);
                break;
           }
        }


//

    }
    public static void main(String[] args) {
        int [] num={1,8,9,2,3,5,6,7};
        int idx=1;

        Arrays.sort(num);
        print(num,idx);

    }
}
