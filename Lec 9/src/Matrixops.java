public class Matrixops {

        public static void main(String[] args) {
            int[][] A = {{1, 2, 3}, {4, 5, 6}};
            int[][] B = {{7, 8, 9}, {1, 2, 3}};


            // Addition (same size)
            System.out.println("Addition of A + B:");
            for (int i = 0; i < A.length; i++) {
                for (int j = 0; j < A[0].length; j++) {
                    System.out.print((A[i][j] + B[i][j]) + " ");
                }
                System.out.println();
            }

            // Multiplication (cols of A = rows of C)
            System.out.println("\nMultiplication of A x B:");
            int[][] result = new int[A.length][B[0].length];
            for (int i = 0; i < A.length; i++) {
                for (int j = 0; j < B[0].length; j++) {
                    for (int k = 0; k < B.length; k++) {
                        result[i][j] += A[i][k] * B[k][j];
                    }
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        }


}
