import java.util.Scanner;

public class UpdateBits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //oper is 1 for Set bit
        //per is 0 for clear bit
        int n=5;
        int pos=1;

        int oper=sc.nextInt();
        int bitmask=1<<pos;
        if(oper ==1){
            int newNumber=bitmask | n;
            System.out.println(newNumber);
        } else if (oper ==0) {
             int notOperator=~bitmask;
             int newNumber=notOperator & n;
            System.out.println(newNumber);
        }else{
            System.out.println(" Invalid Oper");
        }

    }
}
