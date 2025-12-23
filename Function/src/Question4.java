import java.util.Scanner;

public class Question4 {
     public static double  Circle(int r){

         return 2 * 3.14 * r;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius of circle");
        int radius=sc.nextInt();
        double result=Circle(radius);
        System.out.println("The circumference of the circle is:"+result);
    }

}
