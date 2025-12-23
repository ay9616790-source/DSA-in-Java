public class RowWithMaxSum {
    public static int MaxSumRow(int [][ ]arr){
        int MaxRow=-1;
        int MaxRowSum=Integer.MIN_VALUE;

       for(int i=0;i<arr.length;i++){
           int Sum =0;
           for(int j=0;j<arr[0].length;j++){
               Sum +=arr[i][j];

           }
           if(MaxRowSum<Sum){
               MaxRowSum=Sum;
              MaxRow=i;

           }

       }
       return MaxRow;
    }
    public static void main(String[] args) {
        int[][] arr = {
                {1,  2,  3,  4},
                {5,  6,  7,  8},
                {9, 10, 11, 12},
                {13,14, 15, 16}
        };
        System.out.println(MaxSumRow(arr));
    }
}
