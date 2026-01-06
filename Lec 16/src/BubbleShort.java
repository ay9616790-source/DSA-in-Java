import java.util.Arrays;
import java.util.Scanner;

public class BubbleShort {
    public static  void printArray(int num[]){
        for(int i=0;i< num.length;i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int size=sc.nextInt();
        int [] num=new int[size];
        for(int i=0;i<size;i++){
            num[i]=sc.nextInt();

        }
        for(int i=0;i< num.length-1;i++){
            for(int j=0;j< num.length-i-1;j++){
                if(num[j]>num[j+1]){
                    int temp=num[j];
                    num[j]=num[j+1];
                    num[j+1]=temp;
                }
            }
        }
      printArray(num);
    }
}
