import java.util.Scanner;


public class SelectionShort {



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
                int smallest=i;
                for(int j=i+1;j<num.length;j++){
                    if(num[smallest]>num[j]){
                        smallest=j;

                    }
                }
                int temp=num[smallest];
                num[smallest]=num[i];
                num[i]=temp;
            }
            printArray(num);
        }

}
