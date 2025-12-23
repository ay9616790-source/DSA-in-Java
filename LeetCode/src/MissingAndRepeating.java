import java.util.ArrayList;
import java.util.Arrays;

public class MissingAndRepeating {

    public static ArrayList<Integer> missingAndRepeating(int arr[]) {

        ArrayList<Integer> result = new ArrayList<>();
        Arrays.sort(arr);
        int n = arr.length;

        long SumN = (long) n * (n + 1) / 2;
        long sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {

                int repeating = arr[i];
                int missing = (int) (SumN - sum + arr[i]);

                result.add(repeating);
                result.add(missing);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 6, 2, 1, 1};
        System.out.println(missingAndRepeating(arr));
    }
}
