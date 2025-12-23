import java.util.*;

public class SortArrayBuilt {
    public static void print(int [] arr){
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        Arrays.sort(arr);


    }

    public static void main(String[] args) {
        int [] nums={10,-4,5,0,69,23,};
        print(nums);
        print(nums);

    }
}
