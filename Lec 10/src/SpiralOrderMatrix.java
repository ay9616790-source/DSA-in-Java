import java.util.Scanner;

public class SpiralOrderMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row");
        int row=sc.nextInt();
        System.out.println("Enter the col");
        int col =sc.nextInt();
        int[][]matrix=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("The special order matrix is");
        int rowStart=0;
        int rowEnd= row-1;
        int colStart=0;
        int colEnd=col-1;
        while(rowStart<=rowEnd && colStart<=colEnd){
            for(int n=colStart;n<=colEnd;n++){
                System.out.print(matrix[rowStart][n]+" ");
            }
            rowStart++;

            for(int m=rowStart;m<=rowEnd;m++){
                System.out.print(matrix[m][colEnd]+" ");
            }
            colEnd--;
            for(int m=colEnd;m>=colEnd;m--){
                System.out.print(matrix[rowEnd][m]+" ");
            }
            rowEnd--;
            for(int n=rowEnd;n>=rowStart;n--){
                System.out.print(matrix[n][colStart]+" "  );
            }
            colStart++;
            System.out.println();

        }


    }

}
