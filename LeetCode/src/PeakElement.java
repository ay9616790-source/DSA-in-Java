public class PeakElement {
    public static boolean findPeakElem(int[] arr) {
        int L = 0;
        int R = 1;
        int n = arr.length;

        while (R < n - 1) {
            if (arr[L] < arr[R] && arr[R] > arr[R + 1]) {
                return true;
            }
            L++;
            R++;
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[]={1, 2, 4, 5, 7, 8, 3};
        System.out.println(findPeakElem(arr));

    }
}
