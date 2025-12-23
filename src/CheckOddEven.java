import java.util.Scanner;

public class CheckOddEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int num=sc.nextInt();
        System.out.println(num);
        if(num%2==0){
            System.out.println("Number is even:"+num);
        }
        else{
            System.out.println("Number is odd"+num);
        }
    }
}
