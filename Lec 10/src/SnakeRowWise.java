public class SnakeRowWise {
    public static void printSnake(int [][] arr){
//        int start=0;
//        int end= arr.length-1;
        for (int i = 0; i < arr.length; i++) {
            // For even rows → left to right
            if (i % 2 == 0) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            // For odd rows → right to left
            else {
                for (int j = arr[i].length - 1; j >= 0; j--) {
                    System.out.print(arr[i][j] + " ");
                }
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
        printSnake(arr);
    }
}
