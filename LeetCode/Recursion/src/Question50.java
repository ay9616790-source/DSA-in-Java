public class Question50 {

        public static double findPow(double x, double n) {
            if (n == 0) return 1;
            return x * findPow(x, n - 1);


    }
    public static void main(String[] args) {
        double x=2.10000, n = 3;
        System.out.println(findPow(x,n));
    }
}
