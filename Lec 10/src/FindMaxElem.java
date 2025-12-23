public class FindMaxElem {
    public static int MaxElem(int [][]arr){
        int maxElement=Integer.MIN_VALUE;
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]>maxElement){
                    maxElement=arr[i][j];
                }
            }
        }
        return maxElement;
    }
    public static void main(String[] args) {
        int[][] arr = {
                {1,  2,  3,  4},
                {5,  20,  7,  8},
                {9, 10, 11, 12},
                {13,14, 15, 16}
        };
        System.out.println(MaxElem(arr));
    }
}
