public class PrintDigit {
    public static void printDigit(int n) {
        String s = Integer.toString(n);
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i));
            count += s.charAt(i) - '0'; // convert char to int
        }

        System.out.println();
        System.out.println(count);
    }

    public static void main(String[] args) {
        int n = 15469;
        printDigit(n);
    }
}
