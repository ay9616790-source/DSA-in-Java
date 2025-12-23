import java.sql.SQLOutput;
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the any number from 1 to 3:");
        int button= sc.nextInt();
        switch(button){
            case 1: System.out.println("Numasta");
               break;
            case 2:
                System.out.println("Hello");
                break;
            case 3:
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("Invalid number");

        }
    }
}
