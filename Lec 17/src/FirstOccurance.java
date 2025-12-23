public class FirstOccurance {
    public static int  FirstOccurance(int[] arr,int i,int key){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }

        return FirstOccurance(arr,i+1,key );
    }
    public static void main(String[] args) {
        int []n={1,2,6,9,18};
        int key=9;

        System.out.println(FirstOccurance(n,0,key));
    }
}
