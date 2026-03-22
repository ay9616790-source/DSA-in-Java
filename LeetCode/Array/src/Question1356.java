import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Question1356 {
    public static int[] sortByBits(int[] arr){
        int n= arr.length;
       List<int[]> list=new ArrayList<>();
       for(int a:arr){
           int count=Integer.bitCount(a);
           list.add(new int[]{a,count});
       }
        Collections.sort(list, (a, b) ->
                a[1] != b[1] ? a[1] - b[1] : a[0] - b[0]
        );
       int res[]=new int[n];
       for(int i=0;i<list.size();i++){
           res[i]=list.get(i)[0];
       }
       return res;

    }
    public static void main(String[] args) {
        int [] arr={0,1,2,3,4,5,6,7,8};


            int[] result = sortByBits(arr);

            System.out.println(Arrays.toString(result));

    }
}
