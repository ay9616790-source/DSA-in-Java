public class BinCoff {

    // function to calculate factorial
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;  // update factorial
        }
        return fact;
    }

    // function to calculate binomial coefficient
    public static int binCoeff(int n, int r) {
        int factN = factorial(n);
        int factR = factorial(r);
        int factNR = factorial(n - r);

        return factN / (factR * factNR);
    }

    public static void main(String[] args) {
        int n = 5;
        int r = 2;

        int result = binCoeff(n, r);
        System.out.println("Binomial Coefficient (" + n + "C" + r + ") = " + result);
    }
}
