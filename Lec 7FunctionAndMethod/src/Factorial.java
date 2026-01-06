import java.util.Scanner;

public class Factorial {
    public static void CalculatrFactorial( int num){
        if(num<=0){
            System.out.println("Invalid number");
            return;
        }
        int factorial=1;
      for(int i=num;i>=1;i--){
          factorial=factorial*i;
      }
        System.out.println(factorial);
        return ;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        CalculatrFactorial(n);
    }
}
