 //Take a matrix as input from the user.Search for a
// given number x and print the indices at which it occurs


 import java.util.Scanner;

 public class Array1{
     public static void main(String[] args) {

             Scanner sc=new Scanner(System.in);
             System.out.println("Enter the col and row");
             int row=sc.nextInt();
             int col=sc.nextInt();
             int [][] number=new int[row][col];
             //input
             for(int i=0;i<row;i++){
                 for(int j=0;j<col;j++){
                     number[i][j]=sc.nextInt();
                 }
             }


             //output
             for(int i=0;i<row;i++){
                 for(int j=0;j<col;j++){
                     System.out.print(number[i][j] +" ");
                 }
                 System.out.println();
             }
         //Serach x
         System.out.println("Enter you x number:");
         int x =sc.nextInt();
         boolean found=true;
         for(int i=0;i<row;i++){
             for(int j=0;j<col;j++){
                 if(number[i][j]==x) {
                     System.out.println(x + " found at (row=" + (i + 1) + ", col=" + (j + 1) + ")");
                    found=true;
                 }
             }
         }
         if(!found){
             System.out.println(x+"not found in the matrix");
         }

     }
 }
