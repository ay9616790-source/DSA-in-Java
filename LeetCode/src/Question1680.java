public class Question1680 {
    static final int MOD = 1_000_000_007;

    public static int binary(int n) {
        long ans = 0;   // string ki jagah number
        int i = 1;

        while (i <= n) {

            // 🔹 bits count (same as binary length)
            int bits = 0;
            int m = i;
            while (m != 0) {
                bits++;
                m >>= 1;   // m = m / 2
            }

            // 🔹 concatenate binary using bit manipulation
            ans = ((ans << bits) | i) % MOD;

            i++;
        }
        return (int) ans;
    }

    public static void main(String[] args) {
        int n=3;
        System.out.println(binary(n));
    }
}
