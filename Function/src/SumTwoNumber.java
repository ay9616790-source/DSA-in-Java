import java.util.Scanner;

public class SumTwoNumber {
    public  static int CalculaterSum(int a,int b){

        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your first number");
        int a=sc.nextInt();
        System.out.println("Enter your sec number");
        int b=sc.nextInt();
        int result=CalculaterSum(a,b);
        System.out.println(result);
    }
}
