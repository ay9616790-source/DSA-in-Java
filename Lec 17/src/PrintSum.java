 //Print Sum of first n Natural num

 import java.util.Scanner;

 public class PrintSum {
    public static void PrintNum(int i,int n,int sum) {

        if (i == n) {
            sum +=i;
            System.out.println(sum);
            return;
        }
            sum +=i;
            PrintNum(i+1,n,sum);

    }

     public static void main(String[] args) {

         PrintNum(1,5,0);
     }



}
