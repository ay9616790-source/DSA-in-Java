public class ReverseAllRows {
    public static void ReverseRow(int [][]arr){
        for (int i = 0; i < arr.length; i++) {
            int start = 0;
            int end = arr[i].length - 1;

            // Reverse each row using two-pointer method
            while (start < end) {
                int temp = arr[i][start];
                arr[i][start] = arr[i][end];
                arr[i][end] = temp;
                start++;
                end--;
            }
        }
        // Print reversed matrix
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int[][] arr = {
                {1,  2,  3,  4},
                {5,  6,  7,  8},
                {9, 10, 11, 12},
                {13,14, 15, 16}
        };
        ReverseRow(arr);
    }
}
