import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row");
        int n=sc.nextInt();
        System.out.println("Enter col");
        int m=sc.nextInt();
        int[][] matrix=new int[n][m];
//        / input the matrix
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               matrix[i][j]=sc.nextInt();
            }

        }
        System.out.println("Transpose Matrix is:");
        for(int j=0;j<m;j++){
            for(int i=0;i<n;i++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        //for(int i=0;i<n;i++){
        // for(int j=0;j<m;j++){
//        int temp=arr[i][j];
//        arr[i][j]=arr[j][i];
//        arr[j][i]=temp;


    }
}
