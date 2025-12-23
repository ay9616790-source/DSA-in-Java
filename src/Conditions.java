import java.sql.SQLOutput;
import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age=sc.nextInt() ;
        if(age>18 ){
            System.out.println("Your Are Adult");
        }
        else{
            System.out.println("Your are a child");
        }
    }
}
