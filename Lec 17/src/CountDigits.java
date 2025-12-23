public class CountDigits {
    public static int countDigits(int n) {
        // Base case
        if (n == 0) {
            return 0;
        }

        // Recursive case
        return 1 + countDigits(n / 10);
    }

    public static void main(String[] args) {
        int n = 1234;
        System.out.println(countDigits(n)); // Output: 4
    }
}
