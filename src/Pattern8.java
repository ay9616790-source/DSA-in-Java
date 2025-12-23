public class Pattern8 {
    public static void main(String[] args) {
        int n = 5; // number of rows
        int number = 1; // starting number

        for (int i = 1; i <= n; i++) { // rows
            for (int j = 1; j <= i; j++) { // numbers per row
                System.out.print(number + " ");
                number++;
            }
            System.out.println(); // move to next line
        }
    }
}

