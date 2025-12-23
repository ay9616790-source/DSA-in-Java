import java.util.Scanner;

public class Question5 {
    public static void  vote(int age){
        if(age>=18){
            System.out.println("Eligible for vote");
        }else if(age<18 && age>0){
            System.out.println("You are not eligilbe for vote");
        }else{
            System.out.println("Invaild age");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age :=");
        int age=sc.nextInt();
        vote(age);
    }
}
