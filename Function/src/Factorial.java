import java.util.Scanner;

public class Factorial {
    public static void calculateFactorial(int a){
        if(a<0){
            System.out.println("Invalid number");
        }
        int factorial=1;
        for(int i=a; i>=1;i--){
            factorial = factorial*i;
        }
        System.out.println(factorial);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        calculateFactorial(a);

    }
}
