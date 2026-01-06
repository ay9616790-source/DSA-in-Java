import java.util.Scanner;

public class CheckPrime {

    // Function to check prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false; // numbers <= 1 are not prime
        }

        // check divisibility from 2 to sqrt(n)
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false; // divisible -> not prime
            }
        }
        return true; // no divisors found -> prime
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isPrime(num)) {
            System.out.println(num + " is Prime");
        } else {
            System.out.println(num + " is Not Prime");
        }
    }
}

