import java.util.Scanner;

public class HwToggleBit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


                // Input the number
                System.out.print("Enter number (n): ");
                int n = sc.nextInt();

                // Input the position
                System.out.print("Enter bit position to toggle: ");
                int pos = sc.nextInt();

                // Step 1: Create bitmask
                int bitMask = 1 << pos;

                // Step 2: Toggle using XOR
                int result = n ^ bitMask;

                // Output
                System.out.println("Number before toggle: " + n);
                System.out.println("Number after  toggle: " + result);



    }
}
