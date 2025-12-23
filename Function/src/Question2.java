
import java.util.Scanner;

public class Question2 {
    public static int sum(int a){
        int sum=0;
        for(int i=0;i<=a;i++){
            if(i%2 !=0){
                sum +=i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number:");
        int num=sc.nextInt();
        int result=sum(num);
        System.out.println("Sum of odd numbers from 1 to"+ num +"= " +result);

    }
}
