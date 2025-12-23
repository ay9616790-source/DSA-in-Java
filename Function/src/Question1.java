import java.util.Scanner;

public class Question1 {
    public static double Average( int a,int b,int c){
        int average=(a+b+c)/3;
        return average;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your first number:");
        int num1=sc.nextInt();
        System.out.println("Enter your sec number:");
        int num2=sc.nextInt();
        System.out.println("Enter your third number:");
        int num3=sc.nextInt();
        double avg=Average(num1,num2,num3);
        System.out.println("Average of three numbers="+avg);

    }
}
