import java.util.Scanner;

public class HwCheckPow2 {
    public static boolean Powerof2(int n){
        if(n<=0) return false;
        /*n=10000(16)
        n-1=01111(15)
            n &(n-1)=10000 & 01111=00000 =>True*/
        return (n&(n-1)) ==0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(Powerof2(num)){
            System.out.println("is a power of 2");
        }else{
            System.out.println("Not a power of 2");
        }

    }
}
