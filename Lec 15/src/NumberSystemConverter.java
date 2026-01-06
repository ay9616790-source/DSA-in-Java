import java.util.Scanner;

public class NumberSystemConverter {

    // Function to convert Decimal → Binary
    public static String decimalToBinary(int n) {
        StringBuilder binary = new StringBuilder();

        // Divide by 2 and collect remainders
        while (n > 0) {
            int remainder = n % 2;
            binary.append(remainder);  // append remainder
            n = n / 2;                 // divide by 2
        }

        // Binary is formed in reverse order → reverse it
        return binary.reverse().toString();
    }

    // Function to convert Binary → Decimal
    public static int binaryToDecimal(String bin) {
        int decimal = 0;
        int power = 0; // position from right

        // Traverse from rightmost digit to left
        for (int i = bin.length() - 1; i >= 0; i--) {
            char bit = bin.charAt(i);

            if (bit == '1') {
                decimal += Math.pow(2, power);
            }
            power++;
        }

        return decimal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Decimal to Binary
        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();
        String binary = decimalToBinary(decimal);
        System.out.println("Binary: " + binary);

        // Binary to Decimal
        System.out.print("Enter a binary number: ");
        String bin = sc.next();
        int dec = binaryToDecimal(bin);
        System.out.println("Decimal: " + dec);

        sc.close();
    }
}

