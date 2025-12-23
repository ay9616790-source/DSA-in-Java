import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number:");
        int num=sc.nextInt();
        int Table=1;
        for(int i=1;i<=10;i++){
            Table=num*i;
            System.out.println(Table);

        }


    }

}
