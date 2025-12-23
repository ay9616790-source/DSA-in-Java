public class BinarySearch {
    public static int search(int [] num,int key){
        int n= num.length;
        int start=0;
        int end=n-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(num[mid]==key){
                return mid;
            }
            if(num[mid]<key){
                start=mid+1;

            }else{
                end=mid-1;

            }

        }
        return -1;

    }
    public static void main(String[] args) {
        int [] num={25,56,96,102,123,221,320};
        int key =320;
        System.out.println( "Index of key is"+search(num,key));
    }

}
