import java.util.Scanner;

public class PrintNumber5to1 {
    public static void printNum(int num){

        if(num ==6){
            return;
        }
        System.out.print(num);
        printNum(num+1);
    }

    public static void main(String[] args) {
        int n=1;
        printNum(n);
    }
}
