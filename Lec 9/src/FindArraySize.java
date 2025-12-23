import java.util.Scanner;

public class FindArraySize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // take array size
        int size = sc.nextInt();
        int[] number = new int[size];

        // input array elements
        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
        }

        // print array


        // search element
        System.out.println("Enter the number to find:");
        int x = sc.nextInt();



        for (int i = 0; i < number.length; i++) {
            if (number[i] == x) {
                System.out.println("Your number exists at index " + i);
            }
        }
    }
}



