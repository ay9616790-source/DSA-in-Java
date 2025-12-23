import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int size=sc.nextInt();
        int [] number=new int[size];

//        Input the array elemts
        for(int i=0;i<=size;i++){
             number[i]=sc.nextInt();
        }
//        Declared tha array size
        for(int i=0;i<size;i++){
            System.out.println(number[i]);
        }


//        for(int i=0;i<3;i++){
//            System.out.println(number[i]);
//        }
    }
}
