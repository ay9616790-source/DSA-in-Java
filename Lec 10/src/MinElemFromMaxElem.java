public class MinElemFromMaxElem {
    public static void MinElem(int [][]arr){
        int maxElem=Integer.MIN_VALUE;
        int [] result=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++) {
                if (arr[i][j] > maxElem) {
                    maxElem = arr[i][j];
                }
            }
//            System.out.println(maxElem);
            result[i]=maxElem;
        }
        int minVal=Integer.MAX_VALUE;
        for(int i=0;i< result.length;i++){
            if(result[i]<minVal){
                minVal=result[i];
            }
        }
        System.out.println(minVal);

    }
    public static void main(String[] args) {
        int[][] arr = {
                {1,  2,  3,  4},
                {5,  6,  7,  8},
                {9, 10, 11, 12},
                {13,14, 15, 16}
        };
        MinElem(arr);

    }
}
