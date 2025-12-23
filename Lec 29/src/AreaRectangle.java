import java.util.Stack;

public class AreaRectangle {
    public static void MaxArea(int arr[]) {
        int n = arr.length;
        int maxArea = 0;

        int[] nsr = new int[n];
        int[] nsl = new int[n];

        Stack<Integer> s = new Stack<>();

        // NSR (Next Smaller Right)
        for (int i = n - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            nsr[i] = s.isEmpty() ? n : s.peek();
            s.push(i);
        }

        // clear stack for NSL
        s.clear();

        // NSL (Next Smaller Left)
        for (int i = 0; i < n; i++) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            nsl[i] = s.isEmpty() ? -1 : s.peek();
            s.push(i);
        }

        // Calculate Max Area
        for (int i = 0; i < n; i++) {
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1;
            int currArea = height * width;
            maxArea = Math.max(maxArea, currArea);
        }

        System.out.println("Max Area is " + maxArea);
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 6, 2, 3};
        MaxArea(arr);
    }
}
