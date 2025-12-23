import java.util.Scanner;

public class PrintEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number:");
        int num=sc.nextInt();


            if(num % 2==0){
                System.out.println("Your" +num+ " is even");
            }
            else{
                System.out.println("Your"+num+ " is odd");
            }



    }
}
