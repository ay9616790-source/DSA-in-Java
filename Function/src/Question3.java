import java.util.Scanner;

public class Question3 {
    public static int greater(int a,int b){
        if(a>b ) {
            return a;
        }else {
                return b;
            }
        }


    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter your 1 num");
        int num1=sc.nextInt();
        System.out.println("Enter your 2 num");
        int num2=sc.nextInt();
        int result=greater(num1,num2);
        System.out.println(" The is greater than"+result);

    }
}
