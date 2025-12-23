import java.util.Scanner;

public class Question6 {
    public static void checkNumber(double num){
        if (num>=1){
            System.out.println("Positive number "+num);
        } else if (num<0) {
            System.out.println("Negative number "+num);
        }else{
            System.out.println(" Your number is zero"+num);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number :");
        double number =sc.nextDouble();
        checkNumber(number);
    }
}
