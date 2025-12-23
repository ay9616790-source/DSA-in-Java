  //Print the sum of first n Natural Numbers.

  import java.util.Scanner;

  public class Question1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number: ");
        int n =sc.nextInt();
       int sum=0;
        for (int i=1;i<=n;i++){

           sum =sum+i;

        }
        System.out.println(sum);


    }
}
