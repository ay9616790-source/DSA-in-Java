import java.util.*;

public class ReverseKElem {
    public static Queue<Integer> reverseKElem(Queue<Integer> q, int k) {

        // If queue is empty or k is invalid → just return queue
        if (q == null || q.isEmpty() || k <= 0 || k > q.size()) {
            return q;
        }

        Stack<Integer> s = new Stack<>();

        // Step 1: Push first k elements into stack
        for (int i = 0; i < k; i++) {
            s.push(q.remove());
        }

        // Step 2: Pop from stack and add back to queue
        while (!s.isEmpty()) {
            q.add(s.pop());
        }

        // Step 3: Move remaining elements to the back
        int size = q.size();
        for (int i = 0; i < size - k; i++) {
            q.add(q.remove());
        }

        return q;



}
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);
        q.add(80);
        q.add(90);
        q.add(100);

        System.out.println(reverseKElem(q,4));

    }
}
