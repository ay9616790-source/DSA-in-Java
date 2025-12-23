public class CountInversions {

    public static int countInversions(int[] arr) {
        int count = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {       // i from 0 to end
            int j = n - 1;                 // reset j every time

            while (j > i) {                // ensure i < j
                if (arr[i] > arr[j]) {
                    count++;
                }
                j--;                       // move backward
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 1, 3, 5};
        System.out.println(countInversions(arr));
    }
}
